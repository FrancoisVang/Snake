/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package francois.snake;

import javax.swing.*;
import static francois.snake.Constants.*;

/**
 *
 * @author franc
 */
public class Snake {

    public static void main(String[] args) {
        int boardWidth = BOARD_WIDTH;
        int boardHeight = BOARD_HEIGHT;
        
        JFrame frame = new JFrame("Snake"); //creates a new GUI called Snake
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight); //set width and height to int obj
        frame.setLocationRelativeTo(null); //screen opens in the center of screen
        frame.setResizable(false); //Does not allow resizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Program will terminate when selecting the X
        
        SnakeGame snakegame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakegame);
        frame.pack();
        snakegame.requestFocus();
    }
}
