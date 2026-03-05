public class objteatro {

    private int Numero;
    private String Fila;
    private int Precio;
    public objteatro() {
    }
    public objteatro(int numero, String fila, int precio) {
        Numero = numero;
        Fila = fila;
        Precio = precio;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public String getFila() {
        return Fila;
    }
    public void setFila(String fila) {
        Fila = fila;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }

    
}
