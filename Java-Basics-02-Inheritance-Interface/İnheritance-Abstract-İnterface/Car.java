public class Car extends Vehicle implements Drivable{
    int seatCount;
    Car(String brand ,int year, int seatCount){
        super(brand,year);
        this.seatCount= seatCount;
    }

    @Override
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Seats: " + seatCount);
    }

    @Override
    public void drive() {
        Drivable.super.drive();
    }
}
