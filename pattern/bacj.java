public class bacj {
    public static void chec(int i ,int n){
        if(i>n){
            return ;
        }
        chec(i+1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        int n =5;
        int i =1;
        chec(i, n);
    }
}
