package Real_Estate_Application;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(1000 , 1550 , 9 ,4);
        System.out.println("Price of flat is "+flat.getFlatPrice());
        flat.printAllValues();
    }
}
