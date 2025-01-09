package Telecommunication;

public class Main {
    public static void main(String[] args) {
        DeskPhone phone = new DeskPhone("123456");
        phone.powerOn();
        phone.callPhone("123456");
        phone.answer();

        System.out.println();

        MobilePhone mobilePhone = new MobilePhone("9876567");
        mobilePhone.powerOn();
        mobilePhone.callPhone("9876567");
        mobilePhone.answer();
    }
}
