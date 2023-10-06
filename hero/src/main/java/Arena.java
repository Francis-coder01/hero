import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Arena {
    private int width;
    private int height;
    private Hero hero;
    private List<Wall> walls;
    private List<Coin> coins;
    public Arena(int width, int height){
        this.width = width;
        this.height = height;
        hero = new Hero(10,10);
        this.walls = createWalls();
        this.coins = createCoins();
    }
    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }
        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }
        return walls;
    }
    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            while(true) {
                Position coinPosition = new Position(random.nextInt(width - 2) + 1,
                        random.nextInt(height - 2) + 1);
                if (coinPosition.equals(hero.getPosition())) continue;
                boolean flag = false;
                for (Wall wall : walls){
                    if (coinPosition.equals(wall.getPosition())) {flag = true; break;}
                }
                if (flag) continue;
                coins.add(new Coin(coinPosition.getX(), coinPosition.getY()));
                break;
            }
        }
        return coins;
    }

    public void processKey(KeyStroke key) {
        switch (key.getKeyType()) {
            case ArrowUp:
                moveHero(hero.moveUp());
                break;
            case ArrowDown:
                moveHero(hero.moveDown());
                break;
            case ArrowLeft:
                moveHero(hero.moveLeft());
                break;
            case ArrowRight:
                moveHero(hero.moveRight());
                break;
        }
    }
    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
        for(Coin coin : coins) {
            if (position.equals(coin.getPosition())) retrieveCoins(position);
            }
        }
    public boolean canHeroMove(Position position){
        for(Wall w : walls){
            if(w.getPosition().equals(position))
                return false;
        }
        return (position.getX() >= 0 && position.getX() < width
                && position.getY() >= 0 && position.getY() < height);
    }
    private void retrieveCoins(Position position){
        for (Iterator<Coin> it = coins.iterator(); it.hasNext();){
            Coin coin = it.next();
            if(coin.getPosition().equals(position)) {
                it.remove();
                break;
            }
        }
    }
    public void draw(TextGraphics graphics){
        hero.draw(graphics);
        for (Wall wall : walls)
            wall.draw(graphics);
        for (Coin coin : coins)
            coin.draw(graphics);
    }
}
