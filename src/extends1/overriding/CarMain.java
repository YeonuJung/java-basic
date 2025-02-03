package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        // 상속 관계 덕분에 중복은 줄어들고, 편리하게 확장할 수 있다
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
