import java.util.*;
class amt
{
    public Scanner sc=new Scanner(System.in);
    double amt;
    public void amount()
    {
        System.out.println("enter the current amount:");
        amt=sc.nextDouble();
    }
    public void withdraw(double withdraw_amt)
    {
        if(withdraw_amt<=amt)
          {
           amt = amt-withdraw_amt;
           System.out.println("Now your balance in you account is:"+amt);
           System.out.println("please take your money");
           System.out.println("THANK YOU!");
           }
        else 
        {
            System.out.println("Insufficient amount please try again!");
        }   
    }
     public void deposit(double deposit_amt)
     {

       amt = amt+deposit_amt;
       System.out.println("Now your balance in your account is:"+amt);
       System.out.println("successfully deposited! \n Thank you");
     } 
     public void checkBalance()
     {
        System.out.println("total balance in your account is:"+amt);
        System.out.println("THANK YOU!");
     }
     public void transfer(double trns)
     {
                        
        amt=amt-trns;
        System.out.println("Now your balance in your account is:"+amt);
        System.out.println("SUCCESSFULLY TRANSFER");
        System.out.println("THANK YOY!");
     }

        }
class ATM_machine
{
    public static void main(String args[])
    {
        
        amt a1=new amt();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the security pin to proceed:");
        int pin = s.nextInt();
        if(pin==1654)
        {
       a1.amount();
      while(true){
       System.out.println("1.WITHDRAW,2.DEPOSIT,3.CHECK BALANCE,4.TRANSFER,5.EXIT");
        System.out.println("-----------------------------------");
       System.out.println("enter your choice above 5 options");
        int choice=s.nextInt();
        switch(choice)
        {
           case 1:
                 System.out.println("Enter amount to withdraw:");
                 double n1=s.nextDouble();
                 a1.withdraw(n1);
                 break;
           case 2:
               System.out.println("Enter amount to deposit:");
               double n2=s.nextInt();
               a1.deposit(n2);
               break;
          case 3:
                a1.checkBalance();
                break;
          case 4:
                 System.out.println("Enter enter account number to transfer:");
                 long acc=s.nextLong();
                System.out.println("enter amount to transfer:");
                 double n3=s.nextInt();
                 a1.transfer(n3);       
                 break;
          case 5:
                  
                  System.exit(0);       
                  break;
          default:
                         System.out.println("INAVLID INPUT!");
                         System.out.println("your transaction failed!");
        }
    }
}   
else     
{
    System.out.println("Incorrect pin transaction fail!");
    System.out.println("please enter correct pin");
}
  }     
}           
    