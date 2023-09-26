import java.util.Scanner;

public class prac {
    public int age;

    public prac(int iniage){
        if(iniage>0){
            age=iniage;

        }else{
            age=0;
            System.out.println("not valid,setting age to 0");
        }
        
    }

    public void yrpass(int yr){
        this.age+=yr;
    }

    public void amlod(){
        if(this.age<13){
            System.out.println("you are young");
        }else if(this.age>=13 && age<18){
            System.out.println("you are a teanager");
        }else{
            System.out.println("you are old");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // prac fir = new prac()
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int ag= sc.nextInt();
            prac fir = new prac(ag);
            System.out.println("after 3 yrs passed");
            fir.yrpass(3);
            System.out.println(fir.age);
            fir.amlod();



        }
    }



}
