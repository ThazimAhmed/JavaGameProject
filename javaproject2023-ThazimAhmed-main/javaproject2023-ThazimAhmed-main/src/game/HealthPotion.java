package game;

import city.cs.engine.*;


public class HealthPotion extends DynamicBody {

    private static final Shape CoinsShape = new CircleShape(1f);


    private static final BodyImage HealthPotion =
            new BodyImage("data/FullHealthPotion.png", 2f);

    public HealthPotion(GameLevel world) {
        super(world, CoinsShape);
        addImage(HealthPotion);

    }
}
