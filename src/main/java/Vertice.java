import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private String entrevistado;
    
    private List<String> coordenadas;
    
    private List<Vertice> adj;

    public String getEntrevistado() {
		return entrevistado;
	}

	public void setEntrevistado(String entrevistado) {
		this.entrevistado = entrevistado;
	}

	public List<String> getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(List<String> coordenadas) {
		this.coordenadas = coordenadas;
	}

	public List<Vertice> getAdj() {
		return adj;
	}

	public void setAdj(List<Vertice> adj) {
		this.adj = adj;
	}

	public Vertice(String entrevistado, List<String> coordenadas) {
        this.entrevistado = entrevistado;
        this.coordenadas = coordenadas;
        this.adj = new ArrayList<>();
    }
    
    public void addAdj(Vertice e) {
        adj.add(e);
    }
    
    @Override
    public String toString() {
    	
        return "Entrevistados{" +
                "frequentadores='" + entrevistado + '\'' +
                ", zonaDestino='" + coordenadas + '\'' +
                '}';
    }
}
