package stuff.Enums;

public enum Adverbs {
    Slowly("Не особенно торопясь"),
    Anxiously("Тревожно"),
    AbsolutelyEmty("абсолютно пустая"),
    Inversely("обратно"),
    Voluntarily("Добровольно отдавая себя на съедение клопам"),
    Quietly("Тихо"),
    NotSweety("Несладко");


    private String title;

    Adverbs(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}