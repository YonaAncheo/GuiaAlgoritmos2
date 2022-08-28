package clases;

import javax.swing.JOptionPane;

public class ImprimirMayor {

    //evaluar 3 numero e imprimir el mayor
    //metodo para evaluar los número
    private int Evaluar(int valor1, int valor2, int valor3) {
        int valorMayor;

        if (valor1 > valor2 && valor1 > valor3) {
            valorMayor = valor1;

        } else {
            if (valor2 > valor3) {
                valorMayor = valor2;
            } else {
                valorMayor = valor3;
            }
        }
        return valorMayor;

    }

    //metodo para mostrar el valor mayor
    public void MostrarMayor(int a, int b, int c) {
        System.out.println("El mayor de los 3 valores ingresados es: " + Evaluar(a, b, c));
    }

    public static void main(String[] args) {
        //valores de entrada para solicitar al usuario
        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa en el primer valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa en el segundo valor"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa en el tercer valor valor"));

        ImprimirMayor robot = new ImprimirMayor();

        robot.MostrarMayor(n1, n2, n3);

    }

}
