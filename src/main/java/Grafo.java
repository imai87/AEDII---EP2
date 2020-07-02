import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private List<Vertice> vertices;

	private int numArestas;

	private List<Double> grausDosVertices;

	public Grafo() {
		vertices = new ArrayList<>();
		numArestas = 0;
		grausDosVertices = new ArrayList<>();
	}

	public List<Vertice> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
	}

	public int getNumArestas() {
		return numArestas;
	}

	public void setNumArestas(int numArestas) {
		this.numArestas = numArestas;
	}

	public List<Double> getGrausDosVertices() {
		return grausDosVertices;
	}

	public void setGrausDosVertices(List<Double> grausDosVertices) {
		this.grausDosVertices = grausDosVertices;
	}

	public void addGrausDosVertices(Double grau) {
		grausDosVertices.add(grau);
	}

	public void addVertice(String entrevistado, List<String> zonaDestino) {
		Vertice vertice = new Vertice(entrevistado, zonaDestino);
		vertices.add(vertice);
	}

	public void addAresta(Vertice origem, Vertice destino) {
		origem.addAdj(destino);
	}
}
