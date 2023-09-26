import java.util.Arrays;
import java.util.Scanner;

class card{
    private String name;
    private int actno;
    private int balance;
    private int id;
    private int limit;
    private String bank;
    


    card(String nam,int actn,String bankk,int d,int balanc){
        name=nam;
        actno=actn;
        id=d;
        bank=bankk;
        balance= balanc;
    }

    card(){

    }

    public void setname(String name){
         this.name=name;
    }

    public void setbank(String bank){
         this.bank=bank;
    }

    public void setbalance(int bal){
         this.balance=bal;
    }

    public void setlimit(int limit){
         this.limit=limit;
    }

    public String getName() {
        return name;
    }

    public int getActno() {
        return actno;
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public int getLimit() {
        return limit;
    }

    public String getBank() {
        return bank;
    }

    public void upddate(int newbal){
        this.balance=newbal;
    }

    public void chargit(int charge){
        if(this.balance>limit){
            System.out.println("!!!they will charge!!!!");
            this.balance -= charge;
            System.out.println("charge is :" + charge + " " + " balance - chage is :");
            System.out.println(this.balance);
            // System.out.println(this.getBalance());

        }else{
            System.out.println("----there is no charge----");
            System.out.println(this.balance);
           
        }


        // this.balance -= charge;
    }

    public int makepay(int payed){
        this.balance+=payed;
        return this.balance;
        


    }

    public void mainn(){
        System.out.println("name of patience:" + this.name);
        System.out.println("the id is :" + this.id);
        System.out.println("the bank is " + this.bank);
        System.out.println("the balance of account is :" + this.balance);

    }




}


public class creadit {
    public static void main(String[] args) {
        card[] cret = {new card("vidhi",2098,"SBI",97,2375000),new card("disha",22076,"union",76,734260),new card("chintu",22054,"panjab",54,372468)};
        // System.out.println(Arrays.toString(cret));
        Scanner sc = new Scanner(System.in);
        int i;
        for( i=1;i<=cret.length;i++){
            System.out.println(i);
            System.out.println("name = " + cret[i].getName());
            System.out.println("account = "+cret[i].getActno());
            System.out.println("balance = "+ cret[i].getBalance());
            System.out.println("bank = " + cret[i].getBank());


            System.out.println("enter the limit:");
            int lm = sc.nextInt();
            cret[i].setlimit(lm);
            System.out.println("lets seee have you charged or not");
            System.out.println("-----------");
            cret[i].chargit(5000);
            // System.out.println("if they are equal or not ----");
            // cret[i].equals(cret[i+1]);
            System.out.println("ohhh , you have paid !");
            cret[i].makepay(10000);

        }
        for( i=0;i<cret.length-1;i++){
        System.out.println("if they are equal or not ----");
            cret[i].equals(cret[i+1]);
        }
        System.out.println("----------------------");
        for(card ea: cret){
            System.out.println("your bank details -");
            ea.mainn();
            
        }

        
    }
}
