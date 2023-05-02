import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        Car newCar=null;
        System.out.println("Enter Type of car");
        String carName = obj.next();
        System.out.println("Enter service codes");
        String serviceCodes=obj.next();
        String[] codes = serviceCodes.split(",",0);
        if(carName.equalsIgnoreCase("Hatchback"))
            newCar=new Hatchback();
        else if(carName.equalsIgnoreCase("Sedan"))
            newCar=new Sedan();
        else if(carName.equalsIgnoreCase("SUV"))
            newCar=new Suv();
        else{
            System.out.println("Enter valid car");
            System.exit(100);
        }
        int totalPrice=0;
        for(String code:codes){
            if(code.equalsIgnoreCase("BS01")){
                System.out.println("Charges for BS01 service-"+newCar.getBS01());
                totalPrice+=newCar.getBS01();
            }
            else if(code.equalsIgnoreCase("EF01")){
                System.out.println("Charges for BS01 service-"+newCar.getEF01());
                totalPrice+=newCar.getEF01();
            }
            else if(code.equalsIgnoreCase("CF01")){
                System.out.println("Charges for BS01 service-"+newCar.getCF01());
                totalPrice+=newCar.getCF01();
            }
            else if(code.equalsIgnoreCase("BF01")){
                System.out.println("Charges for BS01 service-"+newCar.getBF01());
                totalPrice+=newCar.getBF01();
            }
            else if(code.equalsIgnoreCase("GF01")){
                System.out.println("Charges for BS01 service-"+newCar.getGF01());
                totalPrice+=newCar.getGF01();
            }
            else{
                System.out.println("Enter correct codes");
                System.exit(100);
            }
        }
        System.out.println("Total Charge-"+totalPrice);
    }
}