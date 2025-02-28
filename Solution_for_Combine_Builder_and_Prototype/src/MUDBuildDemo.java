public class MUDBuildDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Пещера теней").addRoom(new Room("Главный зал", "Темное помещение с факелами")).addNPC(new NPC("Орк", "Агрессивное существо с топором")).addNPC(new NPC("Зомби", "Стоит ждет ")).build();
        System.out.println(dungeon);
        Room originalRoom = new Room("Тайная комната", "Скрытая за стеной");
        Room clonedRoom = originalRoom.clone();
        NPC npc1 = new NPC("Скелет", "Спит с луком");
        NPC clonedNpc1 = npc1.clone();
        System.out.println(npc1);
        System.out.println(clonedNpc1);
        System.out.println(originalRoom);
        System.out.println(clonedRoom);
    }
}