import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;



public class Position {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}
