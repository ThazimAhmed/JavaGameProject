package game;

import city.cs.engine.*;


public class Coins extends DynamicBody {

    private static final Shape CoinsShape = new CircleShape(1f);


    private static final BodyImage Coins =
            new BodyImage("data/Coin.gif", 2f);

    public Coins(World C) {
        super(C, CoinsShape);
        addImage(Coins);
    }
}
