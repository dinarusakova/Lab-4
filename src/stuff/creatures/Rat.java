package stuff.creatures;

import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;
import stuff.interfaces.lookAble;
import stuff.interfaces.moveAble;

public class Rat extends Animals implements moveAble, lookAble {
    public Rat(String name) {
        super(name);
    }

    @Override
    public void move(Adverbs how, Entity place) {
        System.out.println("Объект: \"" + this.getName() + "\" Как: \"" + how.getTitle() + "\" переместился в место \"" + place.getName() + "\".");
    }

    public void stop(Place place) {
        System.out.println("Объект: \"" + this.getName() + "\" остановился в месте \"" + place.getName() + "\".");
    }

    public void come(Furniture furniture) {
        System.out.println("Объект: \"" + this.getName() + "\" вылез из под объекта \"" + furniture.getName() + "\".");
    }

    @Override
    public void look(Object entity) {
        System.out.println("Объект: \"" + this.getName() + "\" посмотрел на объект \"" + ((Entity) entity).getName() + "\".");
    }

    public void wiggle(Entity entity) {
        System.out.println("Объект: \"" + this.getName() + "\" стала шевелить объектом \"" + entity.getName() + "\".");
    }


    @Override
    public void notice(Entity entity) {

    }

    @Override
    public void seeShorties(Adverbs how) {

    }


    public class Nose extends Entity {
        public Nose(String name) {
            super(name);
            System.out.println("Обьект \"" + this.getName() + "\" принадлежащий крысе был создан!");
        }
    }

}
