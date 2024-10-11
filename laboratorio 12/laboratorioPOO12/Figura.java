package laboratorioPOO12;

import javax.swing.JOptionPane;

public class Figura {

    private double base;
    private double altura;
    
    public void solicitarDatos() {
        String input;
        
        input = JOptionPane.showInputDialog(null, "Por favor, ingrese la medida de la base: ");
        base = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Por favor, ingrese la medida de la altura: ");
        altura = Double.parseDouble(input);
    }
    
    public void calcularArea() {
        double area;
        
        area = base * altura;
        
        JOptionPane.showMessageDialog(null, "El área calculada es: " + area);
    }
}
