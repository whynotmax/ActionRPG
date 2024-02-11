package dev.mzcy.panel;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    // SCREEN SETTINGS
    private static final int ORIGINAL_TILE_SIZE = 16;
    private static int SCALE_FACTOR = 3;
    private static final int ACTUAL_TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE_FACTOR;
    private static final int MAX_SCREEN_COL = 16;
    private static final int MAX_SCREEN_ROW = 12;
    private static final int SCREEN_WIDTH = ACTUAL_TILE_SIZE * MAX_SCREEN_COL;  //768px
    private static final int SCREEN_HEIGHT = ACTUAL_TILE_SIZE * MAX_SCREEN_ROW; //576px

    public GamePanel() {

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

    }

}
