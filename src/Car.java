class Car {
    private String carId;
    private String brand;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, double pricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() { return carId; }
    public String getBrand() { return brand; }
    public double getPricePerDay() { return pricePerDay; }
    public boolean isAvailable() { return isAvailable; }

    public void rentCar() { isAvailable = false; }
    public void returnCar() { isAvailable = true; }
}
