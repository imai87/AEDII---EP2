import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import org.apache.commons.lang3.ArrayUtils;
import org.primefaces.util.LimitedSizeHashMap;
import sun.misc.JavaUtilZipFileAccess;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException, CsvException {

        //Reader reader = Files.newBufferedReader(Paths.get("OD_2017.csv"));

        Reader reader = Files.newBufferedReader(Paths.get("od_2017_v2.csv"));

        List<Entrevistados> pessoasTotal = new CsvToBeanBuilder(reader).withType(Entrevistados.class).build().parse();


//___________________________________________________________________________________________________________________________________
        //Lista de zonas que será passada para o Histograma
//        double[] valores = null;
//        List<Double> zonas = new ArrayList<>();
//
//        for (Entrevistados entrevistados : pessoasTotal) {
//            zonas.add(Double.parseDouble(entrevistados.getZonaDestino()));
//        }
//
//        valores = ArrayUtils.toPrimitive(zonas.toArray(new Double[zonas.size()]));

        //new Histograma(valores);
//____________________________________________________________________________________________________________________________________


        //Remove entrevistados com Zona de Destino igual a ZERO
        pessoasTotal.removeIf(entrevistado -> entrevistado.getZonaDestino().equals("0"));

        for (Entrevistados entrevistados : pessoasTotal ) {
            System.out.println(entrevistados.toString());
        }

    }
}



