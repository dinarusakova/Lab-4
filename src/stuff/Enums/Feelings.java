package stuff.Enums;

public enum Feelings {
    Groans("стоны"),
    Hums("мычания"),
    Screams("вскрикивания"),
    Suffers("страдания"),
    Noise("окружающий шум"),
    Stink("вонь"),
    Fug("духота"),
    Bites("клопиные укусы");


    private String title;

    Feelings(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}

