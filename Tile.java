/**
 * Write a description of class Game here.
 *
 * @author (Sam Levine)
 * @version (2/11/2020)
 */
public class Tile
{
    private int finalRow;
    private int finalCol;
    private String faceVal;
    
    public Tile(int r, int c, String val) {
        finalRow = r;
        finalCol = c;
        faceVal = val;
    }
    
    public void setFaceVal(String val) {
        faceVal = val;
    }
    
    public String getFace() {
        return faceVal;
    }
    
    public boolean isSet(int r, int c) {
        return r == finalRow && c == finalCol;
    }
}
