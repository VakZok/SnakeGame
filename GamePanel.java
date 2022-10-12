import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel {
    //Attributes
    //Screen Setting
    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HIGHT = SCREEN_WIDTH;
    public static final int UNIT_SIZE = 25;
    public static final int GAME_UNIT_AMOUNT = (SCREEN_WIDTH * SCREEN_HIGHT) / UNIT_SIZE;
    public static final int GAME_SPEED = 75; //the higher the number, the slower the game

    //Coordinates of our snake body
    public final int x[] = new int[GAME_UNIT_AMOUNT]; //this array holds all of the x-coordinates
    public final int y[] = new int[GAME_UNIT_AMOUNT]; //this array holds all of the y-coordinates

    //Coordinates of our randomly spawning aplles
    public int appleYCoordinate;
    public int appleXCoordinate;

    //Amount of body parts
    public int bodyParts = 3;
    public int appleEaten; //for each apple eaten, we add one body part

    //Setting the start up
    Directions direction = Directions.RIGHT;
    boolean running = false;

    //to be declared, what these do
    Timer timer;
    Random random = new Random();

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true); //why?
        //this.addKeyListener(e -> ); //to be finished
        //startGame();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
    }

    public void drawGrid(Graphics g) {
        /*
        for-loops to draw lines - to form a grid
        We divide the Game Panel screen height by the unit size to get the vertical amount of units
        We then draw a line after each vertical unit - except for the last one
        Since the screen hight equals the screen widht, we can do the same in one go
         */
        for (int i = 0; i < SCREEN_HIGHT / UNIT_SIZE; i++) {
            //Customized line color
            g.setColor(Color.GRAY);
            //the vertical lines are drawn from the x-coordinate of the right side of each unit size, from y equals 0 to y equals the screen hight
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HIGHT);
            //the horizontal lines are drawn from the y-coordninate of the top side of each unit size, from x equals 0 to x equals the screen width
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }
    }
}