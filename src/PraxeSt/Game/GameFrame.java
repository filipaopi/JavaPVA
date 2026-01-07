package PraxeSt.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

public class GameFrame extends JPanel implements MouseMotionListener {


    ArrayList<Rectangle> enemyList = new ArrayList<>();
    Rectangle player = new Rectangle(100,100 , 40, 140);

    public GameFrame(){
        addMouseMotionListener(this);
        new Timer(16, e -> {

         //   if (player.intersects(enemy)) {}

            if (enemyList.size() < 20) addEnemy();
            enemyMove();
            repaint();
        }).start();
    }

    public void addEnemy(){
        Random rand = new Random();
        enemyList.add(new Rectangle(rand.nextInt(0, 900), rand.nextInt(0, 900), 10, 10));
    }

    public void enemyMove(){
        int speed = 1;
        for (Rectangle enemy:enemyList) {

            if (player.x > enemy.x) enemy.x+=speed;
            if (player.x < enemy.x) enemy.x-=speed;
            if (player.y > enemy.y) enemy.y+=speed;
            if (player.y < enemy.y) enemy.y-=speed;
        }
    }


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.black);
        g.setColor(Color.GREEN);
        g.fillRect(player.x,  player.y, player.width, player.height);
        g.setColor(Color.RED);

        for (Rectangle enemy: enemyList){
            g.drawRect(enemy.x, enemy.y, enemy.width, enemy.height);

        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }


    @Override
    public void mouseMoved(MouseEvent e) {
    player.x = e.getX() - (player.width / 2);
    player.y = e.getY() - (player.height / 2);
    }
}
