package static2.ex;

public class Car {
    private static int totalCars;
    private String model;

    public Car(String model){
        System.out.println("차량구입, 이름: " + model);
        this.model = model;
        totalCars++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
