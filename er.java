public class er {
    public static int rec(int i){
       
        if(i<10){
            return 1 + rec(i+1);
        }

        return 0;
    }

    public static void main(String[] args) {
        int n =2;
        System.out.println(rec(n));
    }
}
