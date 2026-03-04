public class objtienda {

    private String Nombre;
    private int Precio;
    private int Cantidad;

    
    public objtienda() {
    }
    
    public objtienda(String nombre, int precio, int cantidad) {
        Nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }


    
}
