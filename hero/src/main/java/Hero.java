import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import org.w3c.dom.Text;

import java.io.IOException;

public class Hero {
    private Position position;
    public Hero(int x, int y) {
        this.position = new Position(x,y);
    }
    public void setPosition(Position position){
        this.position = position;
    }
    public Position getPosition(){
         return position;
    }
    public Position moveUp(){
        return new Position(position.getX(), position.getY() - 1);
    }
    public Position moveDown(){
        return new Position(position.getX(), position.getY() + 1);
    }
    public Position moveRight(){
        return new Position(position.getX() +1, position.getY());
    }
    public Position moveLeft(){
        return new Position(position.getX() -1, position.getY());
    }
    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
                graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(),
                position.getY()), "X");
    }

}
