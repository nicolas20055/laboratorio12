package laboratorioPOO12;

import javax.swing.JOptionPane;

public class AnalizarNumeros {

    int numero;
    int pares = 0, negativos = 0;
    
    public void procesarNumeros() {
        for (int contador = 0; contador < 5; contador++) {
            numero = obtenerNumero("Por favor, ingrese un número:");
            
            if (numero % 2 == 0) {
                pares++;
            }
            if (numero < 0) {
                negativos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de números pares: " + pares + "\nCantidad de números negativos: " + negativos);
    }
    
    public static int obtenerNumero(String mensaje) {
        String input;
        int valor;
        
        input = JOptionPane.showInputDialog(null, mensaje);
        valor = Integer.parseInt(input);
        
        return valor;
    }
}
