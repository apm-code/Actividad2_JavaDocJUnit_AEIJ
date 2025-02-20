package javabeans;

import java.util.Scanner;

/**
 * Clase que implementa métodos relacionados con las divisiones. Tiene los
 * siguientes métodos.
 * 1. División de dos números reales.
 * 2. División de dos números enteros.
 * 3. Inversa de dos números reales.
 * 4. Raiz cuadrada de un número entero.
 *
 * @author eukensaez
 * @version 1.0
 */

public class Cociente_Euken {

    public void menuCociente(Scanner leer) {
        int opcion;
        do {
            System.out.println("\nMenú División:");
            System.out.println("1. División de dos números reales");
            System.out.println("2. División de dos números enteros");
            System.out.println("3. Inversa de un número real");
            System.out.println("4. Raíz cuadrada de un número real");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la división es: " + divisionDosReales(leer));
                    break;
                case 2:
                    System.out.println("El resultado de la división es: " + divisionDosEnteros(leer));
                    break;
                case 3:
                    System.out.println("El resultado de la inversa es: " + inversaReal(leer));
                    break;
                case 4:
                    System.out.println("El resultado de la raíz cuadrada es: " + raizCuadrada(leer));
                    break;
            }
        } while (opcion != 5);
    }

    //Método divisionDosReales que solicita dos reales y hace la división.

        public double divisionDosReales(Scanner leer) {
            System.out.print("Introduce el primer número real: ");
            double a = leer.nextDouble();
            System.out.print("Introduce el segundo número real: ");
            double b = leer.nextDouble();

            if (b <= 0) {
                System.out.println("El cálculo de la división real es nulo.");
                return Double.NaN;
            }

            return a / b;
        }

    //Método divisionDosReales para pruebas en Junit

        public double divisionDosReales(double a, double b) {
            if (b == 0) {
                System.out.println("Error: División por cero.");
                return Double.NaN;
            }
            return a / b;
        }


    //Método divisionDosEnteros que solicita dos enteros y hace la división.

        public double divisionDosEnteros(Scanner leer) {
            System.out.print("Introduce el primer número entero: ");
            int a = leer.nextInt();
            System.out.print("Introduce el segundo número entero: ");
            int b = leer.nextInt();

            if (b <= 0) {
                System.out.println("El cálculo de la división entera es nulo.");
                return Double.NaN;
            }
            return (double) a / b;
        }

    //Método divisionDosEnteros para pruebas en JUnit

        public double divisionDosEnteros(int a, int b) {
            if (b == 0) {
                System.out.println("Error: División por cero.");
                return Double.NaN;
            }
            return (double) a / b;
        }

        //Método inversaReal que realiza la inversa de un número real solicitado al usuario.

            public double inversaReal (Scanner leer){
                System.out.print("Introduce un número real: ");
                double a = leer.nextDouble();

                if (a <= 0) {
                    System.out.println("El resultado de la inversa real es nulo.");
                    return Double.NaN;
                }

            return 1 / a;
        }

        //Método inversaReal para pruebas en JUnit

            public double inversaReal ( double a) {
                if (a == 0) {
                    System.out.println("Error: No se puede calcular la inversa de 0.");
                    return Double.NaN;
                }
                 return 1 / a;
            }

            //Método raizCuadrada que realiza la raiz cuadrada de un número solicitado al usuario.

            public double raizCuadrada (Scanner leer){
                System.out.print("Introduce un número real: ");
                double a = leer.nextDouble();

                if (a < 0) {
                    System.out.println("El resultado del raiz cuadrada es nulo.");
                    return Double.NaN;
                }

                return Math.sqrt(a);
            }

            //Método raizCuadrada para pruebas en JUnit.

            public double raizCuadrada ( double a){
                if (a < 0) {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    return Double.NaN;
                }
                return Math.sqrt(a);
            }
}
