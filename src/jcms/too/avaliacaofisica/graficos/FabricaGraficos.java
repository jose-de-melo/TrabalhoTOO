package jcms.too.avaliacaofisica.graficos;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Fornece m�todos para cria��o de gr�ficos de barras e de linhas com apar�ncia default da API {@link JFreeChart}
 * 
 * @author Jos� do Carmo de Melo Silva
 *@see JFreeChart
 *@version 0.5
 */
public class FabricaGraficos {
	/**
	 * Cria um gr�fico de barras 3D a partir dos par�metros passados.
	 * 
	 * @param titulo - texto da legenda superior (t�tulo)
	 * @param legendaInferior - texto da legenda inferior
	 * @param legendaDaEsquerda - texto da legenda da esquerda.
	 * @param dados - {@link DefaultCategoryDataset} dados a serem plotados no gr�fico
	 * @param orientacao - {@link PlotOrientation} orienta��o das barras no gr�fico
	 * @return um {@link JFreeChart} (BarChart3D) com apar�ncia defult da classe.
	 */
	public static JFreeChart criarGraficoBarras3D(String titulo, String legendaInferior, String legendaDaEsquerda, DefaultCategoryDataset dados, PlotOrientation orientacao){
		return ChartFactory.createBarChart3D(titulo, legendaInferior, legendaDaEsquerda, dados, orientacao, true, true, true);
	}
	
	/**
	 * Cria um gr�fico de barras a partir dos par�metros passados.
	 * 
	 * @param titulo - texto da legenda superior (t�tulo)
	 * @param legendaInferior - texto da legenda inferior
	 * @param legendaDaEsquerda - texto da legenda da esquerda.
	 * @param dados - {@link DefaultCategoryDataset} dados a serem plotados no gr�fico
	 * @param orientacao - {@link PlotOrientation} orienta��o das barras no gr�fico
	 * @return um {@link JFreeChart} (BarChart) com apar�ncia defult da classe.
	 */
	public static JFreeChart criarGraficoBarras(String titulo, String legendaInferior, String legendaDaEsquerda, DefaultCategoryDataset dados, PlotOrientation orientacao){
		return ChartFactory.createBarChart(titulo, legendaInferior, legendaDaEsquerda, dados, orientacao, true, true, true);
	}

	/**
	 * Cria um gr�fico de linhas a partir dos par�metros passados.
	 * 
	 * @param titulo - texto da legenda superior (t�tulo)
	 * @param legendaInferior - texto da legenda inferior
	 * @param legendaDaEsquerda - texto da legenda da esquerda.
	 * @param dados - {@link DefaultCategoryDataset} dados a serem plotados no gr�fico
	 * @param orientacao - {@link PlotOrientation} orienta��o das barras no gr�fico
	 * @return um {@link JFreeChart} (LineChart) com apar�ncia defult da classe.
	 */
	public static JFreeChart criarGraficoLinha(String titulo, String legendaInferior, String legendaDaEsquerda, DefaultCategoryDataset dados, PlotOrientation orientacao){
		return ChartFactory.createLineChart(titulo, legendaInferior, legendaDaEsquerda, dados, orientacao, true, true, true);
	}
}