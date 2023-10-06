import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Element {
    private Position position;
    public Element(Position position) {
        this.position = position;
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
    public abstract void draw(TextGraphics graphics);
}
