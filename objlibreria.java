public class objlibreria {
    private String Titulo;
    private String Autor;
    private int Precio;
    public objlibreria() {
    }
    public objlibreria(String titulo, String autor, int precio) {
        Titulo = titulo;
        Autor = autor;
        Precio = precio;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    
    
}
