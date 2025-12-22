package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Panel extends JPanel implements ActionListener, KeyListener {

    private final int WIDTH;
    private final int HEIGHT;
    private static final int GROUND_HEIGHT = 80;
    private static final int PIPE_COUNT = 4;
    private static final int PIPE_SPACING = 350;
    private boolean gameOver = false;
    private static final Font GAME_OVER_FONT = new Font("Times New Roman", Font.BOLD, 60);
    private Timer timer;
    private Bird bird;
    private Pipe pipe;
    private ArrayList<Pipe> pipes;


    public Panel(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        bird = new Bird(20, 20);
        timer = new Timer(16, this);
        timer.start();
        setFocusable(true);
        addKeyListener(this);
        pipes = new ArrayList<>();
        for (int i = 0; i < PIPE_COUNT; i++) {
            int startX = WIDTH + i * PIPE_SPACING;
            pipes.add(new Pipe(startX, HEIGHT, GROUND_HEIGHT));
        }

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

        Rectangle birdRect = new Rectangle(bird.getX(), bird.getY(), bird.getWidth(), bird.getHeight());
        for (Pipe pipe : pipes) {

            Rectangle topPipe = new Rectangle(pipe.getX(), 0, pipe.getWidth(), pipe.getHeight());
            Rectangle bottomPipe = new Rectangle(pipe.getX(), pipe.getHeight() + pipe.getGap(), pipe.getWidth(), getHEIGHT() - pipe.getHeight() - pipe.getGap() - getGROUND_HEIGHT());

            if (birdRect.intersects(topPipe) || birdRect.intersects(bottomPipe)) {
                gameOver = true;
                timer.stop();
                break;
            }
        }

        update();
        repaint();

    }

    private int getFarthestPipeX() {
        int max = 0;
        for (Pipe pipe : pipes) {
            max = Math.max(max, pipe.getX());
        }
        return max;
    }

    public void update() {

    bird.update();
        for (Pipe pipe : pipes) {
            pipe.update();

            if (pipe.getX() + pipe.getWidth() < 0) {
                pipe.setX(getFarthestPipeX() + PIPE_SPACING);
                pipe.randomizeHeight();
            }

        }


    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT- GROUND_HEIGHT);
        g.setColor(Color.orange);
        g.fillRect(0, HEIGHT- GROUND_HEIGHT, WIDTH, HEIGHT);
        bird.draw(g);
        for (Pipe pipe : pipes) {
            pipe.draw(g);
        }
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
