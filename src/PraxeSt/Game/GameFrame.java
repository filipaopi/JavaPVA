package PraxeSt.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

public class GameFrame extends JPanel implements MouseMotionListener, MouseListener {


    ArrayList<Rectangle> enemyList = new ArrayList<>();

    Rectangle player = new Rectangle(100,100 , 40, 40);
    boolean GameOver = false;
    final int fullHP = 100;
    int hp = 100;


    public GameFrame(){
        addMouseMotionListener(this);
        addMouseListener(this);
        new Timer(16, _ -> {

            if(!GameOver){
                if (enemyList.size() < 30) addEnemy();
                colisionEnemy();
                enemyMove();
                repaint();
            }

        }).start();
    }

    public void addEnemy(){
        Random rand = new Random();
        int randomX = rand.nextInt(0, 900);
        int randomY = rand.nextInt(0, 900);
        enemyList.add(new Rectangle(randomX, randomY, 10, 10));

    }

    public void colisionEnemy(){

        for (Rectangle enemy:enemyList){
            if (player.intersects(enemy)) {
                hp = hp - 1;
                if (hp <= 0) {
                    gameover();
                }
            }
        }
    }


    public void enemyMove(){
        int speed = 1;
        Random rand = new Random();
        for (Rectangle enemy:enemyList) {
            if (player.x > enemy.x) enemy.x+=speed;
            if (player.x < enemy.x) enemy.x-=speed;
            if (player.y > enemy.y) enemy.y+=speed;
            if (player.y < enemy.y) enemy.y-=speed;
        }


        for (Rectangle enemy:enemyList) for (Rectangle nestedEnemy:enemyList){
                if (enemy.intersects(nestedEnemy) && !enemy.equals(nestedEnemy)) {
                    Rectangle temp;
                    int randomX;
                    int randomY;
                    do {
                        randomX = rand.nextInt(-100, 1000);
                        randomY = rand.nextInt(-100, 1000);
                        temp = new Rectangle(randomX, randomY, 10, 10);

                    } while (temp.intersects(0, 0,900,900));
                    enemy.x = temp.x;
                    enemy.y = temp.y;
                }

        }

    }


    public void gameover(){
        GameOver = true;
        hp = 0;
        repaint();
    }


    public void gameReset(){
        Random rand = new Random();

        for (Rectangle enemy:enemyList){
            do {
                enemy.x = rand.nextInt(900);
                enemy.y = rand.nextInt(900);
            }while (enemy.intersects(player));
        }

        GameOver = false;
        player.x = 100;
        player.y = 100;

        hp = 100;

        repaint();
    }


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.black);
        g.setColor(Color.GREEN);
        g.fillRect(player.x,  player.y, player.width, player.height);

        g.setColor(Color.yellow);
        g.drawRect(10,10,fullHP+20, 40);
        g.setColor(Color.RED);
        g.fillRect(20, 20, hp, 20);
        g.drawString("HP: " + fullHP, fullHP+40, 30);

        if (!GameOver) {
            for (Rectangle enemy : enemyList) {
                g.fillRect(enemy.x, enemy.y, enemy.width, enemy.height);
            }
        }
        else {
            g.setColor(Color.RED);
            g.setFont(new Font("Times New Roman", Font.BOLD, 60));
            g.drawString("GAME OVER", 270, 440);
            repaint();

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

    @Override
    public void mouseClicked(MouseEvent e) {
    gameReset();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


