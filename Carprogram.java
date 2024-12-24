import java.util.Scanner;

public class Carprogram {
    public static void main(String[] args){
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car(5 ,"luxiorly");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter cartye for object car3: ");
        String type=scanner.nextLine();
        System.out.println("Enter value of days for car3: ");
        int d=scanner.nextInt();


        
        // System.out.println("The car type of the car1 is: "+car1.car_type);
        // System.out.println("The days rented of car1 is: "+car1.dayrented);
        // System.out.println("The car type of the car2 is: "+car2.car_type);
        // System.out.println("The days rented of car2 is: "+car2.dayrented);
        System.out.println("The cost of car3 is: "+car3.calculat_cost());
        //System.out.println("The daysrented of the car3 is: "+car3.dayrented);
    }
    
}
