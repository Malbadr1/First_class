import java.util.Scanner;

public class Car {

    Scanner input = new Scanner(System.in);
    private  String CarMaker;
    private int model;

    public Car() {
      this.CarMaker=CarMaker;
        this.model = model;
    }

    public String getCarMaker() {

        return CarMaker;
    }

    public void setCarMaker() {
        System.out.println("enter Car Maker ");
       String CarMaker=input.next();
        this.CarMaker = CarMaker;
    }

    public int getModel() {

        return model;
    }

    public void setModel() {
        System.out.println("enter Car Model ");
        model= input.nextInt();
        this.model = model;
    }

    public static void main(String[] args) {
        Car car=new Car();

        car.setCarMaker();
        car.setModel();
      String name=  car.getCarMaker();
        int model= car.getModel();
        System.out.println("name of car "+name+"\n"+"model of car "+model);
    }
}
