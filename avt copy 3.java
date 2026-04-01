import javax.swing.*;
import java.awt.event.*;

public class Calculadora {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setSize(300,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField n1 = new JTextField();
        n1.setBounds(50,20,200,30);

        JTextField n2 = new JTextField();
        n2.setBounds(50,60,200,30);

        JButton botao = new JButton("Calcular");
        botao.setBounds(90,100,120,30);

        JLabel res = new JLabel();
        res.setBounds(50,140,200,60);

        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                double a = Double.parseDouble(n1.getText());
                double b = Double.parseDouble(n2.getText());

                res.setText("<html>" +
                "Soma: " + (a+b) + "<br>" +
                "Subtração: " + (a-b) + "<br>" +
                "Multiplicação: " + (a*b) + "<br>" +
                "Divisão: " + (a/b) +
                "</html>");
            }
        });

        frame.add(n1);
        frame.add(n2);
        frame.add(botao);
        frame.add(res);

        frame.setVisible(true);
    }
}