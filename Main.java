import java.util.Scanner;

public class Main {

    public static void mostrarMenu() {
        System.out.println("\nBienvenido a la calculadora básica");
        System.out.println("Puedes realizar las siguientes operaciones:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Elevar un número al cuadrado");
        System.out.println("6. Salir");
    }

    public static int pedirNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Selecciona una de las opciones posibles: ");
            opcion = scanner.nextInt();
            System.out.println();

            int numero_uno, numero_dos;

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la operación de sumar");
                    try {
                        numero_uno = pedirNumero("Introduce el primer numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.nextLine();  // Limpiar el buffer
                        numero_uno = pedirNumero("Introduce el primer numero correctamente: ");
                    }

                    try {
                        numero_dos = pedirNumero("Introduce el segundo numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");

                        numero_dos = pedirNumero("Introduce el segundo numero correctamente: ");
                    }

                    System.out.println("Resultado = " + numero_uno + " + " + numero_dos + " = " + (numero_uno + numero_dos));
                    break;
                case 2:
                    System.out.println("Has seleccionado la operación de restar");

                    try {
                        numero_uno = pedirNumero("Introduce el primer numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.nextLine();  // Limpiar el buffer
                        numero_uno = pedirNumero("Introduce el primer numero correctamente: ");
                    }


                    try {
                        numero_dos = pedirNumero("Introduce el segundo numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        numero_dos = pedirNumero("Introduce el segundo numero: ");
                    }

                    System.out.println("Resultado = " + numero_uno + " - " + numero_dos + " = " + (numero_uno - numero_dos));
                    break;

                case 3:
                    System.out.println("Has seleccionado la operación de multiplicar");
                    try {
                        numero_uno = pedirNumero("Introduce el primer numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.nextLine(); //Limpiar el buffer
                        numero_uno = pedirNumero("Introduce el primer numero correctamente: ");
                    }

                    try {
                        numero_dos = pedirNumero("Introduce el segundo numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        numero_dos = pedirNumero("Introduce el segundo numero correctamente: ");
                    }

                    System.out.println("Resultado = " + numero_uno + " * " + numero_dos + " = " + (numero_uno * numero_dos));
                    break;
                case 4:
                    System.out.println("Has seleccionado la operación de dividir");

                    try {
                        numero_uno = pedirNumero("Introduce el primer numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.nextLine(); //limpiar el buffer
                        numero_uno = pedirNumero("Introduce el primer numero correctamente: ");
                    }

                    try {
                        numero_dos = pedirNumero("Introduce el segundo numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.nextLine(); //limpiar el buffer
                        numero_dos = pedirNumero("Introduce el segundo numero correctamente: ");
                    }

                    if (numero_dos != 0) {
                        System.out.println("Resultado = " + numero_uno + " / " + numero_dos + " = " + (numero_uno / (double)numero_dos));
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("Has seleccionado la operación de elevar al cuadrado");

                    try {
                        numero_uno = pedirNumero("Introduce el primer numero: ");
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingresa un número válido.");
                        scanner.nextLine(); //limpiar el buffer
                        numero_uno = pedirNumero("Introduce el primer numero correctamente: ");
                    }
                    System.out.println("Resultado = " + numero_uno + " ^2 = " + (numero_uno * numero_uno));
                    break;
                case 6:
                    System.out.println("Gracias por usar la calculadora.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 6);
    }
}
