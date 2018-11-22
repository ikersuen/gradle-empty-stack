
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        Vehicle carA = new Vehicle("XaXa", "falali");
        Vehicle carB = new Vehicle("Eddie", "Jacky");

        carA.speedUp(30);
        carB.speedUp(40);

        Car car = new Car ("My Car", "Goodby");
        car.speedUp(180);
        car.speedUp(201);


    }


}

class Car extends Vehicle {
    public Car(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void speedUp(int speed) {
        if(speed > 190){
            System.out.print("Too Fast!!!!!!");
        }else{
            super.speedUp(speed);
        }
    }
}

class Vehicle {
    private String name;
    private String brand;

    public Vehicle (String name, String brand){
        this.name = name;
        this.brand = brand;
    }


    public void speedUp(int speed) {
        System.out.print("Name: " + this.name + " Brand: " + this.brand +  "speed up to " + speed);
    }
}
