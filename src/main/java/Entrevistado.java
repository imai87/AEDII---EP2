import com.opencsv.bean.CsvBindByName;

import java.util.Objects;

public class Entrevistado {

    @CsvBindByName(column = "ID_PESS", required = true)
    private String frequentador;

    //private boolean repetido = true;

//    public boolean isRepetido() {
//        return repetido;
//    }
//
//    public void setRepetido(boolean repetido) {
//        this.repetido = repetido;
//    }

    //    @CsvBindByName(column = "CO_D_X", required = true)
//    private String coordenadaX;
//
//    @CsvBindByName(column = "CO_D_Y", required = true)
//    private String coordenadaY;

    @CsvBindByName(column = "ZONA_D", required = true)
    private String zonaDestino;

    public String getZonaDestino() {
        return zonaDestino;
    }

    public void setZonaDestino(String zonaDestino) {
        this.zonaDestino = zonaDestino;
    }

    public String getFrequentador() {
        return frequentador;
    }

    public void setFrequentador(String frequentador) {
        this.frequentador = frequentador;
    }

//    public String getCoordenadaX() {
//        return coordenadaX;
//    }
//
//    public void setCoordenadaX(String coordenadaX) {
//        this.coordenadaX = coordenadaX;
//    }
//
//    public String getCoordenadaY() {
//        return coordenadaY;
//    }
//
//    public void setCoordenadaY(String coordenadaY) {
//        this.coordenadaY = coordenadaY;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if(this.getFrequentadores() == ((Entrevistados) o).getFrequentadores() && this.getZonaDestino() == ((Entrevistados) o).getZonaDestino()){
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object obj) {
    	
        if (obj instanceof Entrevistado) {
        	
            Entrevistado qualquer = (Entrevistado) obj;
            return this.getFrequentador().equals(qualquer.getFrequentador()) && this.getZonaDestino().equals(qualquer.getZonaDestino());
        }
        else return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getFrequentador(), getZonaDestino());
    }

    @Override
    public String toString() {
    	
        return "Entrevistados{" +
                "frequentador='" + frequentador + '\'' +
                ", zonaDestino='" + zonaDestino + '\'' +
                '}';
    }
}
