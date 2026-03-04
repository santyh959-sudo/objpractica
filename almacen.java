import java.util.Scanner;

public class almacen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("Ingrese la dimencion de la matriz: ");
        int n = sc.nextInt();

        objtienda[][] mat = new objtienda[n][n];

        m.llenarMat(mat, sc);
        m.encontrarProducto(mat, sc);

    }
}
