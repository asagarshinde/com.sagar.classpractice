public class Vehicle {
    private String size;
    private String name;
    private int wheels;
    private int ac;
    private int currentVelocity;

    public Vehicle(String size, String name, int wheels, int ac, int currentVelocity) {
        this.size = size;
        this.name = name;
        this.wheels = wheels;
        this.ac = ac;
        this.currentVelocity = 0;
    }

    public void move(int speed){
        System.out.println("From Vehilce class speed is " + speed);
    }
}
