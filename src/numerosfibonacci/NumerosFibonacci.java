package numerosfibonacci;

import java.util.Scanner;

public class NumerosFibonacci {

    static Scanner scanner = new Scanner(System.in);
    static int numUno = 0;
    static int numDos = 1;
    static int temp;

    public static void procedimiento() {
        System.out.println("DIGITE HASTA QUE NUMERO DESEA REALIZAR LA SECUENCIA FIBONACCI: ");
        int numero = scanner.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.print(numUno + " ");
            temp = numUno;
            numUno = numDos;
            numDos = temp + numDos;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        procedimiento();
    }

}
