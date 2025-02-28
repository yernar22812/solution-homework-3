public class NPC  {
    private String name;
    private String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String toString() {
        return "NPC: " + this.name + " - " + this.description;
    }
}