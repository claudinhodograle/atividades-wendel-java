import javax.swing.*;
import java.awt.event.*;

public class MostrarNome {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Mostrar Nome");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField nome = new JTextField();
        nome.setBounds(50,20,200,30);

        JButton botao = new JButton("Mostrar");
        botao.setBounds(100,60,100,30);

        JLabel res = new JLabel("");
        res.setBounds(50,100,200,30);

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = nome.getText();
                res.setText(texto);
            }
        });

        frame.add(nome);
        frame.add(botao);
        frame.add(res);

        frame.setVisible(true);
    }
}