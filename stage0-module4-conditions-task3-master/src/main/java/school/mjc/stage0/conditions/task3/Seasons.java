package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month == 1) System.out.println("Winter");
        if (month == 2) System.out.println("Winter");
        if (month == 3) System.out.println("Spring");
        if (month == 4) System.out.println("Spring");
        if (month == 5) System.out.println("Spring");
        if (month == 6) System.out.println("Summer");
        if (month == 7) System.out.println("Summer");
        if (month == 8) System.out.println("Summer");
        if (month == 9) System.out.println("Autumn");
        if (month == 10) System.out.println("Autumn");
        if (month == 11) System.out.println("Autumn");
        if (month == 12) System.out.println("Winter");
        if (month > 12 || month < 1) System.out.println("wrong number!");
    }
}
