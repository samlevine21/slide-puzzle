import javax.swing.JFrame;
/**
 * Write a description of class Game here.
 *
 * @author (Sam Levine)
 * @version (2/11/2020)
 */
public class Game
{
    public static void main(String[] args) {
        JFrame window = new JFrame("Slide Puzzle");
        window.setSize(416, 439);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Draw());
        window.setVisible(true);
        window.setResizable(false);
    }
}
