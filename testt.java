public class bank {
    private String number;
    private String name;
    private  String bank1;
    private double balance;
    private int limit;
    //constructor

    bank(String n,String nam, String bn, double bal,int lim){
        number= n;
        name = nam;
        bank1=bn;
        balance=bal;
        limit=lim;
    }
    //acesses methods
    public String getnum(){return number;}
    public String getname()
    {return name;}
    public String getbank(){ return bank1;}
    public double getbal(){return balance;}
    public int getlim(){ return limit;}


    //action methods
    public boolean chargeit(double price){
        if(price + balance > (double) limit){
            return false;
        }
        balance+=price;
        return true;


    }
    public void paymet(double payment){
        balance =- payment;
    }


    public static void printCard(bank c){
        System.out.println( "name" + "=" + c.getname());
        System.out.println( " number" + "=" + c.getnum());
        System.out.println("bank " + "=" + c.getbank());
        System.out.println("balance"+ "= "+ c.getbal());
        System.out.println("limit"+ "=" + c.getlim());

    }

    public class texi{
        public static void main(String[] args) {
            //bank bn = new bank('num334vidhi','vidhi','union bank of india',230887.23,500000);
            bank wlt[] = new bank[3];
            wlt[0]= new bank("2202 2432 2242 3543","vidhi yadav","union bank",24000,30000);
            wlt[1]= new bank("2302 3423 2356 3463","disha yadav","state bank",12000,20000);
            wlt[2]= new bank("2343 5432 3455 2335","chintub yadav","punjab bank",2300,10000);

            for(int i =0;i<wlt.length;i++){
                bank.printCard(wlt[i]);
                while(wlt[i].getbal()>15000){
                    wlt[i].paymet(1200);
                    System.out.println("new balance =" + wlt[i].getbal());
                }
            }


        }
    }






}
