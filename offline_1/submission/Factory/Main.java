import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give your country location");
        String location = scn.nextLine();

        CarFactory factory = new CarFactory();
        Manufacturer manufacturer = factory.getManufacturer(location);
        Car car = manufacturer.getCar();

        System.out.println("The client's location is " + location);
        System.out.println("The preferred company is " + car.giveName());
        System.out.println("The company is dominated by " + car.ManuCountry());
        System.out.println("The color of the car is " + car.giveColor());
        System.out.println("The car uses " + car.giveEngine() + " engine");
        System.out.println("The car has " +  car.giveDriveTrain() + " drive trains");
    }
}