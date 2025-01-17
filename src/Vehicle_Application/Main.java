package Vehicle_Application;

public class Main {
    public static void main(String[] args){
        SUV suv = new SUV("fortuner" , false);
        suv.move(40,0);
        suv.accelerate(20);
//        suv.accelerate(-60);
        System.out.println("Current Gear: "+suv.getCurrentgear());
        System.out.println("Current Speed: "+suv.getCurrentspeed());
    }
}
