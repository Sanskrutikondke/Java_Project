package Mobile_Phone_Application;

public class Mobile {
    private int ScreenSize;
    private String CompanyName;
    private String OperatingSystem;
    private int BatteryPercent;

    public Mobile(int _screenSize , String _companyName , String _operatingSystem ){
        ScreenSize = _screenSize;
        CompanyName = _companyName;
        OperatingSystem = _operatingSystem;
        BatteryPercent = 100;
    }

    public void setScreenSize(int screenSize){
        ScreenSize = screenSize;
    }

    public int getScreenSize() {
        return ScreenSize;
    }

    public void setCompanyName(String companyName){
        CompanyName = companyName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public int getBatteryPercent() {
        return BatteryPercent;
    }

    public void takePicture(){
        if (BatteryPercent < 10){
            System.out.println("Cannot take picture battery is not sufficient.");
        }
        else {
            System.out.println("Picture to be taken.");
            BatteryPercent = BatteryPercent - 10;
        }
    }

    public void recordVideo(){
        if (BatteryPercent < 30){
            System.out.println("Cannot record video Battery is not sufficient.");
        }
        else{
            System.out.println("Video is recorded.");
            BatteryPercent-=30;
        }
    }

    public void playMobileGame(){
        if (BatteryPercent < 60){
            System.out.println("You cannot play game Battery is not sufficient.");
        }
        else {
            System.out.println("Playing video game.");
            BatteryPercent-=60;
        }
    }

    public void charge(){
        if (BatteryPercent < 0){
            System.out.println("Battery is dead");
        }
        else if(BatteryPercent == 100){
            System.out.println("Battery is charged 100%");
        }
        BatteryPercent =100;
        System.out.println("Charging...");
        System.out.println("Battery percent is 100");
    }
}
