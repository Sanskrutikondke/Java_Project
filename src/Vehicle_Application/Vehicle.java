package Vehicle_Application;

public class Vehicle {
    private String name;
    private int currentspeed;
    private int currentdirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentspeed = 0;
        this.currentdirection = 0;
    }
    public void stear(int direction){
        this.currentdirection+=direction;
        System.out.println("stear method called: stearing at "+currentdirection+ " degrees.");
    }
    public void move(int speed , int direction){
        currentspeed = speed;
        currentdirection = direction;
        System.out.println("move method called: Moving at "+currentspeed+" in direction "+currentdirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public int getCurrentdirection() {
        return currentdirection;
    }

    public void setCurrentdirection(int currentdirection) {
        this.currentdirection = currentdirection;
    }
    public void stop(){
        currentspeed = 0;
        System.out.println("vehicle is stoped");
    }
}
