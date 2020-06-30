import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

	/**
	 * Vamos montar o {@link Grafo} utilizando a estrutura de lista de adjacencia.
	 * 
	 * Os nos sao os entrevistados, representados pela classe {@link Vertice}.
	 * 
	 * @param args
	 * @throws IOException
	 * @throws CsvException
	 */
	public static void main(String[] args) throws IOException, CsvException {

		// Reader reader = Files.newBufferedReader(Paths.get("OD_2017.csv"));

		Reader reader = Files.newBufferedReader(Paths.get("od_2017_v2.csv"));

		List<Entrevistado> pessoasTotal = new CsvToBeanBuilder(reader).withType(Entrevistado.class).build().parse();

//___________________________________________________________________________________________________________________________________
		// Lista de zonas que será passada para o Histograma
//        double[] valores = null;
//        List<Double> zonas = new ArrayList<>();
//
//        for (Entrevistados entrevistados : pessoasTotal) {
//            zonas.add(Double.parseDouble(entrevistados.getZonaDestino()));
//        }
//
//        valores = ArrayUtils.toPrimitive(zonas.toArray(new Double[zonas.size()]));

		// new Histograma(valores);
//____________________________________________________________________________________________________________________________________

		// Remove entrevistados com Zona de Destino igual a ZERO
		pessoasTotal.removeIf(entrevistado -> entrevistado.getZonaDestino().equals("0"));

//        for(Entrevistado entrevistado : pessoasTotal) {
//        	System.out.println(entrevistado.toString());
//        }

		Grafo grafo = criarVertices(pessoasTotal);

		for (Vertice vertice : grafo.getVertices()) {
			System.out.println(vertice.toString());
		}

		// TODO Adicionar os vertices adjacentes
		adicionarAdjacencia(grafo);
	}

	/**
	 * Cria um {@link Grafo} e o popula com vertices. Vamos usar lista de adjacencia
	 * para montar o grafo, porem, esse metodo nao adiciona os vertices adjacentes,
	 * somente cria uma lista contendo todos os vertices, alem de juntar todos os
	 * frequentadores duplicados que continham no {@link} pessoasTotal}.
	 * 
	 * Se rodar o teste, tera uma visao melhor do que esta escrito acima.
	 * 
	 * @param pessoasTotal Entidade traduzida diretamente do CSV.
	 * @return um grafo contendo uma lista com todos os vertices.
	 */
	private static Grafo criarVertices(List<Entrevistado> pessoasTotal) {

		Grafo grafo = new Grafo();

		int i = 0;
		while (i < pessoasTotal.size()) {

			String entrevistado = pessoasTotal.get(i).getFrequentador();
			List<String> coordenadas = new ArrayList<>();

			while (i < pessoasTotal.size()) {

				String proxEntrevistado = pessoasTotal.get(i).getFrequentador();

				if (entrevistado.equals(proxEntrevistado)) {

					String proxZonaDestino = pessoasTotal.get(i).getZonaDestino();
					coordenadas.add(proxZonaDestino);

					i++;
				} else
					break;
			}

			grafo.addVertice(entrevistado, coordenadas);
		}

		return grafo;
	}

	private static void adicionarAdjacencia(Grafo grafo) {

	}
}
