import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vertice {

	private String entrevistado;

	private List<String> zonaDestino;

	private List<Vertice> adj;

	private double grau;
	
	public Vertice(String entrevistado, List<String> zonaDestino) {
		this.entrevistado = entrevistado;
		this.zonaDestino = zonaDestino;
		this.adj = new ArrayList<>();
	}

	public String getEntrevistado() {
		return entrevistado;
	}

	public void setEntrevistado(String entrevistado) {
		this.entrevistado = entrevistado;
	}

	public List<String> getZonaDestino() {
		return zonaDestino;
	}

	public void setZonaDestino(List<String> coordenadas) {
		this.zonaDestino = coordenadas;
	}

	public List<Vertice> getAdj() {
		return adj;
	}

	public void setAdj(List<Vertice> adj) {
		this.adj = adj;
	}

	public double getGrau() {
		return grau;
	}

	public void setGrau(double grau) {
		this.grau = grau;
	}

	public void addAdj(Vertice e) {
		adj.add(e);
	}

	@Override
	public String toString() {

		String listaAdj = adj.stream().map(Vertice::getEntrevistado).collect(Collectors.joining(", "));

		return "Entrevistados{" + "frequentador='" + entrevistado + '\'' + ", zonaDestino='" + zonaDestino + '\''
				+ ", vertices adjacentes='[" + listaAdj + '\'' + "]}";
	}
}
