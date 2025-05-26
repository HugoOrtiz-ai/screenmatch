import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(8);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println("La media de la película es: " + miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        otraPelicula.muestraFichaTecnica();
        otraPelicula.evalua(9.8);
        otraPelicula.evalua(9.8);
        otraPelicula.evalua(8.9);
        System.out.println("Total de evaluaciones: " + otraPelicula.getTotalDeEvaluaciones());
        System.out.println("La media de la película es: " + otraPelicula.calculaMedia());
    }
}
