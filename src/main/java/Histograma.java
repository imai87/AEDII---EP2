import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import javax.swing.*;

public class Histograma extends JFrame {

	double[] valores = null;

	public Histograma(double[] valores) {

		this.valores = valores;
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Histograma");
		setSize(950, 700);
		setLocationRelativeTo(null);
		criarHistograma();
		setVisible(true);
	}

	public void criarHistograma() {

		HistogramDataset histograma = new HistogramDataset();
		histograma.setType(HistogramType.FREQUENCY);
		histograma.addSeries("Quantidade de pessoas que frequentaram o mesmo local", valores, 100, 1, 517);

		JFreeChart histogram = ChartFactory.createHistogram("Relação pessoas x lugares", "Quantidade de lugares",
				"Número de pessoas", histograma);

		ChartPanel painel = new ChartPanel(histogram);
		add(painel);
	}
}