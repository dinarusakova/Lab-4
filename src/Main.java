import stuff.Entity;
import stuff.Enums.Adverbs;
import stuff.Enums.Feelings;
import stuff.creatures.Rat;
import stuff.creatures.Shorty;
import stuff.exceptions.NotEnoughFoodException;
import stuff.exceptions.NotEnoughShortiesException;
import stuff.inanimate.Furniture;
import stuff.inanimate.Place;

public class Main {
    public static void main(String[] args) {
        Rat rat1 = new Rat("Крыса");
        Place side = new Place("В сторонку");
        rat1.move(Adverbs.Slowly, side);

        Place near = new Place("Неподалеку");
        rat1.stop(near);
        Shorty neznaykaa = new Shorty("Незнайка");
        rat1.look(neznaykaa);
        neznaykaa.look(Adverbs.Anxiously);
        Rat rat2 = new Rat("Другая крыса");
        Furniture lavka = new Furniture("Лавка");
        rat2.come(lavka);
        neznaykaa.notice(rat2);
        Rat.Nose nose = rat2.new Nose("Нос");
        rat2.wiggle(nose);
        Place klopisociety = new Place("клопиное общество");

        Place ratsociety = new Place("крысиное общество");
        neznaykaa.prefer(klopisociety, ratsociety);
        Furniture polka = new Furniture("полка");
        neznaykaa.move(Adverbs.Inversely, polka);
        Shorty pokladistiy = new Shorty("Покладистый");
        neznaykaa.follow(pokladistiy);
        neznaykaa.lie(Adverbs.Quietly);

        Shorty[] otherShorties = new Shorty[1];
        //Checked исключение
        try {
            if (otherShorties.length < 2) throw new NotEnoughShortiesException();
            System.out.println("Обьект \"Другие коротышки\" был создан.");
            System.out.println("Коротышки были простужены.");
            new Entity("Кашель") {
                void choke() {
                    System.out.println(this.getName() + " душит коротышек.");
                }
            }.choke();

            new Entity("Ночные кошмары") {
                void treat() {
                    System.out.println(this.getName() + " терзали коротышек.");
                }
            }.treat();
            neznaykaa.seeShorties(Adverbs.NotSweety);
        } catch (NotEnoughShortiesException e) {
            System.out.println(e.getMessage());
        }


        neznaykaa.shidder(new String[]{Feelings.Groans.getTitle(), Feelings.Hums.getTitle(), Feelings.Screams.getTitle()});
        neznaykaa.stopPayingAttention(new String[]{Feelings.Suffers.getTitle(), Feelings.Noise.getTitle(), Feelings.Stink.getTitle(), Feelings.Fug.getTitle(), Feelings.Bites.getTitle()});


        Shorty donut = new Shorty("Пончик");
        neznaykaa.remember(donut);
        Place rocket = new Place("Ракета");

        //Локальный Класс
        class Food extends Entity {
            public Food(Double weight) {
                super("Еда");
                this.weight = weight;
                System.out.println("Еда массой " + weight + " килограмм была создана");
            }

            double weight;
        }
        Food food = new Food(90.0);
        neznaykaa.count(rocket, food);

        //unchecked исключение
        if (food.weight < 100) throw new NotEnoughFoodException();
    }

}
