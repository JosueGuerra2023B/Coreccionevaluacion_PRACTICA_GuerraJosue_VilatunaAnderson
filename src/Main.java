public class Main {
    public static void main(String[] args) {
        // Creación de 5 instancias de la clase Hotel con valores quemados
        Hotel hotel1 = new Hotel("Hotel Paradise", "Juan Pérez", "5 estrellas", 2010, 100, true);
        Hotel hotel2 = new Hotel("Hotel Sunset", "Maria Lópes", "4 estrellas", 2005, 80, false);
        Hotel hotel3 = new Hotel("Hotel Plaza", "Pedro Gomes", "3 estrellas", 2015, 50, true);
        Hotel hotel4 = new Hotel("Hotel Central", "Ana Martínez", "2 estrellas", 2000, 30, false);
        Hotel hotel5 = new Hotel("Hotel Beach", "Carlos Sánchez", "1 estrella", 2020, 20, true);

        // Creación de dos objetos con valores nulos y posteriormente seteo de valores
        Hotel hotel6 = new Hotel();
        hotel6.modificarHotel("Hotel Ocean", "Roberto Rodríguez", "3 estrellas", 2018, 60, true);

        Hotel hotel7 = new Hotel();
        hotel7.modificarHotel("Hotel View", "Laura Díaz", "4 estrellas", 2012, 90, false);

        // Modificación de objetos previamente creados
        hotel1.modificarHotel("Hotel Paradise", "Juan Pérez Jr.", "5 estrellas", 2011, 110, true);
        hotel2.cambiarDisponibilidad(true);

        // Impresión de todos los objetos
        System.out.println("------------------------------");
        System.out.println("Sistema de registro de hoteles");
        System.out.println("------------------------------");
        hotel1.imprimirDetalles();
        System.out.println("------------------------------");
        hotel2.imprimirDetalles();
        System.out.println("------------------------------");
        hotel3.imprimirDetalles();
        System.out.println("------------------------------");
        hotel4.imprimirDetalles();
        System.out.println("------------------------------");
        hotel5.imprimirDetalles();
        System.out.println("------------------------------");
        hotel6.imprimirDetalles();
        System.out.println("------------------------------");
        hotel7.imprimirDetalles();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Creado por Josué Guerra y Anderson Vilatuña");


    }
}
