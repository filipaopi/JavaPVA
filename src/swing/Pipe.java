package swing;

import java.awt.*;

public class Pipe {
    private int pipeHeight;
    private final int pipeWidth = 60;
    private final int gameWidth;
    private final int gameHeight;
    private final int GROUND_HEIGHT;
    private int pipeX;
    private final int pipeGap = 150;

    public Pipe(int gameWidth, int gameHeight, int GROUND_HEIGHT) {
        this.gameWidth = gameWidth;
        this.gameHeight = gameHeight;
        this.GROUND_HEIGHT = GROUND_HEIGHT;
        this.pipeX = gameWidth;
        pipeHeight = (int) (Math.random() * 350) +1;
    }

    public void update() {
        pipeX = pipeX - 1;

    }


    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(pipeX, 0, pipeWidth, pipeHeight);
        g.fillRect(pipeX, pipeHeight+pipeGap, pipeWidth, gameHeight-pipeGap-pipeHeight - GROUND_HEIGHT);
    }

    public void randomizeHeight() {
        pipeHeight = (int) (Math.random() * 400) +1;

    }

    public int getGap() {
        return pipeGap;
    }

    public int getX() {
        return pipeX;
    }

    public void setX(int pipeX) {
        this.pipeX = pipeX;
    }

    public int getWidth() {
        return pipeWidth;
    }

    public int getHeight() {
        return pipeHeight;
    }
}
