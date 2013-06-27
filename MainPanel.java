package rot.pkg13.cipher;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MainPanel extends JPanel {
    public JTextArea Base, trans;
    public JButton to, from;
    public Color color1, color2;
    
    public MainPanel(){
        color1 = Color.black;
        color2 = Color.white;
               
        setOpaque(true);
        setBackground(color1);
        
        Border raisedetched = BorderFactory.createLineBorder(color2);
        
        Base = new JTextArea(5, 50);
        Base.setOpaque(true);
        Base.setBackground(color1);
        Base.setForeground(color2);
        Base.setBorder(raisedetched);
        trans = new JTextArea(5, 50);
        trans.setBackground(color1);
        trans.setOpaque(true);
        trans.setForeground(color2);
        trans.setBorder(raisedetched);
                
        to = new JButton ("Cipher");
        to.setBackground(color2);
        to.setForeground(color1);
        ButtonListenerA toLis = new ButtonListenerA();
        to.addActionListener(toLis);
        to.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel control = new JPanel();
        BoxLayout layout = new BoxLayout(control, BoxLayout.Y_AXIS);
        control.setLayout(layout);
        control.add(Base);
        control.add(Box.createRigidArea(new Dimension(0,20)));
        control.add(to);
        control.add(Box.createRigidArea(new Dimension(0,20)));
        control.add(trans);
        control.setOpaque(true);
        control.setBackground(color1);
        add(control);
    }
    
    private class ButtonListenerA implements ActionListener {
        
        public void actionPerformed (ActionEvent event) {
            StringBuilder builder = new StringBuilder();
            String s = Base.getText();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if       (c >= 'a' && c <= 'm') c += 13;
                else if  (c >= 'A' && c <= 'M') c += 13;
                else if  (c >= 'n' && c <= 'z') c -= 13;
                else if  (c >= 'N' && c <= 'Z') c -= 13;
                builder.append(c);
            }
            trans.setText(builder.toString());
        }
    }
}