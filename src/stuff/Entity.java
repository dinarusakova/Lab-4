package stuff;

public abstract class Entity {
    public Entity(String name) {
        this.name = name;
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
