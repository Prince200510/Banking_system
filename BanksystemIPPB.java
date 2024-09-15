// Prince Maurya
import java.util.*;
public class BanksystemIPPB {
    Scanner inputint = new Scanner(System.in);
    Scanner inputstring = new Scanner(System.in);
    public int num,search,bal_search,add_bal_search,add_bal,i,n,withdraw;
    public float bal,total_bal;
    public String mob_number,cust_name,email,login,pass; 
    public void data(){
        num = 0;
        mob_number = "";
        bal = 0;
        cust_name = "";
        email = "";
        search = 0;
        bal_search = 0;
        add_bal_search = 0;
        add_bal = 0;
        total_bal = 0;
        i=0;
        n=0;
        login="";
        pass="";
        withdraw=0;
    }
    public void Start() {
    System.out.println("|===========================================================|");
    System.out.println("|------------------Indin Post Payment Bank------------------|");
    System.out.println("|Press 1 for creating new account                           |");
    System.out.println("|Press 2 for display all the account details (Admin Login)  |");
    System.out.println("|Press 3 for searching account details                      |");
    System.out.println("|Press 4 for checking Balance of account                    |");
    System.out.println("|Press 5 for adding Balance in account                      |");
    System.out.println("|Press 6 for withdrawal money from account                  |");
    System.out.println("|===========================================================|");
    }
    public void acc_creation(){
        System.out.print("Enter the account number: ");
        num = inputint.nextInt();
        System.out.print("Enter the account name: ");
        cust_name = inputstring.nextLine();
        System.out.print("Enter the account holder mobile number :");
        mob_number = inputstring.nextLine();
        System.out.print("Enter the account holder email id :");
        email = inputstring.nextLine();
        System.out.print("Deposit money :");
        bal = inputint.nextFloat();
        System.out.println("---------------------------------------------------------");
    }
    public void display(){
            System.out.println("Account Number: " +num);
            System.out.println("Name: " +cust_name);
            System.out.println("Mobile Number: " +mob_number);
            System.out.println("Email-ID: " +email);
            System.out.println("Balance: " +bal);
    }
    public void acc_search(int search){
        if(search==num) {
            System.out.println("|=============================|");
            System.out.println("|-------Account Details-------|");
            System.out.println("|=============================|");
            System.out.println("Account Number: " +num);
            System.out.println("Name: " +cust_name);
            System.out.println("Mobile Number: " +mob_number);
            System.out.println("Email-ID: " +email);
            System.out.println("Balance: " +bal);

        }
    }
    public void check_balance(int check_search){
        if(check_search==num){
            System.out.println("|=============================|");
            System.out.println("|-------Customer Balance------|");
            System.out.println("|=============================|");
            System.out.println("Name: " +cust_name);
            System.out.println("Balance: " +bal);
            System.out.println("---------------------------------------------------------");
        }
         else {
            System.out.println("Record Not Found !");
            System.out.println("Please enter vaild account number");
        }
    }
    public void add_balance(int add_bal_search){
        if(add_bal_search==num){
            System.out.println("|=============================|");
            System.out.println("|---------Add Balance---------|");
            System.out.println("|=============================|");
            System.out.println("Name :" +cust_name);
            System.out.print("Enter the amount :");
            add_bal = inputint.nextInt();
            System.out.println("Balance added Successfully !");
            System.out.println("Previous Balance :" +bal);
            bal = add_bal + bal;
            System.out.println("New Balance :" +bal);
            System.out.println("---------------------------------------------------------");
        }
    }
    public void withdrawal(int withdrawal_search){
        if(withdrawal_search==num){
            
            System.out.println("|=============================|");
            System.out.println("|--------Withdraw Money-------|");
            System.out.println("|=============================|");
            System.out.println("Account Number: " +num);
            System.out.println("Name :" +cust_name);
            System.out.println("Mobile Number: " +mob_number);
            System.out.println("Email-ID: " +email);
            System.out.println("Balance: " +bal);
            System.out.print("Enter the amount :");
            withdraw = inputint.nextInt();
            if(bal >=500) {
            System.out.println("Money Withdraw Successfully !");
            System.out.println("Previous Balance :" +bal);
            bal = bal - withdraw ;
            System.out.println("New Balance :" +bal);
            System.out.println("---------------------------------------------------------");
        }
        else{
            System.out.println("Minimum withdrawal should be 500rs ");
        }
    }
    else{
        
    }
    }
    public static void main(String[] args){
        int size,i,choice,sea,bal_search,add_bals_search,withdraw;
        String pass;
        BanksystemIPPB obj1 = new BanksystemIPPB();
        obj1.data();
        obj1.Start();
        Scanner inputint = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of account to be create :");
        size = inputint.nextInt();
        BanksystemIPPB[] obj = new BanksystemIPPB[size];
        for(i=0;i<size;i++){
            obj[i] = new BanksystemIPPB();
        }
        do{
            System.out.print("Press anyone of them: ");
            choice = inputint.nextInt();
            switch(choice){
                case 1:{
                    for(i=0;i<size;i++){
                        obj[i].acc_creation();
                    }
                }
                break;
                case 2:{
                    System.out.print("Password :");
                    pass = input.nextLine();
                    if(pass.equals("prince")){
                        System.out.println("|=============================|");
                        System.out.println("|-------Account Details-------|");
                        System.out.println("|=============================|");
                    for(i=0;i<size;i++){
                        obj[i].display();
                    }
                }
                else{
                    System.out.println("Invaild password !");
                }
                }
                break;
                case 3:{
                    System.out.print("Search account, enter the account number:");
                    sea = inputint.nextInt();
                    for(i=0;i<size;i++){
                    obj[i].acc_search(sea);
                    
                    }
                }
                break;
                case 4:{
                    System.out.print("Enter the account number: ");
                    bal_search = inputint.nextInt();
                    for(i=0;i<size;i++){
                        obj[i].check_balance(bal_search);
                    }
                }
                break;
                case 5:{
                    System.out.print("Enter the account number: ");
                    add_bals_search = inputint.nextInt();
                    for(i=0;i<size;i++){
                        obj[i].add_balance(add_bals_search);
                    }
                }
                break;
                case 6:{
                    System.out.print("Enter the account number: ");
                    withdraw = inputint.nextInt();
                    
                    for(i=0;i<size;i++){
                        obj[i].withdrawal(withdraw);
                    }
                }
                break;
                case 7:
                System.out.println("Thanks you");
                break;
                default:System.out.println("Invaild Press");
            }
        }while(choice!=7);
    }
}

