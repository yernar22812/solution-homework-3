public class NPC implements CloneableGameEntity {
    private String name;
    private String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public NPC clone() {
        return new NPC("Clone!  " + this.name, this.description);
    }

    public String toString() {
        return "NPC: " + this.name + " - " + this.description;
    }
}