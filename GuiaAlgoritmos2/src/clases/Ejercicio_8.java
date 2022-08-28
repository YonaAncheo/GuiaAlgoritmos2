package clases;

import java.util.Scanner;

public class Ejercicio_8 {
//8. Una empresa aumentará el sueldo base de los trabajadores en un
//25% Un trabajador necesita conocer a cuánto ascenderá el nuevo
//monto a percibir. Ingresar el sueldo base actual, calcular y
//mostrar el nuevo monto que ganará el trabajador.    

    static Scanner in = new Scanner(System.in);

    //metodo para realizar el incremento del sueldo
    public float CalculoSueldo(float a) {
        float sueldoNuevo;
        sueldoNuevo = (a * 125) / 100;

        return sueldoNuevo;
    }

    //metodo para mostrar resultados
    public void MostrarResultados(float b) {

        System.out.println("Al aumentar el sueldo en un 25%, el nuevo sueldo sera: " + CalculoSueldo(b) );
    }

    public static void main(String[] args) {

        //entrada solicitada al usuario
        float sueldo;
        System.out.println("Ingresa el sueldo: ");
        sueldo = in.nextFloat();
        Ejercicio_8 robot = new Ejercicio_8();

        
        robot.MostrarResultados(sueldo);

    }

}
