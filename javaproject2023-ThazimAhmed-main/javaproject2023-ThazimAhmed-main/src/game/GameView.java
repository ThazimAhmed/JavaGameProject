package game;
import javax.swing.*;
import city.cs.engine.UserView;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class GameView extends UserView {

    private final Image background = new ImageIcon("data/Background1.jpg").getImage();
    
    public GameView(GameLevel world){
        super(world, 1280, 768);

    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }



    @Override
    protected void paintForeground(Graphics2D g)
    {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.red);
        g2D.setFont(new Font("SansSerif",1,40));
        GameLevel world = (GameLevel) this.getWorld();
        g2D.drawString("Health "+ world.getCharacter().getHealth(),15,75);
        g2D.setColor(Color.yellow);
        g2D.drawString("Coins "+ world.getCharacter().getCoins(),200,75);
        g2D.setColor(Color.yellow);
        g2D.scale(0.60,0.75);
        g2D.drawString("Collect 3 coins to enter the portal",1450,75);


    }




        }




