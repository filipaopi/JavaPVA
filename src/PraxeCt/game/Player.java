package PraxeCt.game;

import java.awt.*;
import java.util.ArrayList;

public class Player {
    private int x,y,width,height, speed, hp;
    private static final Image[] SHIP_ENGINE = SpriteLoader.getFrames("resources/ship/engine.png", 64, 64, 8);
    private static final Image SHIP_BODY = SpriteLoader.load("resources/ship/ship.png");

    private int index = 0;
    private int index_count = 8;
    private int animationSpeed = 10;

    public Player(int x, int y, int width, int height, int speed, int hp) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.hp = hp;
        
    }
    
    public void drawPlayer(Graphics g){
        g.drawImage(SHIP_ENGINE [index],x,y,width,height,null);
        g.drawImage(SHIP_BODY,x,y,width,height,null);
        g.drawRect(getBounds().x,getBounds().y,getBounds().width,getBounds().height);

    }

    public void animation(ArrayList<Enemy> enemyList) {
        animationSpeed++;
        System.out.println(enemyList.size());
        if (animationSpeed >= 7) {
            index++;
            if (index == index_count) {
                index = 0;

            }
            animationSpeed = 0;
        }
        else  {
            enemyList.remove(this);
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x + ((getWidth()/2)/2),y + ((getHeight()/2)/2),getWidth()/2,getHeight()/2);
    }



    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}
    public int getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}
    public int getIndex() {return index;}
    public void setIndex(int index) {this.index = index;}
    public int getIndex_count() {return index_count;}
    public void setIndex_count(int index_count) {this.index_count = index_count;}
}


