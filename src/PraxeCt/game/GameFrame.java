package PraxeCt.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

public class GameFrame extends JPanel implements MouseListener, MouseMotionListener {

    private boolean GameOver = false;

    ArrayList<Enemy> enemyList = new ArrayList<>();

    Player player;
    Enemy enemy;

    private long lastTime = System.nanoTime();
    private static double dt;

    public GameFrame() {
        addMouseListener(this);
        addMouseMotionListener(this);
        player = new Player(50,10,256,256,1,10);
        //enemy = new Enemy(350, 350, 256, 256, 1,1);
         addEnemy();
         addEnemy();

        new Timer(16, e -> {
          /*  long now = System.nanoTime();
            dt = (now - lastTime) / 1_000_000_000_0;
            lastTime = now;
*/
            if (!GameOver) {
                player.animation(enemyList);
                for (Enemy enemy : enemyList) {
                    if (enemy.isCollision(player)) {
                        enemy.dyingAnimation();
                    }
                }
            }

        repaint();
        }).start();
    }


    public void addEnemy(){
        Random rand = new Random();
        int randomX = rand.nextInt(0, 900);
        enemyList.add(new Enemy(randomX,-100,256,256,1,1));
    }

    public void removeEnemy(Enemy enemy){
        enemyList.remove(enemy);
    }



    @Override protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        player.drawPlayer(g);
        for (Enemy enemy:enemyList){
            enemy.drawEnemy(g);

        }

    }




    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseDragged(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {
        player.setX(e.getX() - player.getWidth() / 2);
        player.setY(e.getY() - player.getHeight() / 2);

    }
}
