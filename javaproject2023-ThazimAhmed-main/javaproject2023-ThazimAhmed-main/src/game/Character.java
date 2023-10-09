package game;
import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

public class Character extends Walker {

    private final static Shape CharacterShape = new PolygonShape(
           -0.5f,1.27f, -0.55f,-1.25f, 0.45f,-1.25f, 0.5f,1.27f, -0.33f,1.3f, -0.47f,1.3f
    );

    private static BodyImage CharacterSprite = new BodyImage("data/idle.gif", 4);


    private int coins;

    private int health;


    public Character(GameLevel world) {
        super (world, CharacterShape);
        this.addImage(CharacterSprite);
        health = 3;
        coins = 0;
    }


    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
        System.out.println("Coins = " + coins);
    }

    public void addCoins(){
        setCoins(getCoins()+1);
        //Coins = Coins+1;


    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        System.out.println("Health = " + this.health);

    }

    public void addHealth(){
        setHealth(getHealth()+1);
        ///Health = Health + 1


    }

     public void RemoveHealth(){
         setHealth(getHealth()-1);
         ///Health = Health - 1

         if(getHealth()<=0){
             setHealth(1);
             GameLevel world = (GameLevel) this.getWorld();
             world.getCharacter().setPosition(new Vec2(-30,-10));

         }

     }




}
