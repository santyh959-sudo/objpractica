import java.util.Scanner;

public class metodos 
{
Scanner sc = new Scanner(System.in);

    public objtienda[][] llenarMat (objtienda[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objtienda o = new objtienda();
                System.out.println("Ingrese nombre del producto: ");
                o.setProducto(sc.next());
                System.out.println("Ingrese cantidad disponible del producto: ");
                o.setCantidad(sc.nextInt());

                m[i][j] = o;
            }
        }
        return m;
    }

    public void mostrarMat(objtienda[][] m)
    {
        int cantidad = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                cantidad = cantidad + m[i][j].getCantidad();
            }
        }

        System.out.println("El numero de productos en inventario es de: " + cantidad);
    }
}
