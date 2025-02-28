public class MUDBuildDemo {
    public static void main(String[] args) {
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