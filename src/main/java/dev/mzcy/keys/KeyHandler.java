package dev.mzcy.keys;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        KeyCode keyCode = KeyCode.fromValue(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        KeyCode keyCode = KeyCode.fromValue(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        KeyCode keyCode = KeyCode.fromValue(e.getKeyCode());
    }
}
