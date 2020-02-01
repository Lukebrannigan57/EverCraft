package adventure;

public class Adventurer {

    String name;
    String alignment;

    public Adventurer(String name, String alignment) {
        this.name = name;
        this.alignment = alignment;

    }

    public String getName() {
        return name;
    }

    public String getAlignment() {
        return "Evil";
    }
}
