import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public String toString() {
        String var10000 = this.name;
        return "Dungeon: " + var10000 + " " + String.valueOf(this.rooms) + " " + String.valueOf(this.npcs);
    }
}