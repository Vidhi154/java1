public class arey {
    
        public static int sum(double a , int b){
            // System.out.println(a+b);
            return (int) (a+b);
        }
        public static int fac(int a){
            int facc= 1;
            for(int i =1;i<=a;i++){
                facc= i*facc;
            }
            return facc;
        }
        public static void prt(int[] a){
            int num;
            for(int i =0;i<a.length;i++){
                num=a[i];
                System.out.print(num + " ");
            }
            // return ;
            System.out.println(" ");
        }
        public static void main(String[] args) {

            int[] b ={1,2,3,4,5};
            int[] b2 = b;
            int[] c = b.clone();
            prt(c);
           // System.out.println(" ");
            prt(b2);
            b[3]=40;
           // System.out.println(" ");
            prt(b);
           // System.out.println(" ");
            prt(b2);
            prt(c);
           // System.out.println(" ");
            System.out.println(b.length);
            // System.out.println(c);
            // System.out.print(prt(b2));
            // int a = 3;
            // System.out.println(fac(a));
            // int as= 13;
            // int bs= 3;
            // double a = sum(as,bs);
            // System.out.println(a);
        }
 }
    
