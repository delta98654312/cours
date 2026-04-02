import javax.swing.*;

import java.awt.event.*;

public class MonApplication extends JFrame {

    public MonApplication() {

        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        var label = new JLabel();
        label.setText("test");
        var text = new JTextField("Nom: ");

        add(text);
        add(label);
    }

    public static void main(String[] args) {
        new MonApplication();
    }
}