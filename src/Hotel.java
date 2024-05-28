// Clase Hotel
public class Hotel {
    // Atributos
    String nombre;
    String duenio;
    String categoria;
    int anio;
    int habitaciones;
    boolean disponible24_7;

    // Constructor
    public Hotel() {
    }

    public Hotel(String nombre, String duenio, String categoria, int anio, int habitaciones, boolean disponible24_7) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.categoria = categoria;
        this.anio = anio;
        this.habitaciones = habitaciones;
        this.disponible24_7 = disponible24_7;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDisponible24_7() {
        return disponible24_7;
    }

    public void setDisponible24_7(boolean disponible24_7) {
        this.disponible24_7 = disponible24_7;
    }

    // Métodos personalizados

    // Método para modificar los atributos del hotel
    public void modificarHotel(String nombre, String dueño, String categoría, int año, int habitaciones, boolean disponible24_7) {
        this.nombre = nombre;
        this.duenio = dueño;
        this.categoria = categoría;
        this.anio = año;
        this.habitaciones = habitaciones;
        this.disponible24_7 = disponible24_7;
    }

    // Método para imprimir los detalles del hotel
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dueño: " + duenio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Año: " + anio);
        System.out.println("Habitaciones: " + habitaciones);
        System.out.println("Disponible 24/7: " + (disponible24_7 ? "Sí" : "No"));
    }

    // Método para modificar la disponibilidad del hotel
    public void cambiarDisponibilidad(boolean disponible24_7) {
        this.disponible24_7 = disponible24_7;
    }
}
