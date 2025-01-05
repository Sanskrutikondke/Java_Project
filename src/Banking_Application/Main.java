package Banking_Application;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("12340" ,0.0 , "Sanskruti" ,"Sanskruti@xyz.com" , "9087654321");
        account.depositMoney(100);
        account.depositMoney(300);
        account.withdrawMoney(200);
    }
}

