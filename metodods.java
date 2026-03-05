import java.util.Scanner;

public class metodods {
    Scanner sc = new Scanner(System.in);
    public objteatro[][] llenarMObjteatros(objteatro[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objteatro o = new objteatro();

                System.out.println("Ingrese letra de la fila: ");
                o.setFila(sc.next());
                System.out.println("Ingrese número de asiento: ");
                o.setNumero(sc.nextInt());
                System.out.println("Ingrese precio del asiento: ");
                o.setPrecio(sc.nextInt());

                m[i][j] = o;
            }
        }
        return m;
    }

    public objteatro[][] ordenar (objteatro[][] m)
    {
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int j2 = 0; j2 < m.length; j2++) {
                    for (int k = 0; k < m.length; k++) {
                        if (m[i][j].getPrecio() < m[j2][k].getPrecio()) {
                            objteatro temp = m[i][j];
                            m[i][j] = m[j2][k];
                            m[j2][k] = temp;
                        }
                    }
                }
            }
        }
        return m;
    }

    public void mostrarMat (objteatro[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("asiento: " + m[i][j].getFila()+ " - " + m[i][j].getNumero() );
                System.out.println("Precio: " + m[i][j].getPrecio());
            }
        }
    }
}

