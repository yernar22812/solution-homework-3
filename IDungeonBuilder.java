public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String var1);

    IDungeonBuilder addRoom(Room var1);

    IDungeonBuilder addNPC(NPC var1);

    Dungeon build();
}