public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Room clone() {
        return new Room("clone!  " + this.name, this.description);
    }

    public String toString() {
        return "Room [ " + this.name + ", description=" + this.description + "]";
    }
}