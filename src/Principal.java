import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(8);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println("La media de la película es: " + miPelicula.calculaMedia());
        filtroRecomendacion.filtra(miPelicula);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidoEnElPlan(true);

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(9.8);
        otraPelicula.evalua(9.8);
        otraPelicula.evalua(8.9);
        System.out.println("Total de evaluaciones: " + otraPelicula.getTotalDeEvaluaciones());
        System.out.println("La media de la película es: " + otraPelicula.calculaMedia());
        filtroRecomendacion.filtra(otraPelicula);

        Serie miSerie = new Serie();
        miSerie.setNombre("La casa del Dragón");
        miSerie.setFechaDeLanzamiento(2022);
        miSerie.setTemporadas(1);
        miSerie.setEpisodiosPorTemporada(10);
        miSerie.setMinutosPorEpisodio(50);

        miSerie.muestraFichaTecnica();

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(miSerie);
        episodio.setTotalVisualizaciones(75);
        filtroRecomendacion.filtra(episodio);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(otraPelicula);
        calculadora.incluye(miSerie);
        System.out.println("\nEl tiempo total de tus películas y/o series favoritas es: " + calculadora.getTiempoTotal() + " minutos.");
    }
}
