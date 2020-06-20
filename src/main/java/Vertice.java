import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private String vertice;
    List<String> coordenadas = new ArrayList<>();

    public Vertice(String vertice, String coordenada) {
        this.vertice = vertice;
        this.coordenadas.add(coordenada);
    }

    public String getVertice() {
        return vertice;
    }

    public void setVertice(String vertice) {
        this.vertice = vertice;
    }

    public List<String> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<String> coordenadas) {
        this.coordenadas = coordenadas;
    }
}
