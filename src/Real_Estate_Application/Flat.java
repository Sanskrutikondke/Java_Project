package Real_Estate_Application;

public class Flat {

        private int SquareFeet;
        private int PricePerSquareFeet;
        private int FloorNumber;
        private int NumberOfRooms;

        public Flat(int squareFeet ,int pricePerSquareFeet, int floorNumber , int numberOfRooms){
             SquareFeet = squareFeet;
             PricePerSquareFeet = pricePerSquareFeet;
             FloorNumber = floorNumber;
             NumberOfRooms = numberOfRooms;
        }
    public int getFlatPrice(){
             int price  = SquareFeet*PricePerSquareFeet;
             return price;
    }
    public void printAllValues(){
        System.out.println("Square feet : "+SquareFeet);
        System.out.println("Price per square feet : "+PricePerSquareFeet);
        System.out.println("Floor number : "+FloorNumber);
        System.out.println("Number of rooms : "+NumberOfRooms);
    }
}
