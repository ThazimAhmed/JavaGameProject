package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class ProjectileImpactListener implements CollisionListener {

    private Character Player;


    public ProjectileImpactListener(Character c){

        Player = c;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {



    }
}