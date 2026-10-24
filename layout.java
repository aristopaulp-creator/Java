import java.awt.*;
import javax.swing.*;

public class layout {
    JFrame f;

    layout(){
        f = new JFrame();

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("Center");
        JButton b4 = new JButton("East");
        JButton b5 = new JButton("West");

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.CENTER);
        f.add(b4, BorderLayout.EAST);
        f.add(b5, BorderLayout.WEST);

        f.setSize(300,300);
        f.setVisible(true);
    }
    
    public static void main (String[] args){
        new layout();
        
    }
}
