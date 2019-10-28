package main;

/**
 * С комментами сам ебись :-)
 */
public class Main {
    public static void main(String[] args) {
        //Утро
        Day morning = new Day(6, 23, 56);
        System.out.println(morning.getTimeOfDay());
        morning.printTime();
        //День
        Day day = new Day(13, 23, 5);
        System.out.println(day.getTimeOfDay());
        day.printTime();
        //Вечер
        Day evening = new Day(21, 3, 54);
        System.out.println(evening.getTimeOfDay());
        evening.printTime();
        //Ночь
        Day night = new Day(5, 23, 54);
        System.out.println(night.getTimeOfDay());
        night.printTime();
        //Сейчас
        Day current = new Day();
        System.out.println(current.getTimeOfDay());
        current.printTime();
    }
}
