import javax.swing.*;

public class MaiorMenor {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Número 1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Número 2"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Número 3"));

        int maior = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));

        JOptionPane.showMessageDialog(null, "Maior: " + maior + " | Menor: " + menor);
    }
}