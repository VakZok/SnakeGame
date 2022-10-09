import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    //Attributes
    //Screen Setting
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HIGHT = 600;
    private static final int UNIT_SIZE = 25;
    private static final int GAME_UNIT_AMOUNT = (SCREEN_WIDTH * SCREEN_HIGHT) / UNIT_SIZE;
    private static final int GAME_SPEED = 75; //the higher the number, the slower the game

    //Coordinates of our snake body
    private final int x[] = new int[GAME_UNIT_AMOUNT]; //this array holds all of the x-coordinates
    private final int y[] = new int[GAME_UNIT_AMOUNT]; //this array holds all of the y-coordinates

    //Coordinates of our randomly spawning aplles
    private int appleYCoordinate;
    private int appleXCoordinate;

    //Amount of body parts
    private int bodyParts = 3;
    private int appleEaten; //for each apple eaten, we add one body part

    //Setting the start up
    Directions direction = Directions.RIGHT;
    boolean running = false;

    //to be declared, what these do
    Timer timer;
    Random random;
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}