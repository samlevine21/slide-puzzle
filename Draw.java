import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Game here.
 *
 * @author (Sam Levine)
 * @version (2/11/2020)
 */
public class Draw extends JPanel
{
    private Puzzle puz;
    public Draw() {
     puz = new Puzzle();
     setLayout(new BorderLayout());
     add(puz, BorderLayout.CENTER);
     this.repaint();
    }
}
