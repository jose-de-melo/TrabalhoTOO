package jcms.too.avaliacaofisica.controller;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JComboBox;

import jcms.too.avaliacaofisica.arquivos.IndiceUsuario;
import jcms.too.avaliacaofisica.dados.ManipuladorDeDados;
import jcms.too.avaliacaofisica.graficos.GerarGraficos;
import jcms.too.avaliacaofisica.gui.IGExportarPDF;
import jcms.too.avaliacaofisica.modelo.Data;
import jcms.too.avaliacaofisica.modelo.Exercicio;
import jcms.too.avaliacaofisica.modelo.Usuario;
import jcms.too.avaliacaofisica.out.Mensagem;
import jcms.too.avaliacaofisica.pdf.GerarPDF;
import jcms.too.avaliacaofisica.utilitarios.Constantes;
import jcms.too.avaliacaofisica.utilitarios.Utilitarios;

import org.jfree.chart.JFreeChart;

/**
 * Classe usada para controlar os eventos de um {@link IGExportarPDF}.
 * 
 * @author Jos� do Carmo de Melo Silva
 *
 *@since 0.6
 */
public class ExportarController {
	
	/**
	 * Inicializa os campos, passados como par�metro, com os valores default para os componentes de um {@link IGExportarPDF}.
	 * 
	 * @param boxUsuarios - {@link JComboBox} : campo a ser inicializado
	 * @param tiposDeGrafico - {@link JComboBox} : campo a ser inicializado
	 * @param manipulador - objeto usado para se obter os valores default dos componentes de um {@link IGExportarPDF}
	 */
	public static void inicializarCampos(JComboBox<Object> boxUsuarios, JComboBox<Object> tiposDeGrafico,ManipuladorDeDados manipulador) {
		Utilitarios.carregarComboBox(boxUsuarios, new IndiceUsuario(Constantes.VALOR_TODOS_COMBO_BOX, null, 0));
		Utilitarios.carregarComboBox(boxUsuarios, manipulador.lerIndicesUsuarios().toArray());
		Utilitarios.carregarComboBox(tiposDeGrafico, Constantes.VALOR_TODOS_COMBO_BOX, Constantes.TIPO_DE_GRAFICO_1, Constantes.TIPO_DE_GRAFICO_2, Constantes.TIPO_DE_GRAFICO_3);
	}
	
	/**
	 * Realiza as opera��es de tratamento do evento do bot�o <code>Exportar</code> de um {@link IGExportarPDF}.
	 * 
	 * @param manipulador - objeto usado para obter os dados necess�rios para tratar o evento.
	 * @param dtInicial - {@link Data} : data inicial do per�odo selecionado
	 * @param dtFinal - {@link Data} : data final do per�odo selecionado
	 * @param indice - {@link IndiceUsuario} : especifica o usu�rio selecionado
	 * @param tipoGrafico - {@link String} : especifica o tipo de gr�fico selecionado
	 * @param janelaPai - {@link Component} : componente sobre o qual mensagens ser�o exibidas, caso sejam necess�rias.
	 */
	public static void acaoBotao(ManipuladorDeDados manipulador, Date dtInicial, Date dtFinal, IndiceUsuario indice, String tipoGrafico, Component janelaPai){
		Data dataInicial = Data.transformaDateEmData(dtInicial), dataFinal = Data.transformaDateEmData(dtFinal);
		
		if(dataInicial.compareTo(dataFinal) ==  1){
			Mensagem.msgErro("A data inicial n�o pode ser maior que a data final do per�odo!", Constantes.NOME_PROGRAMA + " : Exportar");
			return;
		}
		
		List<DadoExport> dadosExportacao = new ArrayList<DadoExport>();
		
		if(indice.getNomeUser().equals(Constantes.VALOR_TODOS_COMBO_BOX)){
			dadosExportacao.addAll(gerarDadosExportacaoAllUsers(manipulador, dataInicial, dataFinal, tipoGrafico));
		}else{
			DadoExport dado = gerarDadosExportacaoOneUser(manipulador.lerUsuario(indice.getNumeroRegistro()), manipulador, dataInicial, dataFinal, tipoGrafico);
			if(dado != null)
				dadosExportacao.add(dado);
		}
		
		if(GerarPDF.gerarPDFPorDadoExport(dadosExportacao, dataInicial, dataFinal, janelaPai) == 1){
			Mensagem.msgInfo(Constantes.MENSAGEM_EXPORTACAO_CONCLUIDA, Constantes.NOME_PROGRAMA + " : Exportar");
		}else{
			Mensagem.msgErro(Constantes.MENSAGEM_EXPORTACAO_CANCELADA, Constantes.NOME_PROGRAMA + " : Exportar");
		}
	}

	private static DadoExport gerarDadosExportacaoOneUser(Usuario usuario, ManipuladorDeDados manipulador, Data dataInicial, Data dataFinal, String tipoGrafico) {
		List<Exercicio> exercicios = manipulador.lerExerciciosUsuarioDoPeriodo(usuario, dataInicial, dataFinal);
		if(exercicios.isEmpty())
			return null;
		List<JFreeChart> graficosDoUsuario = gerarGraficosPorTipo(exercicios, tipoGrafico);
		return new DadoExport(usuario, graficosDoUsuario);
	}
	
	private static List<JFreeChart>  gerarGraficosPorTipo(List<Exercicio> exercicios, String tipoGrafico){
		List<JFreeChart> graficos = new ArrayList<JFreeChart>();
		
		if(tipoGrafico.equals(Constantes.VALOR_TODOS_COMBO_BOX)){
			graficos.addAll(GerarGraficos.gerarTodosOsGraficosDeUmTipo(null, exercicios, Constantes.TIPO_DE_GRAFICO_1_POR_TIPO, true));
			graficos.addAll(GerarGraficos.gerarTodosOsGraficosDeUmTipo(null, exercicios, Constantes.TIPO_DE_GRAFICO_2_POR_TIPO, true));
			graficos.addAll(GerarGraficos.gerarTodosOsGraficosDeUmTipo(null, exercicios, Constantes.TIPO_DE_GRAFICO_3, false));
		}else{
			graficos.addAll(GerarGraficos.gerarTodosOsGraficosDeUmTipo(null, (ArrayList<Exercicio>) exercicios, tipoGrafico, true));
		}
		return graficos;
	}

	private static List<DadoExport> gerarDadosExportacaoAllUsers(ManipuladorDeDados manipulador, Data dataInicial, Data dataFinal, String tipoGrafico) {
		List<Object> indices = manipulador.lerIndicesUsuarios();
		List<DadoExport> dados = new ArrayList<DadoExport>();
		
		for (Object indice : indices) {
			Usuario usuario = manipulador.lerUsuario(((IndiceUsuario)indice).getNumeroRegistro());
			DadoExport dado = gerarDadosExportacaoOneUser(usuario, manipulador, dataInicial, dataFinal, tipoGrafico);
			if(dado != null){
				dados.add(dado);
			}
		}
		
		return dados;
	}
	
	/**
	 * Classe usada para facilitar a exporta��o de gr�ficos gerados pelo programa para arquivos PDF.
	 * 
	 * @author Jos� do Carmo de Melo Silva
	 *
	 */
	public static class DadoExport {
			private Usuario usuario;
			private List<JFreeChart> graficosDoUsuario;
			
			/**
			 * Cria uma nova inst�ncia <code>DadoExport</code> a partir dos par�metros recebidos.
			 * 
			 * @param usuario - {@link Usuario} : usu�rio a ser armazenado no objeto.
			 * @param graficosDoUsuario - {@link List} <{@link JFreeChart}> : gr�ficos, correspondentes ao usu�rio a ser armazendo no objeto, que ser�o armazenados
			 * no objeto.
			 */
			public DadoExport(Usuario usuario, List<JFreeChart> graficosDoUsuario) {
				this.usuario = usuario;
				this.graficosDoUsuario = graficosDoUsuario;
			}

			/**
			 * Retorna o usu�rio armazenado no objeto.
			 * 
			 * @return {@link Usuario} : usu�rio armazenado no objeto.
			 */
			public Usuario getUsuario() {
				return usuario;
			}
			
			/**
			 * Retorna os gr�ficos, correspondentes ao usu�rio armazenado no objeto, que est�o armazenados no objeto.
			 * 
			 * @return {@link List} <{@link JFreeChart}> : gr�ficos correspondentes ao usu�rio armazenado no objeto.
			 */
			public List<JFreeChart> getGraficosDoUsuario() {
				return graficosDoUsuario;
			}
	}
}