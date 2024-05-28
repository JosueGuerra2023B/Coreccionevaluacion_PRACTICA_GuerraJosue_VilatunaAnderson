public class Main {
    public static void main(String[] args) {
        // Creación de 5 instancias de la clase Hotel
        Hotel hotel1 = new Hotel();
        hotel1.setNombre("Hotel Paradise");
        hotel1.setDuenio("Juan Pérez");
        hotel1.setCategoria("5 estrellas");
        hotel1.setAnio(2010);
        hotel1.setHabitaciones(100);
        hotel1.setDisponible24_7(true);

        Hotel hotel2 = new Hotel();
        hotel2.setNombre("Hotel Sunset");
        hotel2.setDuenio("María López");
        hotel2.setCategoria("4 estrellas");
        hotel2.setAnio(2005);
        hotel2.setHabitaciones(80);
        hotel2.setDisponible24_7(false);

        Hotel hotel3 = new Hotel();
        hotel3.setNombre("Hotel Plaza");
        hotel3.setDuenio("Pedro Gómez");
        hotel3.setCategoria("3 estrellas");
        hotel3.setAnio(2015);
        hotel3.setHabitaciones(50);
        hotel3.setDisponible24_7(true);

        Hotel hotel4 = new Hotel();
        hotel4.setNombre("Hotel Central");
        hotel4.setDuenio("Ana Martínez");
        hotel4.setCategoria("2 estrellas");
        hotel4.setAnio(2000);
        hotel4.setHabitaciones(30);
        hotel4.setDisponible24_7(false);
        Hotel hotel5 = new Hotel();
        hotel5.setNombre("Hotel Beach");
        hotel5.setDuenio("Carlos Sánchez");
        hotel5.setCategoria("1 estrella");
        hotel5.setAnio(2020);
        hotel5.setHabitaciones(20);
        hotel5.setDisponible24_7(true);

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
        System.out.println("Creado por Josué Guerra y Anderson Vilotuña");
    }
}
