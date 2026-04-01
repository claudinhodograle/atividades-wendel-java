import javax.swing.*;

public class Resto {
    public static void main(String[] args) {
        JTextField n1 = new JTextField();
        JTextField n2 = new JTextField();
        JButton btn = new JButton("Resto");
        JLabel res = new JLabel();

        JFrame f = new JFrame();
        f.setLayout(new java.awt.FlowLayout());

        btn.addActionListener(e -> {
            int a = Integer.parseInt(n1.getText());
            int b = Integer.parseInt(n2.getText());
            res.setText("" + (a % b));
        });

        f.add(n1);
        f.add(n2);
        f.add(btn);
        f.add(res);

        f.setSize(250,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}