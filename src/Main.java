

public class Main {
    public static void main(String[] args) {
        task_2();
        Color redColor = Color.RED;
        System.out.println("RGB-код для красного цвета: " + redColor.getRGBCode());

        Color greenColor = Color.GREEN;
        System.out.println("RGB-код для зеленого цвета: " + greenColor.getRGBCode());

        Color blueColor = Color.BLUE;
        System.out.println("RGB-код для синего цвета: " + blueColor.getRGBCode());
    }

    public static void task_1() {
        Coin penny = Coin.PENNY;
        System.out.println("Номинал пенни: $" + penny.getValue());

        Coin nickel = Coin.NICKEL;
        System.out.println("Номинал никеля: $" + nickel.getValue());

        Coin dime = Coin.DIME;
        System.out.println("Номинал дайма: $" + dime.getValue());

        Coin quarter = Coin.QUARTER;
        System.out.println("Номинал квотера: $" + quarter.getValue());
    }

    public static void task_2() {
        int year = 2024;
        Month month = Month.February;
        int daysInMonth = Month.getDaysInMonth(month, year);
        System.out.println(daysInMonth);

    }
}


