package dev.mzcy.panel;

import dev.mzcy.keys.KeyHandler;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    // SCREEN SETTINGS
    private static final int ORIGINAL_TILE_SIZE = 16;
    private static int SCALE_FACTOR = 3;
    private static final int ACTUAL_TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE_FACTOR;
    private static final int MAX_SCREEN_COL = 16;
    private static final int MAX_SCREEN_ROW = 12;
    private static final int SCREEN_WIDTH = ACTUAL_TILE_SIZE * MAX_SCREEN_COL;  //768px
    private static final int SCREEN_HEIGHT = ACTUAL_TILE_SIZE * MAX_SCREEN_ROW; //576px
    private static final int FPS = 60;

    Thread gameThread;
    KeyHandler keyHandler = new KeyHandler();

    //PLAYER'S DEFAULT POS
    int playerX = 100, playerY = 100, playerSpeed = 4;

    public GamePanel() {

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

        this.addKeyListener(keyHandler);
        this.setFocusable(true);

    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = (double) 1000000000 /FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }

    }

    public void update() {
        if (keyHandler.up) {
            playerY -= playerSpeed;
        }
        if (keyHandler.down) {
            playerY += playerSpeed;
        }
        if (keyHandler.left) {
            playerX -= playerSpeed;
        }
        if (keyHandler.right) {
            playerX += playerSpeed;
        }
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.white);
        graphics2D.fillRect(playerX, playerY, ACTUAL_TILE_SIZE, ACTUAL_TILE_SIZE);
        graphics2D.dispose();
    }

}
