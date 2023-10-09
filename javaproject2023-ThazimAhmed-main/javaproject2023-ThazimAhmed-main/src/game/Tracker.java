package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import org.jbox2d.common.Vec2;

public class Tracker implements StepListener {
    private GameView view;
    private Character Player;
    public Tracker(GameView view, Character Player) {
        this.view = view;
        this.Player = Player;
    }
    public void preStep(StepEvent e) {}

    public void postStep(StepEvent e) {
        view.setCentre(new Vec2(Player.getPosition()));
    }
}