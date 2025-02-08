package javabeans;

import java.util.Objects;

public class Cociente_Euken {

    private double numReal1;
    private double numReal2;

    private int numEntero1;
    private int numEntero2;

    //Constructor

    public Cociente_Euken() {
        this.numReal1 = numReal1;
        this.numReal2 = numReal2;
    }


    // Getter and setter

    public double getnumReal1() {
        return numReal1;
    }

    public double getnumReal2() {
        return numReal2;
    }

    public void setnumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }

    public void setnumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }


    //Equals y hascode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cociente_Euken that = (Cociente_Euken) o;
        return Double.compare(numReal1, that.numReal1) == 0 && Double.compare(numReal2, that.numReal2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numReal1, numReal2);
    }


    //toString

    @Override
    public String toString() {
        return "Cociente_Euken{" + "numReal1=" + numReal1 + ", numReal2=" + numReal2 + '}';
    }


    //Métodos propios

    //Método1

    public void divisionReales(double numReal1, double numReal2){
        if (numReal2 != 0) {
            double resultado = numReal1 / numReal2;
            System.out.println("El resultado de la division real es " + resultado);
        }
        else {
            System.out.println("El cálculo de la division real es nulo.");
        }
    }   

    //Método2

    public void divisionEnteros(int numEntero1, int numEntero2){
        if (numEntero2 != 0) {
            int resultado = numEntero1 / numEntero2;
            System.out.println("El resultado de la division entera es " + resultado);
        }
        else {
            System.out.println("El cálculo de la division entera es nulo");
        }
    }

    //Método3

    public void inversoReales(double numReal2){
        if (numReal2 != 0) {
            double resultado = 1 / numReal2;
            System.out.println("El resultado del inverso real es " + resultado);
        }
        else {
            System.out.println("El resultado del inverso es nulo");
        }
    }

    //Método4

    public void raizNumero(double numReal1){
        if (numReal1 >= 0) {
            double resultado = Math.sqrt(numReal1);
            System.out.println("El resultado del raiz cuadrada es " + resultado);
        }
        else {
            System.out.println("El resultado del raiz cuadrada es nulo");
        }
    }

}