import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);
    public objlibreria[][] llenarMat (objlibreria[][] m)
    {   
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objlibreria o = new objlibreria();
                System.out.println("Ingrese el autor del libro : ");
                o.setAutor(sc.next());
                System.out.println("Ingrese el titulo del libro: ");
                o.setTitulo(sc.next());
                System.out.println("ingrese el precio del libro: ");
                o.setPrecio(sc.nextInt());
                

                m[i][j] = o;
            }
        }
        return m;
    }

    public void mostrarMat (objlibreria[][] m)
    {
        int mayor = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (mayor < m[i][j].getPrecio()) {
                    mayor = m[i][j].getPrecio();
                    System.out.println("Libro: " + m[i][j].getTitulo());
                    System.out.println("Autor: " + m[i][j].getAutor());
                    System.out.println("Precio: " + mayor);
                }
            }
        }
        
    }
}
