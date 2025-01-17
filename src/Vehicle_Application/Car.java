package Vehicle_Application;

public class Car extends Vehicle{

    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isMannul;
    private int currentgear;
    public Car(String name , int wheels , int doors , int gears , boolean isMannul , String type) {
        super(name);
        this.type = type;
        this.doors =doors;
        this.gears =gears;
        this.isMannul = isMannul;
        this.wheels = wheels;
        currentgear = 1;
    }
    public void changegear(int newgear){
        this.currentgear = newgear;
        System.out.println("changegear method called: Changed is "+this.currentgear+ " gear");
    }
    public void changespeed(int newspeed , int newdirection){
        move(newspeed , newdirection);
        System.out.println("changedspeed method called: Speed -> "+newspeed+ " direction-> "+newdirection);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isMannul() {
        return isMannul;
    }

    public void setMannul(boolean mannul) {
        isMannul = mannul;
    }

    public int getCurrentgear() {
        return currentgear;
    }

    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
    }
}
