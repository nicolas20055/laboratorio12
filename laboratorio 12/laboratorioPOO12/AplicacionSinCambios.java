package laboratorioPOO12;

import javax.swing.JOptionPane;

public class AplicacionSinCambios {

    public static void main(String[] args) {
        String input;
        double base;
        double altura;
        double area;
        
        input = JOptionPane.showInputDialog(null, "Por favor, ingrese la medida de la base: ");
        base = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Por favor, ingrese la medida de la altura: ");
        altura = Double.parseDouble(input);
        
        area = base * altura;
        JOptionPane.showMessageDialog(null, "El área calculada es: " + area);
    }
}
