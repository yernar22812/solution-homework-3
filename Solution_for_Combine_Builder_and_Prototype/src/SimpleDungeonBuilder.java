import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList();
    private List<NPC> npcs = new ArrayList();

    public SimpleDungeonBuilder() {
    }

    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        this.rooms.add(room);
        return this;
    }

    public IDungeonBuilder addNPC(NPC npc) {
        this.npcs.add(npc);
        return this;
    }

    public Dungeon build() {
        return new Dungeon(this.name, this.rooms, this.npcs);
    }
}
