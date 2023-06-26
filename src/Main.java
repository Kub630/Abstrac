public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.setNicName("MASHA");
        cow.setGender("ALAYSKI");
        cow.setWeight("192kg");
        cow.setAge(4);

        System.out.println(cow);

        Sheep sheep = new Sheep();
        sheep.setNicName("ZUBASTIK");
        sheep.setAge(2);
        sheep.setGender("GISAR");
        sheep.setWeight("54kg");
        sheep.eat();

        System.out.println(sheep);
        Horse horse = new Horse();
        horse.setNicName("SHTORM");
        horse.setAge(3);
        horse.setGender("KARABAYUR");
        horse.setWeight("198kg");
        horse.eat();
        System.out.println(horse);
    }
}