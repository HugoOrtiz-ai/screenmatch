public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("\nMi película es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + miPelicula.duracionEnMinutos);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        System.out.println("\nMi otra película es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + otraPelicula.duracionEnMinutos);
    }
}
