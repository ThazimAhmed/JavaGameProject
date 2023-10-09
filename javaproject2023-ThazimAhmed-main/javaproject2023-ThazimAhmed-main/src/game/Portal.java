package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;


public class Portal extends StaticBody {

    private static final Shape CoinsShape = new CircleShape(1f);


    private static final BodyImage Portal =
            new BodyImage("data/PortalLeftIdle.gif", 5f);

    public Portal(GameLevel world) {
        super(world, CoinsShape);
        addImage(Portal);



    }
}







