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

    private double numReal1;
    private double numReal2;

    private int numEntero1;
    private int numEntero2;

    private int opcionMenu;


    public void menuDivision(){
        do {
            System.out.println("Menu cocientes. Selecciona una opcion para el calculo");
            System.out.println("1. Division de dos numeros reales");
            System.out.println("2. Division de dos numeros enteros");
            System.out.println("3. Inversa de dos numeros reales");
            System.out.println("4. Raiz cuadrada de dos numeros enteros");

            Scanner leer = new Scanner(System.in);
            opcionMenu = leer.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Dame un número real");
                    double numReal1 = leer.nextDouble();
                    System.out.println("Dame otro número real");
                    double numReal2 = leer.nextDouble();

                    if (numReal2 != 0) {
                        double resultado = numReal1 / numReal2;
                        System.out.println("El resultado de la division real es " + resultado);
                    } else {
                        System.out.println("El cálculo de la division real es nulo.");
                    }
                    break;

                case 2:
                    System.out.println("Dame un número entero");
                    int numEntero1 = leer.nextInt();
                    System.out.println("Dame otro número entero");
                    int numEntero2 = leer.nextInt();

                    if (numEntero2 != 0) {
                        double resultado = numEntero1 / numEntero2;
                        System.out.println("El resultado de la division entera es " + resultado);
                    } else {
                        System.out.println("El cálculo de la division entera es nulo");
                    }

                case 3:
                    System.out.println("Dame un número real");
                    numReal2 = leer.nextDouble();

                    if (numReal2 != 0) {
                        double resultado = 1 / numReal2;
                        System.out.println("El resultado de la inversa real es " + resultado);
                    } else {
                        System.out.println("El resultado de la inversa real es nulo");
                    }
                    break;

                case 4:
                    System.out.println("Dame un número real");
                    numReal1 = leer.nextDouble();

                    if (numReal1 >= 0) {
                        double resultado = Math.sqrt(numReal1);
                        System.out.println("El resultado del raiz cuadrada es " + resultado);
                    } else {
                        System.out.println("El resultado del raiz cuadrada es nulo");
                    }
                    break;

                default:
                    System.out.println("Opcion no valida. FIN DEL PROGRAMA");

            }
        } while (opcionMenu>=1 || opcionMenu <=4);
    }
}