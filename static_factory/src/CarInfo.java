
public class CarInfo {
    private String brand;
    private String color;

    // private 생성자
    private CarInfo(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    
    // 정적 팩토리 메서드 (매개변수 하나는 from 네이밍)
    public static CarInfo brandBlackFrom(String brand) {
        return new CarInfo(brand, "black");
    }

    // 정적 팩토리 메서드 (매개변수 여러개는 of 네이밍)
    public static CarInfo brandColorOf(String brand, String color) {
        return new CarInfo(brand, color);
    }
	
	public static void main(String[] args) {
	    // 검정색 테슬라 자동차 
		CarInfo teslaCar = CarInfo.brandBlackFrom("Tesla");
	    // 빨간색 BMW 자동차
		CarInfo bmwRedCar = CarInfo.brandColorOf("BMW", "Red");
	}
}
