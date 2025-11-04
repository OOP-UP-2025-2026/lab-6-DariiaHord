package org.example;

public class Car implements Comparable { // навмисно без дженериків
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() { return price; }
    public int getYear() { return year; }
    public int getHorsePower() { return horsePower; }

    public void setPrice(int price) { this.price = price; }
    public void setYear(int year) { this.year = year; }
    public void setHorsePower(int hp) { this.horsePower = hp; }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car)) return 0;
        Car other = (Car) o;

        // 1) менша ціна "більше"
        if (this.price < other.price) return 1;
        if (this.price > other.price) return -1;

        // 2) новіший рік "більше"
        if (this.year > other.year) return 1;
        if (this.year < other.year) return -1;

        // 3) більше к.с. "більше"
        if (this.horsePower > other.horsePower) return 1;
        if (this.horsePower < other.horsePower) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "Car{price=" + price + ", year=" + year + ", hp=" + horsePower + "}";
    }
}
