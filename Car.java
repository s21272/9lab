public class Car extends Vehicle {

    private int seats;

    public Car (int Seats){
        this.seats = Seats;
    }

    public int getSeats(){
        return seats;
    }

    @Override
    public void start(){
        System.out.println("start");
    }

    @Override
    public void stop(){
        System.out.println("stop");
    }

}
