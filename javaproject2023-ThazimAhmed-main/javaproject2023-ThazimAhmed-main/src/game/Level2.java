package game;
import javax.swing.*;
import java.awt.*;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;



public class Level2 extends GameLevel {

    public Level2(Game game) {
        super(game);

        //populate it with bodies (ex: platforms, collectibles, characters)

        //make a ground platform


        Shape groundshape1 = new BoxShape(17.6f, 0.65f);
        StaticBody ground = new StaticBody(this, groundshape1);
        ground.setPosition(new Vec2(-32f, -12f));
        ground.setFillColor(new Color(0, true));
        ground.setName("Ground");

        Shape groundshape2 = new BoxShape(1.75f, 0.65f);
        StaticBody ground2 = new StaticBody(this, groundshape2);
        ground2.setPosition(new Vec2(-13.1f, -12.8f));
        ground2.rotate(-0.5f);
        ground2.setFillColor(new Color(0, true));
        ground2.setName("Ground");

        Shape groundshape3 = new BoxShape(4.35f, 0.65f);
        StaticBody ground3 = new StaticBody(this, groundshape3);
        ground3.setPosition(new Vec2(-7.5f, -13.6f));
        ground3.setFillColor(new Color(0, true));
        ground3.setName("Ground");

        Shape groundshape4 = new BoxShape(2.25f, 0.55f);
        StaticBody ground4 = new StaticBody(this, groundshape4);
        ground4.setPosition(new Vec2(-2f, -15f));
        ground4.rotate(-0.84f);
        ground4.setFillColor(new Color(0, true));
        ground4.setName("Ground");

        Shape groundshape5 = new BoxShape(25.5f, 0.67f);
        StaticBody ground5 = new StaticBody(this, groundshape5);
        ground5.setPosition(new Vec2(32f, -18.5f));
        ground5.setFillColor(new Color(0, true));
        ground5.setName("Ground");


        Shape groundshape6 = new BoxShape(1.5f, 0.65f);
        StaticBody ground6 = new StaticBody(this, groundshape6);
        ground6.setPosition(new Vec2(1.4f, -16.9f));
        ground6.setFillColor(new Color(0, true));
        ground6.setName("Ground");

        Shape groundshape7 = new BoxShape(1.95f, 0.6f);
        StaticBody ground7 = new StaticBody(this, groundshape7);
        ground7.setPosition(new Vec2(4.58f, -17.6f));
        ground7.rotate(-0.42f);
        ground7.setFillColor(new Color(0, true));
        ground7.setName("Ground");


        // Make ground level 2 platform

        Shape Level2groundshape = new BoxShape(17.9f, 3.22f);
        StaticBody Level2ground = new StaticBody(this, Level2groundshape);
        Level2ground.setPosition(new Vec2(-16.45f, 0f));
        Level2ground.setFillColor(new Color(0, true));
        Level2ground.setName("Ground");

        Shape Level2groundshape2 = new BoxShape(12f, 2f);
        StaticBody Level2ground2 = new StaticBody(this, Level2groundshape2);
        Level2ground2.setPosition(new Vec2(20f, 1f));
        Level2ground2.setFillColor(new Color(0, true));
        Level2ground2.setName("Ground");

        Shape Level2groundshape3 = new BoxShape(1.5f, 7.6f);
        StaticBody Level2ground3 = new StaticBody(this, Level2groundshape3);
        Level2ground3.setPosition(new Vec2(9.5f, -5f));
        Level2ground3.setFillColor(new Color(0, true));
        Level2ground3.setName("Ground");

        Shape Level2groundshape4 = new BoxShape(4.4f, 4.1f);
        StaticBody Level2ground4 = new StaticBody(this, Level2groundshape4);
        Level2ground4.setPosition(new Vec2(-28.5f, 7f));
        Level2ground4.setFillColor(new Color(0, true));
        Level2ground4.setName("Ground");

        Shape Level2groundshape5 = new BoxShape(8f, 1.6f);
        StaticBody Level2ground5 = new StaticBody(this, Level2groundshape5);
        Level2ground5.setPosition(new Vec2(-24f, 9.5f));
        Level2ground5.setFillColor(new Color(0, true));
        Level2ground5.setName("Ground");


        Shape Level2groundshape6 = new BoxShape(7.2f, 1.55f);
        StaticBody Level2ground6 = new StaticBody(this, Level2groundshape6);
        Level2ground6.setPosition(new Vec2(25f, 2.9f));
        Level2ground6.setFillColor(new Color(0, true));
        Level2ground6.setName("Ground");

        Shape Level2groundshape7 = new BoxShape(1.9f, 0.9f);
        StaticBody Level2ground7 = new StaticBody(this, Level2groundshape7);
        Level2ground7.setPosition(new Vec2(16.4f, 3f));
        Level2ground7.setName("Ground");
        Level2ground7.setFillColor(new Color(0, true));
        Level2ground7.rotate(0.45f);

        Shape Level2groundshape8 = new BoxShape(3.5f, 0.8f);
        StaticBody Level2ground8 = new StaticBody(this, Level2groundshape8);
        Level2ground8.setPosition(new Vec2(-7.4f, -4f));
        Level2ground8.setFillColor(new Color(0, true));
        Level2ground8.setName("Ground");

        Shape Level2groundshape9 = new BoxShape(1.8f, 1f);
        StaticBody Level2ground9 = new StaticBody(this, Level2groundshape9);
        Level2ground9.setPosition(new Vec2(-2.7f, -3.2f));
        Level2ground9.setName("Ground");
        Level2ground9.setFillColor(new Color(0, true));
        Level2ground9.rotate(0.45f);

        Shape Level2groundshape10 = new BoxShape(1.7f, 0.9f);
        StaticBody Level2ground10 = new StaticBody(this, Level2groundshape10);
        Level2ground10.setPosition(new Vec2(-12.1f, -3.3f));
        Level2ground10.setName("Ground");
        Level2ground10.setFillColor(new Color(0, true));
        Level2ground10.rotate(-0.45f);

        Shape Level2groundshape11 = new BoxShape(1.55f, 5.4f);
        StaticBody Level2ground11 = new StaticBody(this, Level2groundshape11);
        Level2ground11.setPosition(new Vec2(9.60f, 15f));
        Level2ground11.setFillColor(new Color(0, true));
        Level2ground11.setName("Ground");

        // make a suspended platform
        Shape platformShape = new BoxShape(1.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(6.5f, -8.6f));
        platform1.setName("Platform");
        platform1.setFillColor(new Color(0, true));


        Shape platformShape2 = new BoxShape(1.05f, 0.5f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(2.5f, -2f));
        platform2.setName("Platform");
        platform2.setFillColor(new Color(0, true));


        Coins c1 = new Coins(this);
        c1.setPosition(new Vec2(-25, 11f));

        Coins c2 = new Coins(this);
        c2.setPosition(new Vec2(0f, 0f));

        Coins c3 = new Coins(this);
        c3.setPosition(new Vec2(7f, -8f));

        //make a collectable Health Potion(with an overlaid image)
        HealthPotion h1 = new HealthPotion(this);
        h1.setPosition(new Vec2(-20, 5f));

        HealthPotion h2 = new HealthPotion(this);
        h2.setPosition(new Vec2(19f, -18f));

        //make a collectable Health Potion(with an overlaid image)

        Portal p1 = new Portal(this);
        p1.setPosition(new Vec2(30, 7));



        //make an Enemy Wizard (with an overlaid image)
        new WizardEnemy(this).setPosition(new Vec2(-7.5f, -10.9f));
        new WizardEnemy(this).setPosition(new Vec2(23f, 5f));
        new WizardEnemy(this).setPosition(new Vec2(-10f, 5f));


    }


    @Override
    public boolean isComplete() {
        if (getCharacter().getCoins() >= 3)
            return true;
        else return false;

    }

}




