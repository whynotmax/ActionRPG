package dev.mzcy.keys;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean up, down, left, right;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        KeyCode keyCode = KeyCode.fromValue(e.getKeyCode());
        if (keyCode == KeyCode.W || keyCode == KeyCode.UP_ARROW) {
            up = true;
        }
        if (keyCode == KeyCode.A || keyCode == KeyCode.LEFT_ARROW) {
            left = true;
        }
        if (keyCode == KeyCode.S || keyCode == KeyCode.DOWN_ARROW) {
            down = true;
        }
        if (keyCode == KeyCode.D || keyCode == KeyCode.RIGHT_ARROW) {
            right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        KeyCode keyCode = KeyCode.fromValue(e.getKeyCode());
        if (keyCode == KeyCode.W || keyCode == KeyCode.UP_ARROW) {
            up = false;
        }
        if (keyCode == KeyCode.A || keyCode == KeyCode.LEFT_ARROW) {
            left = false;
        }
        if (keyCode == KeyCode.S || keyCode == KeyCode.DOWN_ARROW) {
            down = false;
        }
        if (keyCode == KeyCode.D || keyCode == KeyCode.RIGHT_ARROW) {
            right = false;
        }
    }
}
