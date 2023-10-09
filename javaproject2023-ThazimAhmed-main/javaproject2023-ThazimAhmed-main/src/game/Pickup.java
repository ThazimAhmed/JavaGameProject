package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.SoundClip;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Port;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Pickup implements CollisionListener {

    private Character Player;

    private SoundClip HurtNoise;

    private SoundClip CoinPickup;

    private SoundClip HealthPickup;

    public Pickup(Character c){
        Player = c;
    }




    @Override
    public void collide(CollisionEvent collisionEvent) {

        if (collisionEvent.getOtherBody() instanceof Coins) {
            try {
                CoinPickup = new SoundClip("data/coin_c_02-102844.wav");   // Open an audio input stream
                CoinPickup.play();                              // Plays the audio clip
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                //code in here will deal with any errors
                //that might occur while loading/playing sound
                System.out.println(e);
            }

            Player.addCoins();
            // This will destroy the coins
            collisionEvent.getOtherBody().destroy();



        }

        if (collisionEvent.getOtherBody() instanceof HealthPotion) {
            try {
                HealthPickup = new SoundClip("data/health-pickup-6860.wav");   // Open an audio input stream
                HealthPickup.play();                              // Plays the audio clip
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                //code in here will deal with any errors
                //that might occur while loading/playing sound
                System.out.println(e);
            }
            Player.addHealth();
            // This will destroy the Health Potion
            collisionEvent.getOtherBody().destroy();


        }

        if (collisionEvent.getOtherBody() instanceof WizardEnemy) {

            try {
                HurtNoise = new SoundClip("data/080154_pain-scream-girl-86856.wav");   // Open an audio input stream
                HurtNoise.play();                              // Plays the audio clip
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                //code in here will deal with any errors
                //that might occur while loading/playing sound
                System.out.println(e);
            }

            // This will remove 1 health each time the player collides with an enemy
            Player.RemoveHealth();
            collisionEvent.getOtherBody().destroy();


            // This will stop the character when they hit an enemy
            Player.removeAllImages();
            BodyImage CharacterSprite = new BodyImage("data/idle.gif", 4);
            Player.addImage(CharacterSprite);
            Player.stopWalking();





            // This will destroy the both the Player if his hp is equal to 0
            if (Player.getHealth() == 0){
                Player.setPosition(new Vec2(-30,-10));
                System.out.println("Game Over!");



            }




        }




    }
}
