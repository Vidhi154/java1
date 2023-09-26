import java.util.Scanner;

class complex{
    double first;
    double second ;

    complex(double fir,double sec){
        this.first=fir;
        this.second=sec;
    }
    complex(){

    }

    public complex add(complex num1, complex num2){
        complex sum = new complex(0.0, 0.0);
        sum.first=num1.first+ num2.first;
        sum.second = num1.second + num2.second;
        return sum;



    }
    public complex sub(complex num1, complex num2){
        complex sub = new complex(0.0, 0.0);
        sub.first=num1.first- num2.first;
        sub.second = num1.second - num2.second;
        return sub;



    }
    public complex mul(complex num1, complex num2){
        complex mul = new complex(0.0, 0.0);
        mul.first=num1.first * num2.first;
        mul.second = num1.second * num2.second;
        return mul;



    }
    public complex div(complex num1, complex num2){
        complex div = new complex(0.0, 0.0);
        div.first=num1.first/ num2.first;
        div.second = num1.second/num2.second;
        return div;



    }
    public String toString() {
        return " [" + this.first+ "+ i" + this.second + "]";
    }
}



public class ccomplee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1 real");
        double  nr1 = sc.nextDouble();
        System.out.println("enter the num2 real");
       double nr2 = sc.nextDouble();
       System.out.println("enter the num1 imaginary");
       double ni1 = sc.nextDouble();
       System.out.println("enter the num2 imaginary");
       double ni2 = sc.nextDouble();
        
    
    complex num1 = new complex(nr1 , ni1);
    complex num2 = new complex(nr2, ni2);
    
    System.out.println(num1.toString());
    System.out.println(num2.toString());
    complex suu = new complex();
    System.out.println("addition");
    suu=suu.add(num1,num2);
    System.out.println(suu);

    System.out.println("substitution");
    suu=suu.sub(num1, num2);
    System.out.println(suu);

    System.out.println("multiplication");
    suu=suu.mul(num1, num2);
    System.out.println(suu);

    System.out.println("division");
    suu=suu.div(num1, num2);
    System.out.println(suu);
    



    }

    // private static void add(complex num1, complex num2) {
    // }
}
