public class Room {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String toString() {
        return "Room [ " + this.name + ", description=" + this.description + "]";
    }
}