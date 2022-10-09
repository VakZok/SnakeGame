import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //game window will be of a fixed size
        this.pack(); //fits JFrame around all of the components we add
        this.setVisible(true);
        this.setLocationRelativeTo(null); //make the game/GUI appear in the middle of the screen
    }
}
