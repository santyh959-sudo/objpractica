import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("INgrese dimencion de la matriz: ");
        int n = sc.nextInt();

        objtienda[][] mat = new objtienda[n][n];

        m.llenarMat(mat);
        m.mostrarMat(mat);

        sc.close();
    }
}
