import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Write a description of class Game here.
 *
 * @author (Sam Levine)
 * @version (2/11/2020)
 */
public class Puzzle extends JPanel implements MouseListener
{
    private static final int ROWS = 4;
    private static final int COLS = 4;
    private static final int SIZE = 100;
    private PuzzleLogic p = new PuzzleLogic();
    private Font font;
    
    public Puzzle() {
        font = new Font("SegoeUI", Font.BOLD, 50);
        setLayout(new BorderLayout());
        setBackground(Color.black);
        addMouseListener(this);
    }
    
    public void paintComponent(Graphics g) {
        String face = "";
        super.paintComponent(g);
        for (int r = 0; r < ROWS; r++)
            for (int c = 0; c < COLS; c++) {
                int xPos = c * SIZE;
                int yPos = r * SIZE;
                face = p.getTile(r, c).getFace();
                if (face != null) {
                    g.setColor(Color.white);
                    g.fillRect(xPos + 2, yPos + 2, SIZE - 4, SIZE - 4);
                    g.setColor(Color.black);
                    g.setFont(font);
                    g.drawString(face, xPos + 20, yPos + (3 * SIZE)/4);
                }
            }
    }
    
    public void mousePressed(MouseEvent e) {
        int c = e.getX()/SIZE;
        int r = e.getY()/SIZE;
        p.move(r, c);
        this.repaint();
    }
    
    public void mouseClicked (MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered (MouseEvent e) {}
    public void mouseExited  (MouseEvent e) {}
}
