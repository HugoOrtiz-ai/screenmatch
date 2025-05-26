import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
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
    }
}
