package clases;

import java.util.Scanner;

public class Ejercicio_7 {

//7. Una persona necesita cambiar el monto equivalente en $ a US$.
//Sabiendo que el valor del dólar cambia diariamente, ingresarlo y
//el monto en pesos que la persona desea cambiar. Mostrar el monto
//transformado en dólares.
    Scanner in = new Scanner(System.in);
    //los datos de entrada serán el monto en pesos
    float pesos;
    float dolares, transformacion;
    float dolarDiario;

    //metodo para bienvenida
    public void Bienvenida() {
        System.out.println("---------------------------------------------------");
        System.out.println("------PROGRAMA CAMBIO CALCULO PESO - DOLAR---------");
        System.out.println("---------------------------------------------------");

    }

    public void SolicitarMontos1() {

        System.out.println("---------------------------------------------------");
        System.out.println("--- Has seleccionado cambio Peso a Dolar.");
        System.out.println("--- Ingresa el monto en pesos que deseas calcular: ");
        pesos = in.nextFloat();

    }

    public void SolicitarMontos2() {

        System.out.println("---------------------------------------------------");
        System.out.println("--- Has seleccionado cambio Dolar a Peso.");
        System.out.println("--- Ingresa el monto en dolares que deseas calcular: ");
        dolares = in.nextFloat();

    }

    //metodo para consultar al usuario si quiere cambio de dolar-peso o peso-dolar
    public boolean TipoDeCambio() {
        int tipoDeCambio;
        boolean bandera = true;

        System.out.println("--- Que tipo de cambio deseas ralizar/");
        System.out.println("--- Ingresa 1. Peso a dolar.");
        System.out.println("--- Ingresa 2. Dolar a peso.");
        tipoDeCambio = in.nextInt();

        if (tipoDeCambio == 1) {
            bandera = true;
        } else {
            if (tipoDeCambio == 2) {
                bandera = false;
            } else {
                System.out.println("Error, la opción ingresada no existe.");
                System.exit(0);
            }
        }
        return bandera;

    }

    //metodo para indicar precio del dolar diario
    public float PrecioDolar() {
        dolarDiario = 930;
        return dolarDiario;
    }

    //metodo para realizar el cambio
    public void Calculo1() {

        transformacion = pesos / PrecioDolar();

    }

    public void Calculo12() {
        transformacion = dolares * PrecioDolar();
    }

    //metodo para mostrar resultados
    public void MostrarResultados1() {

        System.out.println("---------------------------------------------------");
        System.out.println("--- Monto en pesos ingresados: " + pesos);
        System.out.println("--- El monto en dolares correspondiente es: " + transformacion);

    }

    public void MostrarResultados2() {
        System.out.println("---------------------------------------------------");
        System.out.println("--- Monto en dolar ingresados: " + dolares);
        System.out.println("--- El monto en pesos correspondiente es: " + transformacion);

    }
//metodo para finalizar

    public void Finalizar() {
        System.out.println("=======================================================");
        System.out.println("=========GRACIAS POR UTILIZAR EL PROGRAMA==============");
        System.out.println("=======================================================");
    }

    //metodo main
    public static void main(String[] args) {

        Ejercicio_7 robot = new Ejercicio_7();

        robot.Bienvenida();
        do {

            if (robot.TipoDeCambio() == true) {
                robot.SolicitarMontos1();
                robot.Calculo1();
                robot.MostrarResultados1();

            } else {
                robot.SolicitarMontos2();
                robot.Calculo12();
                robot.MostrarResultados2();

            }
            System.out.println("=================================================");
        } while (true);

    }

}
