import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido a la calculadora básica \n puede realizar las siguientes opciones:");
        System.out.print(" \n 1.Sumar");
        System.out.print(" \n 2.Restar");
        System.out.print(" \n 3.Multiplicar");
        System.out.print(" \n 4.Dividir");
        System.out.println();
        int opcion = 0;
        System.out.print("Selecciona una de las opciones posibles: ");
        opcion = scanner.nextInt();
        System.out.println();
        int numero_uno = 0;
        int numero_dos = 0;

        switch(opcion){
            case 1:
                System.out.print("Ha seleccionado la operación de sumar");
                System.out.println();

                System.out.println("Introduce el primer numero: ");
                numero_uno = scanner.nextInt();

                System.out.println("Introduce el segundo numero: ");
                numero_dos = scanner.nextInt();

                System.out.println("Resultado = "+numero_uno + " + " + numero_dos + " = " + (numero_uno+numero_dos));

                break;
            case 2:
                System.out.print("Ha seleccionado la operación de restar");
                System.out.println();

                System.out.println("Introduce el primer numero: ");
                numero_uno = scanner.nextInt();

                System.out.println("Introduce el segundo numero: ");
                numero_dos = scanner.nextInt();

                System.out.println("Resultado = "+numero_uno + " - " + numero_dos + " = " + (numero_uno-numero_dos));
                break;
            case 3:
                System.out.print("Ha seleccionado la operación de multiplicar");
                System.out.println();

                System.out.println("Introduce el primer numero: ");
                numero_uno = scanner.nextInt();

                System.out.println("Introduce el segundo numero: ");
                numero_dos = scanner.nextInt();

                System.out.println("Resultado = "+numero_uno + " * " + numero_dos + " = " + (numero_uno*numero_dos));
                break;

            case 4:
                System.out.print("Ha seleccionado la operación de dividir");
                System.out.println();

                System.out.println("Introduce el primer numero: ");
                numero_uno = scanner.nextInt();

                System.out.println("Introduce el segundo numero: ");
                numero_dos = scanner.nextInt();

                System.out.println("Resultado = "+numero_uno + " / " + numero_dos + " = " + (numero_uno/numero_dos));
                break;

        }




    }
}

//Mejora Opcional: Añadir funciones como raíces cuadradas, exponentes y memoria de operaciones.