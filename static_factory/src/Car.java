
public class Car {
    private String brand;
    private String color = "black";

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand) {
        this.brand = brand;
    }
    
    public static void main(String[] args) {
        // 검정색 테슬라 자동차 
        Car teslaCar = new Car("Tesla");

        // 빨간색 BMW 자동차
        Car bmwRedCar = new Car("BMW", "Red");
    }
}