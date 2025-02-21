package javabeans;

import java.util.Scanner;
/**
 * Clase que implementa métodos relacionados con las multiplicaiones. Tiene los
 * siguientes métodos.
 * 1. Producto de dos números reales.
 * 2. Producto de dos números enteros.
 * 3. Producto de tres números reales.
 * 4. Potencia.
 *
 * @author Javier García Ruiz
 * @version 1.0
 */


public class Producto_Javier {

    /**
     * Método que muestra el menú de las posibles operaciones y permite
     * seleccionar la deseada. El menú ejecuta un do-while y consta de un
     * switch que, en función de la opción, ejecuta una operación u otra.
     * @param leer recoge la opción introducida.
     */


    public void menuProducto(Scanner leer) {
        int opcion;

        do {
            System.out.println("Menu Productos. Selecciona una opcion para obtener el resultado");
            System.out.println("1. Producto de dos numeros reales");
            System.out.println("2. Producto de dos numeros enteros");
            System.out.println("3. Producto de tres números reales");
            System.out.println("4. Potencia");
            System.out.println("5. Volver al menú principal");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado del producto de dos números reales es : " + productoDosReales(leer));
                    break;

                case 2:
                    System.out.println("El resultado del producto de dos números enteros es : " + prodcutoDosEnteros(leer));
                    break;


                case 3:
                    System.out.println("El resultado del producto de tres números reales es : " + productoTresReales(leer));
                    break;

                case 4:

                    System.out.println("El resultado de la potencia es :  " + potencia(leer));
                    break;

                default:
                    System.out.println("ERROR 404-NOT FOUND. FIN DEL PROGRAMA");
                break;
            }
        } while (opcion != 5);
    }

    /**
     * 1. Producto de dos números reales, denominados num1 y num2.
     * @param leer Scanner recoge los valores introducidos.
     * @return Producto de los  números reales introducidos.
     */

    public double productoDosReales(Scanner leer) {
        System.out.print("Introduce el primer número real : ");
        double num1 = leer.nextDouble(); // Almacena el primer número real
        System.out.print("Introduce el segundo número real : ");
        double num2 = leer.nextDouble(); // Almacena el segundo número real
        return num1 * num2; // Devuelve el resultado del producto
    }

    /**
    * 1.1. Producto de dos números reales.
    * Método diseñado para pruebas unitarias
    * @param num1 Primer valor.
     * @param num2 Segundo valor.
    * @return Producto de los valores num1 y num2.
    */

    public double productoDosReales(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * 2. Producto de dos números enteros, denominados num1 y num2.
     * @param leer Scanner recoge los valores introducidos.
     * @return Producto de los números enteros introducidos.
     */

    public int prodcutoDosEnteros(Scanner leer) {
        System.out.print("Introduce el primer número entero : ");
        int num1 = leer.nextInt(); // Almacena el primer número entero
        System.out.print("Introduce el segundo número entero : ");
        int num2 = leer.nextInt(); // Almacena el segundo número entero
        return num1 * num2; // Devuelve el resultado del producto
    }

    /**
     * 2.1. Producto de dos números enteros.
     * Método diseñado para pruebas unitarias
     * @param num1 Primer valor.
     * @param num2 Segundo valor.
     * @return Producto de los valores num1 y num2.
     */
    public int prodcutoDosEnteros(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * 3. Producto de tres números reales, denominados num1, num2 y num3
     * @param leer Scanner recoge los valores introducidos.
     * @return Producto de los números enteros introducidos.
     */

    public double productoTresReales(Scanner leer) {
        System.out.print("Introduce el primer número real : ");
        double num1 = leer.nextDouble(); // Almacena el primer número real
        System.out.print("Introduce el segundo número real : ");
        double num2 = leer.nextDouble(); // Almacena el segundo número real
        System.out.print("Introduce el tercer número real : ");
        double num3 = leer.nextDouble(); // Almacena el tercer número real
        return num1 * num2 * num3; // Devuelve el resultado del producto

    }
    /**
     * 3.1. Producto de tres números reales.
     * Método diseñado para pruebas unitarias
     * @param num1 Primer valor.
     * @param num2 Segundo valor.
     * @param num3 Tercer valor.
     * @return Producto de los valores num1, num2 y num3.
     */
    public double productoTresReales(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    /**
     * 4. Potencia de dos números, denominados num1 y num2.
     * @param leer Scanner recoge los valores introducidos.
     * @return Math.pow, método estático de la clase Math que se utiliza para calcular la potencia de un número.
     */
    public double potencia(Scanner leer) {
        System.out.print("Introduce el primer número : ");
        double num1 = leer.nextInt(); // Almacena el primer número entero
        System.out.print("Introduce el segundo número : ");
        double num2 = leer.nextInt(); // Almacena el segundo número entero
        return Math.pow(num1, num2); // Devuelve el resultado de la potencia
    }
    /**
     * 4.1 Potencia de dos números
     * Método diseñado para pruebas unitarias
     * @param num1 Primer valor.
     * @param num2 Segundo valor.
     * @return Math.pow, método estático de la clase Math que se utiliza para calcular la potencia de un número.
     */
    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}