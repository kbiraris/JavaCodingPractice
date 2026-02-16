import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Car{
    int id;
    String brand;
    String type;
    String color;
    double price;

    Car(int id, String brand, String type, String color,double price){
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;

    }
}

public class CarDealership {
    public static void main(String[] args) {
        Car car1 = new Car(1,"Honda","Sedan","White",15000.00);
        Car car2 = new Car(2,"BMW","SUV","Blue",115000.00);
        Car car3 = new Car(3,"Mercedes","SUV","Blue",20000.00);

        Car[] cars = {car1,car2,car3};
        for(Car car: cars){
            System.out.println(car.id + " " + car.brand + " " + car.color + " " + car.type + " " + car.price);
        }
        String carColour = "Blue";
        List<Car> result = findCarWithColor(cars,carColour);
        for(Car r : result){
            System.out.println(r.brand + " is of colour " + r.color );
        }
    }
    private static List<Car> findCarWithColor(Car[] cars, String carColour){
        List<Car> result = new ArrayList<>();

        for(Car car: cars){
            if(car.color.equalsIgnoreCase(carColour)){
                result.add(car);
            }
        }
        return result;
    }

}
