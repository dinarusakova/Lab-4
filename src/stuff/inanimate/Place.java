package stuff.inanimate;

import stuff.Entity;

public class Place extends Entity {
    public Place(String name) {
        super(name);
        System.out.println("Место с именем \"" + name + "\" было создано!");
    }

}
