// Clase Hotel
public class Hotel {
    // Atributos
    private String nombre;
    private String duenio;
    private String categoria;
    private int anio;
    private int habitaciones;
    private Boolean disponible24_7;

    // Constructor vacío
    public Hotel() {
    }

    // Constructor completo
    public Hotel(String nombre, String duenio, String categoria, int anio, int habitaciones, Boolean disponible24_7) {
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

    public Boolean getDisponible24_7() {
        return disponible24_7;
    }

    public void setDisponible24_7(Boolean disponible24_7) {
        this.disponible24_7 = disponible24_7;
    }

    // Métodos personalizados

    // Método para modificar los atributos del hotel
    public void modificarHotel(String nombre, String duenio, String categoria, int anio, int habitaciones, Boolean disponible24_7) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.categoria = categoria;
        this.anio = anio;
        this.habitaciones = habitaciones;
        this.disponible24_7 = disponible24_7;
        System.out.println("------------------------------");
        System.out.println("Modificación de hotel completa");
    }

    // Método para imprimir los detalles del hotel
    public void imprimirDetalles() {
        System.out.println("------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dueño: " + duenio);
        System.out.println("Categoría: " + categoria);
        System.out.println("Año: " + anio);
        System.out.println("Habitaciones: " + habitaciones);
        System.out.println("Disponible 24/7: " + (disponible24_7 != null ? (disponible24_7 ? "Sí" : "No") : "null"));
    }

    // Método para modificar la disponibilidad del hotel
    public void cambiarDisponibilidad(Boolean disponible24_7) {
        this.disponible24_7 = disponible24_7;
    }

    // Método para establecer valores null
    public void valoresNull() {
        setNombre(null);
        setDuenio(null);
        setCategoria(null);
        setHabitaciones(0);
        setAnio(0);
        setDisponible24_7(null);
        System.out.println("------------------------------");
        System.out.println("Los valores se cambiaron a null exitosamente");
    }
}