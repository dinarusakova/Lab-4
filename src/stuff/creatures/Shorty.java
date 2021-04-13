package stuff.creatures;

import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.inanimate.Place;
import stuff.interfaces.lookAble;
import stuff.interfaces.moveAble;

import java.util.Arrays;


public class Shorty extends Human implements lookAble, moveAble {
    public Shorty(String name) {
        super(name);
    }


    @Override
    public void look(Object how) {
        System.out.println("Объект: \"" + this.getName() + "\" Как: \"" + ((Adverbs) how).getTitle() + "\" осмотрелся по сторонам.");
    }

    @Override
    public void notice(Entity entity) {
        System.out.println("Объект: \"" + this.getName() + "\" заметил объект \"" + entity.getName() + "\".");
    }


    public void lie(Adverbs how) {
        System.out.println("Объект: \"" + this.getName() + "\" лежал  Как: \"" + how.getTitle() + "\".");
    }

    public void shidder(String[] adverbs) {
        System.out.println("Объект: \"" + this.getName() + "\" вздрагивал от:" + Arrays.toString(adverbs) + ".");
    }

    @Override
    public void seeShorties(Adverbs how) {
        System.out.println("Объект: \"" + this.getName() + "\" заметил, что коротышкам приходится Как: \"" + how.getTitle() + "\".");
    }


    public void stopPayingAttention(String[] feelings) {
        System.out.println("Объект: \"" + this.getName() + "\" перестал обращать внимание на:" + Arrays.toString(feelings) + ".");
    }


    public void remember(Entity entity) {
        System.out.println("Объект: \"" + this.getName() + "\" вспомнил об объекте: \"" + entity.getName() + "\".");
    }

    public void count(Place place, Entity food) {
        System.out.println("Объект: \"" + this.getName() + "\" начал высчитывать насколько ему хватит обьекта \"" + food.getName() + "\" в месте: \"" + place.getName() + "\".");
    }

    public void prefer(Place place1, Place place2) {
        System.out.println("Объект: \"" + this.getName() + "\" предпочитает спать в месте \"" + place1.getName() + "\", а не в месте \"" + place2.getName() + "\".");
    }


    @Override
    public void move(Adverbs how, Entity furniture) {
        System.out.println("Объект: \"" + this.getName() + "\" полез " + how.getTitle() + " на объект \"" + furniture.getName() + "\".");

    }

    public void follow(Entity entity) {
        System.out.println("Объект: \"" + this.getName() + "\" решил последовать совету объекта \"" + entity.getName() + "\".");

    }
}
