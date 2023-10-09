package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.SoundClip;
import org.jbox2d.common.Vec2;

public class PortalEncounter implements CollisionListener {
    private GameLevel level;
    private Game game;

    public PortalEncounter(GameLevel level, Game game) {
        this.level = level;
        this.game = game;
    }


    @Override
    public void collide(CollisionEvent e) {

        if (e.getOtherBody() instanceof Portal
                && level.isComplete()) {
            game.goToNextLevel();


        }

    }

}