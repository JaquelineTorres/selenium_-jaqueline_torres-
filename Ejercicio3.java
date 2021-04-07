import java.util.Scanner;

public class Ejercicio3 {
    //Método que reciba dos enteros y retorne la multiplicación de la misma.
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero1 = input.nextInt();

        System.out.println("Ingrese otro número: ");
        int numero2 = input.nextInt();

        System.out.println("La multiplicación es: " + multiplicacionDeDosNumeros(numero1,numero2));
    }

    public static int multiplicacionDeDosNumeros(int num1, int num2){
        return num1*num2;
    }
}



