
public enum Month {
    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    September(30),
    October(31),
    November(30),
    December(31);

    private final int value;

    Month(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static int getDaysInMonth(Month month, int year) {
        if (isLeapYear(year) && month == Month.February) {
            return 29;
        } else {
            return month.getValue();
        }
    }
}