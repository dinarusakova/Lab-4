package stuff.inanimate;

import stuff.Entity;

public class Furniture extends Entity {
    public Furniture(String name) {
        super(name);
        System.out.println("Мебель с именем \"" + name + "\" было создано!");
    }
}
