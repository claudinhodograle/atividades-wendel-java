import javax.swing.*;
import java.awt.event.*;

public class BomDia {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Mensagem");
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField nome = new JTextField();
        nome.setBounds(50,20,200,30);

        JButton botao = new JButton("Mostrar");
        botao.setBounds(100,60,100,30);

        JLabel res = new JLabel();
        res.setBounds(50,100,200,30);

        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                res.setText("Bom dia " + nome.getText());
            }
        });

        frame.add(nome);
        frame.add(botao);
        frame.add(res);

        frame.setVisible(true);
    }
}