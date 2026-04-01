import javax.swing.*;
import java.awt.event.*;

public class Resto {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Resto da Divisão");

        JTextField n1 = new JTextField();
        n1.setBounds(50, 30, 100, 30);

        JTextField n2 = new JTextField();
        n2.setBounds(50, 70, 100, 30);

        JButton btn = new JButton("Resto");
        btn.setBounds(50, 110, 100, 30);

        JLabel res = new JLabel();
        res.setBounds(50, 150, 200, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(n1.getText());
                    int num2 = Integer.parseInt(n2.getText());

                    if (num2 == 0) {
                        res.setText("Não pode dividir por zero!");
                    } else {
                        res.setText("Resultado: " + (num1 % num2));
                    }
                } catch (NumberFormatException ex) {
                    res.setText("Digite números válidos!");
                }
            }
        });

        frame.add(n1);
        frame.add(n2);
        frame.add(btn);
        frame.add(res);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}