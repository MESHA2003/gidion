public class Car {
    private int dayrented;
    private String car_type; 


    public String dayString;

   public Car(){
    dayrented=0;
    car_type="motorola";
   }
   public Car(int d,String type){
    dayrented=d;
    car_type=type;
   }
   public double calculat_cost(){
    double cost=0;
    if(car_type.equalsIgnoreCase("economy")){
        cost=dayrented*10;

    }
    else if(car_type.equalsIgnoreCase("standard")){
        cost=dayrented*20;
    }
    else if(car_type.equalsIgnoreCase("luxurly")){
        cost=dayrented*40;

    }
    else{
        System.out.println("invalid cartype");
    }

    if(dayrented>3){
        double discount=0.05*cost;
        cost=cost-discount;
    }
    return cost;
   }
    
}
