package Telecommunication;

public class DeskPhone implements Telephone{
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    public void powerOn(){
        System.out.println("DeskPhone is always powered");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the deskphone");
            isRinging = false;
        }
        else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber) {
           isRinging = true;
            System.out.println("Phone ringing");
        }
        else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " +phoneNumber+ " on deskphone");
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
