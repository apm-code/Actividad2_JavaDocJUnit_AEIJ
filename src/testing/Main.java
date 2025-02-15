package testing;

import javabeans.Suma_Adri;
import javabeans.Resta_Nacho;
import javabeans.Producto_Javier;
import javabeans.Cociente_Euken;
import java.util.Scanner;

/**
 * Clase principal (Main) que ejecuta el programa Calculadora.
 * Permite, a través de un menú, seleccionar la operación matemática que se
 * desea realizar. A saber: suma, resta, producto o cociente.
 *
 * @author Adrián I. Pérez
 * @author Euken Sáez
 * @author Ignacio Martínez
 * @author Javier García
 * @version 1.1
 */
public class Main {
    public static void main(String[] args) {
        /* Inicia el objeto de la clase Scanner, que permite obtener datos
         * por consola.
         */
        Scanner leer = new Scanner(System.in);

        // Creación de los objetos correspondientes a las cuatro operaciones.
        Suma_Adri suma = new Suma_Adri();
        Resta_Nacho resta = new Resta_Nacho();
        Producto_Javier producto = new Producto_Javier();
        Cociente_Euken cociente = new Cociente_Euken();
        int opcion;

        // Bucle do-while que muestra el menú de operaciones.
        do {
            opcion = pintarPrimerMenu(leer);

            switch (opcion) {
                case 1:
                    suma.menuSuma(leer); /* Llama al menú de la suma, contenido
                                          * en la clase Suma_Adri
                                          */
                    break;
                case 2:
                    resta.menuResta(leer);
                    break;
                case 3:
                    producto.menuProducto(leer);
                    break;
                case 4:
                    cociente.menuCociente(leer);
                    break;
            }
        } while (opcion != 5); // El bucle se mantiene hasta seleccionar la opción 5.
        System.out.println("Fin del programa Calculadora");

        leer.close();
    }

    /**
     * Método que muestra el por consola el menú principal de las operaciones
     * @param leer Scanner recoge la opción introducida.
     * @return Devuelve la opción correspondiente al método escogido.
     */
    public static int pintarPrimerMenu(Scanner leer) {
        int opcion;

        System.out.println("- - - - - - - - - -");
        System.out.println("- - CALCULADORA - -");
        System.out.println("- - - - - - - - - -");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. Cociente");
        System.out.println("5. Salir");

        System.out.println("Selecciona una opción:");
        opcion = leer.nextInt();

        // Bucle while que indica como inválida una opción fuera del rango.
        while (opcion < 1 || opcion > 5) {
            System.out.println("Opción incorrecta, introduce un valor del 1 al 5.");
            opcion = leer.nextInt();
        }
        return opcion;
    }

}