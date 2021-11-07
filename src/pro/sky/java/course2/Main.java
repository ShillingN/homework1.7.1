package pro.sky.java.course2;

public class Main {
    public static int definitionYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return 1;
        } else {
            return 2;
        }

    }

    public static void main(String[] args) {
        int year = 2020;
        int nowYear = definitionYear(year);
        System.out.println(nowYear);
    }
}
