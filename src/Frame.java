import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private Convex o;
    public Frame(Convex o) {
        this.o = o;
        this.setSize(400, 400);
        this.setVisible(true);
        this.setResizable(true);
    }

    @Override
    public void paint(Graphics g){
        o.draw(g);
    }
}
