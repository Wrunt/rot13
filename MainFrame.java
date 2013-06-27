package rot.pkg13.cipher;
import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    public MainFrame() {
        JFrame frame = new JFrame ("ROT-13 Cipher");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 250));

        MainPanel panel = new MainPanel();
        frame.getContentPane().add(panel);
        frame.setBackground(panel.color1);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        frame.pack();
        frame.setVisible(true);
    }
}