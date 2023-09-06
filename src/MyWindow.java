import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
import java.net.URL;

public class MyWindow extends JFrame {
    private JPanel contentPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyWindow();
        });
    }

    public MyWindow() {

        JFrame frame = new JFrame("Chat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        
        
    }
}
