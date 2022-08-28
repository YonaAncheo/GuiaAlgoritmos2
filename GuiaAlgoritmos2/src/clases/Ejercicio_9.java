package clases;

import javax.swing.JOptionPane;

public class Ejercicio_9 {
//9. Desarrolle un algoritmo en que se ingresa el sueldo imponible
//de un trabajador. Calcular y mostrar
// Descuento AFP: corresponde al 12% del sueldo imponible.
// Descuento salud: corresponde al 7% del sueldo imponible.
// Sueldo líquido, que corresponde al sueldo imponible – total
//descuentos.
    
    //metodo para calcular el descuento de AFP, 12%
    private float AFP(float sueldo){
        float afp;
        
        afp = (sueldo * 12)/100;
        return afp;
    }
    
    //metodo para calcular el descuento de salud, 7%
    private float Salud(float sueldo){
        float salud;
        
        salud = (sueldo * 7)/100;
        return salud;
    }
    
    //metodo para calcular el sueldo Liquido
    private float SueldoLiquido(float sueldo){
        float liquido;
        
        liquido = sueldo - Salud(sueldo) - AFP(sueldo);
        return liquido;
        
    }
    
    //mostrar resultados
    public void MostrarResultados(float sueldo){
        System.out.println("El sueldo ingresado es " + sueldo);
        System.out.println("El descuento por AFP es: " + AFP(sueldo));
        System.out.println("El descuento por Salud es: " + Salud(sueldo));
        System.out.println("El sueldo liquido a recibir sera: " + SueldoLiquido(sueldo));
        System.out.println("===============================================================");
    }
    
    
    public static void main(String[] args) {
        //entreda será el sueldo
        float sueldo;
        sueldo = Float.parseFloat(JOptionPane.showInputDialog("BIENVENID@. Ingresa tu sueldo para realizar los calculos correspondientes: "));
        
        Ejercicio_9 robot = new Ejercicio_9();
        
        robot.MostrarResultados(sueldo);
    }

}
