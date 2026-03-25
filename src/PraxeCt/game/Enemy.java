package PraxeCt.game;

import java.awt.*;

public class Enemy {
    private int x,y,width,height, speed, hp;
    private static final Image[] ENEMY = SpriteLoader.getFrames("resources/Asteroid 01 - Explode.png", 96,96,7);
    private boolean isDead = false;
    private int index = 0;
    private int index_count = 7;
    private int animationSpeed = 0;

    public Enemy(int x, int y, int width, int height, int speed, int hp) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.hp = hp;
    }

    public void drawEnemy(Graphics g) {
    if (!isDead) {
        g.drawImage(ENEMY[0],x,y,width,height,null);
    }
    else {
        g.drawImage(ENEMY[index],x,y,width,height,null);

    }
    g.setColor(Color.RED);
    g.drawRect(getBounds().x,getBounds().y,getBounds().width,getBounds().height);
    }

    public Rectangle getBounds() {
        return new Rectangle(x + ((getWidth()/2)/2),y + ((getHeight() /2)/2),getWidth()/2,getHeight()/2);
    }

    public boolean isCollision(Player player) {
        return player.getBounds().intersects(this.getBounds());

    }

    public void dyingAnimation(){
       // System.out.println("ffff");
      //  if (isDead){
        isDead = true;
            animationSpeed++;
            if (animationSpeed >= 20) {
                if (index < index_count - 1) {
                    index++;

                }
                else {

                }
                animationSpeed = 0;
      //      }
    }
    }


    public int getX() {return x;}
    public int getY() {return y;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}


    public int getIndex() {
        return index;
    }
}
