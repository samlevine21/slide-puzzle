/**
 * Write a description of class Game here.
 *
 * @author (Sam Levine)
 * @version (2/11/2020)
 */
public class PuzzleLogic
{
    private static final int ROWS = 4;
    private static final int COLS = 4;
    private Tile[][] puz;
    private Tile blank;
    
    public PuzzleLogic() {
        puz = new Tile[ROWS][COLS];
        reset();
    }
    
    public Tile getTile(int r, int c) {
        return puz[r][c];
    }
    
    public void reset(){
        int val = 1;
        for (int r = 0; r < ROWS; r++)
           for (int c = 0; c < COLS; c++) {
              puz[r][c] = new Tile(r, c, String.valueOf(val));
              val++;
           }
        
        blank = puz[ROWS-1][COLS-1];
        blank.setFaceVal(null);
        
        for (int r = 0; r < ROWS; r++)
            for (int c = 0; c < COLS; c++) {
                swapTiles(r, c, (int) (Math.random() * ROWS), (int) (Math.random() * COLS));
            }
    }
    
    public boolean move(int r, int c) {
        //up
        if (r + 1 < ROWS && puz[r + 1][c] == blank)
            swapTiles(r, c, r + 1, c);
        //down
        if (r - 1 >= 0 && puz[r - 1][c] == blank)
            swapTiles(r, c, r - 1, c);
        //right
        if (c + 1 < COLS && puz[r][c + 1] == blank)
            swapTiles(r, c, r, c + 1);
        //left
        if (c - 1 >= 0 && puz[r][c - 1] == blank)
            swapTiles(r, c, r, c - 1);
        return false;
    }
    
    private boolean swapTiles(int r1, int c1, int r2, int c2) {
        Tile temp = puz[r1][c1];
        puz[r1][c1] = puz[r2][c2];
        puz[r2][c2] = temp;
        return true;
    }
    
    public boolean gameOver() {
        for (int r=0; r<ROWS; r++)
            for (int c=0; c<ROWS; c++) {
                Tile test = puz[r][c];
                return test.isSet(r, c);
            }
        return true; 
    }
}
