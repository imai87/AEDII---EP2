import com.opencsv.bean.CsvBindByName;

import java.util.Objects;

public class Entrevistados {

    @CsvBindByName(column = "ID_PESS", required = true)
    private String frequentadores;

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

    public String getFrequentadores() {
        return frequentadores;
    }

    public void setFrequentadores(String frequentadores) {
        this.frequentadores = frequentadores;
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
        if (obj instanceof Entrevistados) {
            Entrevistados qualquer = (Entrevistados) obj;
            return this.getFrequentadores().equals(qualquer.getFrequentadores()) && this.getZonaDestino().equals(qualquer.getZonaDestino());
        }else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(getFrequentadores(), getZonaDestino());
    }

    @Override
    public String toString() {
        return "Entrevistados{" +
                "frequentadores='" + frequentadores + '\'' +
                ", zonaDestino='" + zonaDestino + '\'' +
                '}';
    }
}
