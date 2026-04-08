class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public double calculateTotalPrice() {
        return car.getPricePerDay() * days;
    }

    public void printRentalDetails() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Car: " + car.getBrand());
        System.out.println("Days: " + days);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}
