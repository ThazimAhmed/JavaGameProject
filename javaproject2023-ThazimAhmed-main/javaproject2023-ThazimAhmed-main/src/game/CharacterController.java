package game;
import city.cs.engine.BodyImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class CharacterController implements KeyListener {
    Character Player;


    @Override
    public void keyTyped(KeyEvent e) {

    }
    public CharacterController(Character Player) {
        this.Player = Player;


    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_A) {
            Player.removeAllImages();
            BodyImage CharacterSprite = new BodyImage("data/RunLeft.gif", 4);
            Player.addImage(CharacterSprite);
            Player.startWalking(-9);

        } else if (code == KeyEvent.VK_D) {
            Player.removeAllImages();
            BodyImage CharacterSprite = new BodyImage("data/RunRight.gif", 4);
            Player.addImage(CharacterSprite);
            Player.startWalking(9);


        }
        if (code == KeyEvent.VK_SPACE) {
            Player.removeAllImages();
            BodyImage CharacterSprite = new BodyImage("data/Jump.gif", 4);
            Player.addImage(CharacterSprite);
            Player.setGravityScale(2.35f);
            Player.jump(21);
        }

    }

        @Override
        public void keyReleased (KeyEvent e){

            int code = e.getKeyCode();
            // other key commands omitted
            if (code == KeyEvent.VK_A) {
                Player.removeAllImages();
                BodyImage CharacterSprite = new BodyImage("data/idleLeft.gif", 4);
                Player.addImage(CharacterSprite);
                Player.startWalking(0);


            } else if (code == KeyEvent.VK_D) {
                Player.removeAllImages();
                BodyImage CharacterSprite = new BodyImage("data/idle.gif", 4);
                Player.addImage(CharacterSprite);
                Player.startWalking(0);

            } else if (code == KeyEvent.VK_SPACE) {
                Player.removeAllImages();
                BodyImage CharacterSprite = new BodyImage("data/Idle.gif", 4);
                Player.addImage(CharacterSprite);
                Player.jump(0);

            }
        }

        public void updateCharacter(Character newPlayer) {

        this.Player = newPlayer;


    }
    }











