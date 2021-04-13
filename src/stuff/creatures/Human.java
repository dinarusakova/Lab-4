package stuff.creatures;

import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.inanimate.Place;

public abstract class Human extends Entity {
    public Human(String name) {
        super(name);
        System.out.println("Коротышка с именем \"" + name + "\" был создан!");
    }

    abstract void lie(Adverbs how);

    abstract void shidder(String[] feelings);

    abstract void stopPayingAttention(String[] feelings);

    abstract void remember(Entity entity);

    abstract void count(Place place, Entity food);

    abstract void prefer(Place place1, Place place2);

    abstract void follow(Entity entity);
}
