public class MUDBuildDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Пещера теней").addRoom(new Room("Главный зал", "Темное помещение с факелами")).addNPC(new NPC("Орк", "Агрессивное существо с топором")).addNPC(new NPC("Зомби", "Стоит ждет ")).build();
        System.out.println(dungeon);
    }
}
