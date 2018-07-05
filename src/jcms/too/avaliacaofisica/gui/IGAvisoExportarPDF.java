package jcms.too.avaliacaofisica.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import jcms.too.avaliacaofisica.utilitarios.Constantes;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

/**
 * Classe usada para criar uma tela de aviso para importa��o de gr�ficos que ser�o gerados pela classe {@link IGGraficos}.
 * 
 * @author Jos� do Carmo de Melo Silva
 *	@since 0.7
 *	@see IGGraficos
 */
public class IGAvisoExportarPDF extends JDialog {

	private static final long serialVersionUID = -2167979002502965647L;
	private JButton btnConfirmar;
	private JButton btnCancelar;
	private Boolean realizarExportacao = false;
	private Boolean mostrarNovamente = true;
	private JCheckBox cBoxMostrarNovamente;
	private JLabel lblAvisoImagem;
	private JLabel labelAvisoTexto;
	private JLabel lblSeOGrfico;

	/**
	 * 
	 * Cria uma inst�ncia {@link IGAvisoExportarPDF} de acordo com os valores recebidos como par�metro.
	 * 
	 * @param imagemTela - exemplo de gr�fico a ser exibido na mensagem 
	 * @param identificacaoUsuario - identifica��o do usu�rio escolhido
	 * @param periodo - per�odo usado na cria��o dos gr�ficos
	 * @param tipoDeGrafico - tipo dos gr�ficos a serem exportados posteriormente
	 * @param tipoExercicio - tipo do exerc�cio usados para gerar os gr�ficos a serem exportados posteriormente
	 */
	public IGAvisoExportarPDF(Icon imagemTela, String identificacaoUsuario, String periodo, String tipoDeGrafico, String tipoExercicio) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 675);
		setResizable(false);
		setTitle(Constantes.NOME_PROGRAMA + " : Aviso");
		setModal(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		setIconImage(AvaliacaoFisica.icone.getImage());
		JPanel panelButton = new JPanel();
		panelButton.setBorder(BorderFactory.createTitledBorder(""));
		getContentPane().add(panelButton, BorderLayout.SOUTH);
		panelButton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		btnConfirmar = new JButton("<html><center>Confirmar<br>Exporta\u00E7\u00E3o</center></html>\r\n");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				realizarExportacao = true;
				if(cBoxMostrarNovamente.isSelected())
					mostrarNovamente = false;
				dispose();
			}
		});
		panelButton.add(btnConfirmar);
		btnCancelar = new JButton("<html><center>Cancelar<br>Exporta\u00E7\u00E3o</center></html>");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cBoxMostrarNovamente.isSelected())
					mostrarNovamente = false;
				dispose();
			}
		});
		panelButton.add(btnCancelar);
		JPanel panelCentral = new JPanel();
		getContentPane().add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);

		String aviso = montarStringAviso(identificacaoUsuario, periodo, tipoDeGrafico, tipoExercicio);
		labelAvisoTexto = new JLabel(aviso);
		labelAvisoTexto.setBounds(42, 11, 557, 168);
		panelCentral.add(labelAvisoTexto);

		cBoxMostrarNovamente = new JCheckBox("N\u00E3o mostrar esse aviso novamente");
		cBoxMostrarNovamente.setBounds(32, 565, 266, 23);
		panelCentral.add(cBoxMostrarNovamente);

		lblAvisoImagem = new JLabel();
		lblAvisoImagem.setVerticalAlignment(SwingConstants.TOP);
		lblAvisoImagem.setIcon(imagemTela);
		lblAvisoImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvisoImagem.setBounds(41, 179, 665, 325);
		panelCentral.add(lblAvisoImagem);
		
		lblSeOGrfico = new JLabel("<html><b>Se o gr\u00E1fico exemplo n\u00E3o corresponde ao desejado, cancele a exporta\u00E7\u00E3o e escolha o<br> gr\u00E1fico desejado.</b></html>");
		lblSeOGrfico.setBounds(41, 515, 524, 43);
		panelCentral.add(lblSeOGrfico);
		setVisible(true);
	}

	private String montarStringAviso(String identificacaoUsuario, String periodo, String tipoDeGrafico, String tipoExercicio) {
		String aviso = "";

		aviso += "<html><b>AVISO</b>:<br>Os gr�ficos que ser�o importados correspondem aos seguintes dados:<br><br>";
		aviso += "Usu�rio           : <b>" + identificacaoUsuario + "</b><br>";
		aviso += "Per�odo           : <b>" + periodo + "</b><br>";
		aviso += "Tipo dos Gr�ficos : <b>" + tipoDeGrafico + "</b><br>";
		if(tipoExercicio != null)
			if(tipoExercicio.contains("Todos"))
				aviso += "Tipo de Exerc�cio <b>: Todos</b><br>";
			else
				aviso += "Tipo de Exerc�cio <b>: " + tipoExercicio + "</b><br>";

		aviso += "<br><b>Exemplo</b>:<br><br></html>";

		return aviso;
	}

	/**
	 * Retorna um {@link Boolean} que indica se o usu�rio confirmou a exporta��o.
	 * 
	 * @return <code>Boolean</code> : caso o usu�rio n�o confirme a exporta��o o valor retornado ser� <code>false</code>, caso contr�rio <code>true</code>.
	 */
	public Boolean getRealizarExportacao() {
		return realizarExportacao;
	}

	/**
	 * Retorna um {@link Boolean} que indica se a tela de aviso {@link IGAvisoExportarPDF} deve ser exibida novamente.
	 * 
	 * @return <code>Boolean</code> : caso o usu�rio n�o marque a caixa no di�logo para n�o exibir um {@link IGAvisoExportarPDF} novamente, 
	 * o valor retornado ser� <code>false</code>, caso contr�rio <code>true</code>.
	 */
	public Boolean getMostrarNovamente() {
		return mostrarNovamente;
	}
}
