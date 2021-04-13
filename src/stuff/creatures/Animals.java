package stuff.creatures;

import stuff.Entity;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;

public abstract class Animals extends Entity {
    public Animals(String name) {
        super(name);
        System.out.println("Животное с именем \"" + name + "\" было создано!");
    }

    abstract void stop(Place place);

    abstract void come(Furniture furniture);

    abstract void wiggle(Entity entity);
}
