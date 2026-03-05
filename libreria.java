import java.util.Scanner;

public class libreria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("Ingrese dimencio de la matriz: ");
        int n = sc.nextInt();

        objlibreria[][] mat = new objlibreria[n][n];
        
        m.llenarMat(mat);
        m.mostrarMat(mat);

        sc.close();
    }
}
