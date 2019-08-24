
public class Vehicle {
    private String size;
    private String name;

    private int currentVelocity;
    private int currentDirection;

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public Vehicle(String size, String name) {
        this.size = size;
        this.name = name;

        this.currentVelocity = 0;

        this.currentDirection = 0;

    }

    public void steer(int dirction){
        this.currentDirection += dirction;
        System.out.println("Vehicles.steer(): steering at " + currentDirection + " degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move Moving at  " + currentVelocity + " in dirction " + currentDirection);
    }

    public  void  stop(){
        this.currentVelocity = 0;
    }
}
