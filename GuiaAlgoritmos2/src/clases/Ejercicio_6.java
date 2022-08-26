package clases;

import java.util.Scanner;

public class Ejercicio_6 {

//Un profesor necesita conocer qué porcentaje de hombres y el de
//mujeres que hay en un grupo de estudiantes. Ingresar la cantidad
//de mujeres y la de hombres existentes en un curso, calcular y
//mostrar el equivalente en porcentaje.
    Scanner in = new Scanner(System.in);
    //entrada solicitada a usuarios será la cantidad de hombres y mujeres.
    float mujeres, hombres;
    final int CIEN = 100;
    float phombre, pmujeres;

    public void SolicitarDatos() {
        System.out.println("-----------------------------------------------");
        System.out.println("------------------EJERCICIO6-------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("--- Ingrese la cantidad de hombres en el curso: ");
        hombres = in.nextInt();
        System.out.println("--- Ingrese la cantidad de mujeres en el curso: ");
        mujeres = in.nextInt();

    }

    //cantidad total de estudiantes
    public float EstudiantesTotal() {
        float total = mujeres + hombres;
        return total;
    }

    //metodo para el calculo del pocentajes
    public void Porcentajes() {

        phombre = (hombres / EstudiantesTotal()) * CIEN;
        pmujeres = (mujeres / EstudiantesTotal()) * CIEN;

    }

    //metodo para mostrar resultados
    public void MostrarResultados() {
        System.out.println("-----------------------------------------------");
        System.out.println("--- El total de estudiantes en el grupo es de " + EstudiantesTotal() + ".");
        System.out.println("--- El porcentaje de mujeres en el grupo es de " + pmujeres + ".");
        System.out.println("--- El porcentaje de hombres en el grupo es de " + phombre + ".");
        System.out.println("===============================================");
        System.out.println("================FIN DEL PROGRAMA===============");
        System.out.println("===============================================");
    }

}
