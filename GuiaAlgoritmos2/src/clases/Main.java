package clases;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
        int suma;
        Ejemplo robot = new Ejemplo();
        suma = robot.Suma(numero1, numero2);
        System.out.println("el valor de la suma es " + suma);
    }
}
