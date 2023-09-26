
public  class re{
    static int count=0;
    public static void print(String name){
        count++;
        if(count==5){
            System.out.println();
        }else{
            System.out.println(name);
            print(name);
        }
    }
    public static void main(String[] args) {
        String name = "vidhi";
        print(name);
    }
}