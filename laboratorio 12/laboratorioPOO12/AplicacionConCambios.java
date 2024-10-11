package laboratorioPOO12;

import javax.swing.JOptionPane;

public class AplicacionConCambios {

    public static void main(String[] args) {
        double base;
        double altura;
        
        base = obtenerDato("Por favor, ingrese la longitud de la base: ");
        altura = obtenerDato("Por favor, ingrese la altura: ");
        mostrarArea(base, altura);
    }

    public static double obtenerDato(String mensaje) {
        String input;
        double valorNumerico;
        
        input = JOptionPane.showInputDialog(null, mensaje);
        valorNumerico = Double.parseDouble(input);
        
        return valorNumerico;
    }

    public static void mostrarArea(double base, double altura) {
        double area;
        
        area = base * altura;
        
        JOptionPane.showMessageDialog(null, "El área calculada es: " + area);
    }
}

	
