package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;


public abstract class GameLevel extends World{

    private Character Player;

    private Game game;

    public GameLevel (Game game) {

        this.game = game;

        Character Player = new Character(this);
        Player.setPosition(new Vec2(-30,-10));
        this.Player = Player;
        Pickup cp = new Pickup(Player);
        PortalEncounter pe = new PortalEncounter(this, game);
        Player.addCollisionListener(cp);
        Player.addCollisionListener(pe);

        //Make a Wall
        Shape Wallshape = new BoxShape(1f, 32f);
        StaticBody Wall = new StaticBody(this, Wallshape);
        Wall.setPosition(new Vec2(-33f, 0));
        Wall.setName("Wall");

        Shape Wallshape2 = new BoxShape(1f, 32f);
        StaticBody Wall2 = new StaticBody(this, Wallshape2);
        Wall2.setPosition(new Vec2(33f, 0));
        Wall2.setName("Wall");

        //Make the Ceiling

        Shape CeilingShape = new BoxShape(32f, 1f);
        StaticBody Ceiling = new StaticBody(this, CeilingShape);
        Ceiling.setPosition(new Vec2(0f, 20.15f));
        Ceiling.setName("Ceiling");



    }



    public Character getCharacter(){
        return Player;

    }

    public abstract boolean isComplete();


}