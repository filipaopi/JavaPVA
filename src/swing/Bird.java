package swing;

import java.awt.*;

public class Bird {

    final private int x;
    private int y;

    final private int width = 50;
    final private int height = 50;
    final int gravity = 1;
    final int jumpHeight = 30;


    public Bird(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void jump() {
        y = y - jumpHeight;
    }

    public void update() {
        y = y + gravity;

    }

    public void draw(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(x, y, width, height);
    }

    public int getY() {
        return y;
    }
    public int getWidth() {return width;}
    public int getX() {return x;}
    public int getHeight() {
        return height;
    }
}
