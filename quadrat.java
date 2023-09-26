public class quadrat {
    public static void quadratic(double a , double b, double c){
        double d = -b * 4 * a * c;
        if(d>0){
            qq(a, b, d);

        }
        else if(d==0){
            qq(a, b);

        }
        else{
            qq1(a, b, d);

        }
    }
    public static void qq(double a, double  b ,double d){
        System.out.println("this is real number");

        double root = (-b + Math.sqrt(d))/2*a;
        double root2 = (-b - Math.sqrt(d))/2*a;
        System.out.println("root1 =" + root);
        System.out.println("root2 =" + root2);


    }

    public static  void qq(double a, double b){
        System.out.println("this has one real ");
        double root = - b/2*a;
        System.out.println("root = " + root);
    }

    public static void qq1(double a , double b , double d){
        System.out.println("this has no real part");
        double real = -b/2*a;
        double img = Math.sqrt(-d)/2*a;
        System.out.println("real =" + real + "\n"+ " imaginary =" + img);
    }

    public static void main(String[] args) {
        double a = 24.5;
        double b =53.2;
        double c =42.34;

        quadratic(a, b, c);
    }
}
