import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);
    public objtienda[][] llenarMat(objtienda[][] m, Scanner sc)
    {
       
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objtienda o = new objtienda();
                System.out.print("Ingrese producto: " );
                o.setNombre(sc.next());
                System.out.print("ingrese precio del producto: ");
                o.setPrecio(sc.nextInt());
                System.out.print("Ingrese cantidad disponible del producto: ");
                o.setCantidad(sc.nextInt());

                m[i][j] = o;
            }
        }
        return m;
    }

    public void encontrarProducto (objtienda[][] m, Scanner sc)
    {
        
        int opt = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                while (opt != 6) {
                    System.out.println("Ingrese ");
                    System.out.println("1. si desea buscar un producto " + "\n2. si desea salir");
                    opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Ingrese nombre del producto a buscar: ");
                        String producto = sc.next();

                        if (producto.equals(m[i][j].getNombre())) {
                    System.out.println("Producto: " + m[i][j].getNombre());
                    System.out.println("Precio: " + m[i][j].getPrecio());
                    System.out.println("Cantidad disponible: " + m[i][j].getCantidad());

                    } else {
                        System.out.println("Producto no encntrado o mal escrito");
                    }
                        break;

                    case 2:
                        System.out.println("Hasta luego :)");
                        opt = 6;

                        break;

                    default:
                        System.out.println("Ingrese un número valido");

                        break;
                }
                
                }

            }
        }
    }
}
