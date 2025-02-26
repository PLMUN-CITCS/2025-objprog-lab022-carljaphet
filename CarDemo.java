class Car{
    String make;
    String model;
    int year;
    
    public void DisplayInfo(){
      System.out.println("car: " + year + " " + make + " " + model);  
    }
}
public class CarDemo {
    public static void main(String[] args){
        Car myCar= new Car();
        myCar.make= "Toyota";
        myCar.model= "Corolla";
        myCar.year= 2020;
        myCar.DisplayInfo();
}
}
