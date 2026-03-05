import java.util.Scanner;

public class teatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodods m = new metodods();

        System.out.println("ingrese dimencion de la matriz: ");
        int n = sc.nextInt();

        objteatro[][] mat = new objteatro[n][n];

        m.llenarMObjteatros(mat);
        m.ordenar(mat);
        m.mostrarMat(mat);

        sc.close();
    }
}