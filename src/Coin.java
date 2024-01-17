
public enum Coin {
    PENNY(0.01),
    NICKEL(0.05),
    DIME(0.10),
    QUARTER(0.25);

    private final double value;

    // Конструктор для установки номинала для каждой монеты
    Coin(double value) {
        this.value = value;
    }

    // Метод для получения номинала монеты
    public double getValue() {
        return value;
    }

}
