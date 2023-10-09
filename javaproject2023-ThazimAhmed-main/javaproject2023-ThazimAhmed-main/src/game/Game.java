package game;

import city.cs.engine.SoundClip;
import org.jbox2d.common.Vec2;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

/**
 * Your main game entry point
 */
public class Game {


    GameLevel currentLevel;

    GameView view;

    CharacterController controller;

    private SoundClip gameMusic;

    /** Initialise a new Game. */
    public Game() {

        // make an empty game world
        currentLevel = new Level1(this);

        // make a view to look into the game world
        view = new GameView(currentLevel);

        // add Background Music to the game
        try {
            gameMusic = new SoundClip("data/LightAmbience1.wav");   // Open an audio input stream
            gameMusic.loop();                              // Set it to continous playback (looping)
        } catch (UnsupportedAudioFileException|IOException|LineUnavailableException e) {
            //code in here will deal with any errors
            //that might occur while loading/playing sound
            System.out.println(e);
        }


        controller = new CharacterController(currentLevel.getCharacter());
        view.addKeyListener(controller);

        GiveFocus givefocus = new GiveFocus(view);
        view.addMouseListener(givefocus);

        Tracker tracker = new Tracker(view, currentLevel.getCharacter());
        //world.addStepListener(tracker);
        //new Tracker


        // draw a 1-metre grid over the view
        //.setGridResolution(1);


        // create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
        //JFrame debugView = new DebugViewer(world, 500, 500);

        // start our game world simulation!
        currentLevel.start();

        view.requestFocus();
    }

    public void goToNextLevel(){

        if (currentLevel instanceof Level1) {

            currentLevel.stop();

            Character prevCharacter = currentLevel.getCharacter();

            currentLevel = new Level2(this);

            Character newCharacter = currentLevel.getCharacter();

            //level now refer to the new level
            view.setWorld(currentLevel);

            controller.updateCharacter(currentLevel.getCharacter());


            currentLevel.start();
        }
        else if (currentLevel instanceof Level2){

            currentLevel.stop();

            Character prevCharacter = currentLevel.getCharacter();

            currentLevel = new Level3(this);

            Character newCharacter = currentLevel.getCharacter();

            //level now refer to the new level
            view.setWorld(currentLevel);

            controller.updateCharacter(currentLevel.getCharacter());


            currentLevel.start();

            System.out.println("Well done! Level complete.");
            System.out.println("Last Level.");
        }

        else if (currentLevel instanceof Level3){
            System.out.println("Well done! Game complete.");
            System.exit(0);
        }


    }





    /** Run the game. */
    public static void main(String[] args) {

        new Game();
    }
}
