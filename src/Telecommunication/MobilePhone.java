package Telecommunication;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPoweron;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    public void powerOn(){
        isPoweron = true;
        System.out.println("Phone powered on");
    }

    @Override
    public void answer() {
        if (isRinging && isPoweron){
            System.out.println("Answering the phone");
            isRinging = false;
        }
        else {
           System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isPoweron) {
            isRinging = true;
            System.out.println("Phone ringing");
        }
        else {
            System.out.println("Either wrong number or phone is off ");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " +phoneNumber+ " on phone");
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
