package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.contacts.Velocity;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class WizardEnemy extends Walker implements StepListener {

    private static final Shape WizardShape = new PolygonShape(
            -0.22f,1.74f, -1.28f,1.02f, -1.27f,-0.86f, -0.64f,-1.62f, 0.31f,-1.6f, 0.88f,-0.64f, 0.9f,0.73f, -0.16f,1.75f);

    private static String WizardLeft = "data/WizardEnemy.gif";

    private static String WizardRight = "data/WizardEnemyRight.gif";

    private static String WizardDirection = WizardRight;

    private static BodyImage WizardEnemy =
            new BodyImage(WizardDirection, 5f);

    private final int SPEED = 2;

    private float left, right;

    private final int RANGE = 3;


    private int Wizardhealth;


    public WizardEnemy(World world) {
        super(world, WizardShape);
        addImage(WizardEnemy);
        world.addStepListener(this);
        startWalking(SPEED);
        Wizardhealth = 1;

    }

    @Override
    public void setPosition(Vec2 position) {
        super.setPosition(position);
        left = position.x-RANGE;
        right = position.x+RANGE;
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x > right){
            startWalking(-SPEED);
            removeAllImages();
            BodyImage WizardEnemy = new BodyImage(WizardLeft, 5f);
            addImage(WizardEnemy);

        }
        if (getPosition().x < left){
            startWalking(SPEED);
            removeAllImages();
            BodyImage WizardEnemy = new BodyImage(WizardRight, 5f);
            addImage(WizardEnemy);

        }

        
    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }


    }


