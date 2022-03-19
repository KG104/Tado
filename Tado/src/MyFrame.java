import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Toda");
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
    }
}