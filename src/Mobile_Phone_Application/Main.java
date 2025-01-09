package Mobile_Phone_Application;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(6, "Apple" , "IOS");
        System.out.println("Battery of an Mobile is : " +mobile.getBatteryPercent());
        System.out.println("Company name of mobile is : " +mobile.getCompanyName());
        System.out.println("Operating system of mobile is : " +mobile.getOperatingSystem());
        System.out.println("Screen size of Mobile is : " +mobile.getScreenSize());
        System.out.println();
        mobile.takePicture();
        System.out.println("Battery of an Mobile is : " +mobile.getBatteryPercent());
        System.out.println();
        mobile.playMobileGame();
        System.out.println("Battery of an Mobile is : " +mobile.getBatteryPercent());
        System.out.println();
        mobile.recordVideo();
        System.out.println("Battery of an Mobile is : " +mobile.getBatteryPercent());
        System.out.println();
        mobile.charge();
        //System.out.println("Battery of an Mobile is : " +mobile.getBatteryPercent());
    }
}
