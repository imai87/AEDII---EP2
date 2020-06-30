import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private List<Vertice> vertices;
	
	public Grafo() {
		this.vertices = new ArrayList<>();
	}
	
	public List<Vertice> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
	}

	public void addVertice(String entrevistado, List<String> zonaDestino) {
		Vertice vertice = new Vertice(entrevistado, zonaDestino);
		vertices.add(vertice);
	}
	
	public void addAresta(Vertice origem, Vertice destino) {
		origem.addAdj(destino);
	}
}
