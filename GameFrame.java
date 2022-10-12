import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame(){
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.WHITE);
        BorderLayout layout = new BorderLayout();
        layout.addLayoutComponent(panel, BorderLayout.CENTER);
        this.setLayout(layout);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //game window will be of a fixed size
        this.pack(); //fits JFrame around all of the components we add
        this.setVisible(true);
        this.setLocationRelativeTo(null); //make the game/GUI appear in the middle of the screen
    }
}
