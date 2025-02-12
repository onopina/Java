package inheritance_9.inheritance_9_3_3;

public class Car extends Vehicle {
    
    private static int fuel_consumption_100km = 10;
    
    public Car(double km_numbers){
        super(km_numbers);
    }
    
    public void drive(){
        System.out.println("The Car had done " + km_numbers + "km, " + km_numbers/fuel_consumption_100km + " liters of fuel were used");
    }
    
}