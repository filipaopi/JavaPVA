package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel extends JPanel implements ActionListener, KeyListener {

    private final int WIDTH;
    private final int HEIGHT;
    private static final int GROUND_HEIGHT = 80;
    private boolean gameOver = false;
    private static final Font GAME_OVER_FONT = new Font("Times New Roman", Font.BOLD, 60);
    private Timer timer;
    private Bird bird;
    private Pipe pipe;


    public Panel(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        bird = new Bird(20, 20);
        timer = new Timer(16, this);
        timer.start();
        setFocusable(true);
        addKeyListener(this);
        pipe = new Pipe(WIDTH, HEIGHT, GROUND_HEIGHT);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (bird.getY() == HEIGHT-GROUND_HEIGHT-bird.getHeight()) {

            gameOver = true;
        }
        if (gameOver) {
            timer.stop();
            repaint();
            return;
        }
        update();
        repaint();

    }

    public void update() {

    bird.update();
    pipe.update();

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT- GROUND_HEIGHT);
        g.setColor(Color.orange);
        g.fillRect(0, HEIGHT- GROUND_HEIGHT, WIDTH, HEIGHT);
        bird.draw(g);
        pipe.draw(g);
        if  (gameOver) {
            g.setColor(Color.green);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(Color.red);
            g.setFont(GAME_OVER_FONT);
            g.drawString("GAME OVER", 150 , HEIGHT/2);
        }

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            bird.jump();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getGROUND_HEIGHT() {
        return GROUND_HEIGHT;
    }
    public void setGameOver(){
        gameOver = true;
    }
}
