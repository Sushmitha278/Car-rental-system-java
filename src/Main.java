import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Sample Cars
        cars.add(new Car("C1", "Toyota", 2000));
        cars.add(new Car("C2", "Honda", 1800));

        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getCarId() + " - " + car.getBrand());
            }
        }
       System.out.print("Enter Car ID: ");
        String carId = sc.nextLine();

        Car selectedCar = null;
        for (Car car : cars) {
            if (car.getCarId().equals(carId) && car.isAvailable()) {
                selectedCar = car;
                break;
            }
        }

        if (selectedCar == null) {
            System.out.println("Car not available!");
            return;
        }

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        Customer customer = new Customer("U1", name);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        selectedCar.rentCar();

        Rental rental = new Rental(selectedCar, customer, days);
        rental.printRentalDetails();
    }
}
