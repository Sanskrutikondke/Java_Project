package Banking_Application;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number , double Balance , String Name , String Email , String PhoneNumber){
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void depositMoney(double DepositedMoney){
        this.Balance+=DepositedMoney;
        System.out.println("Deposit is successful, new Balance is "+this.Balance);
    }

    public void withdrawMoney(double WithdrawalMoney){
        if (this.Balance-WithdrawalMoney<0){
            System.out.println("Withdraw Unsuccessful only "+this.Balance+" is left");
        }
        else{
            this.Balance-=WithdrawalMoney;
            System.out.println("Withdraw Successful");
            System.out.println("Current Balance is "+this.Balance);
        }
    }

    public void setNumber(String number){
        Number = number;
    }
    public String getNumber(){
        return Number;
    }

    public void setBalance(double balance){
        Balance = balance;
    }
    public double getBalance(){
        return Balance;
    }

    public void setName(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }

    public void setEmail(String email){
        Email = email;
    }
    public String getEmail(){
        return Email;
    }

    public void setPhoneNumber(String phoneNumber){
        PhoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return PhoneNumber;
    }

}
