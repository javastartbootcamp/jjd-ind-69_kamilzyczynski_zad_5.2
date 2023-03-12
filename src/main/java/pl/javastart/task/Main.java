package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(13.5, 15.5, true, 21);
        room1.reduceTemperature();

        Room room2 = new Room(8.5, 22.5, false, 22);
        boolean b = room2.reduceTemperature();
        System.out.println(b);

        System.out.println("Pokój nr 1:");
        System.out.println("Powierzchnia pokoju: " + room1.getArea());
        System.out.println("Temperatura pokoju: " + room1.getTemperature());
        System.out.println("Czy pokój jest klimatyzowany: " + room1.isAirConditioned());
        System.out.println("Temperatura graniczna w pokoju: " + room1.getLowerLimitTemperature());

        System.out.println("Pokój nr 2:");
        System.out.println("Powierzchnia pokoju: " + room2.getArea());
        System.out.println("Temperatura pokoju: " + room2.getTemperature());
        System.out.println("Czy pokój jest klimatyzowany: " + room2.isAirConditioned());
        System.out.println("Temperatura graniczna w pokoju: " + room2.getLowerLimitTemperature());

    }
}
