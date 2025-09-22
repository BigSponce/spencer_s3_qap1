package Problem3;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 25); // initialize time 1
        Time t2 = new Time(10, 20, 25); // initialize time 2

        System.out.println(t1.toString()); // show time 1
        System.out.println(t2.toString()); // show time 2
        System.out.println(); // blank line for spacing

        t1.nextSecond();
        t2.previousSecond();

        System.out.println(t1.toString()); // show change in t1
        System.out.println(t2.toString()); // show change in t2
        System.out.println(); // blank line
    }
}
