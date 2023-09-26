public class cmmm {
    public static void main(String[] args) {
        //System.out.println(args[0]);

        if(args.length>0){
            System.out.println("the comd line " + "arguments :");
            for(int i =0;i<args.length;i++){
                System.out.println(args[i]);
               // System.out.println(" ");
            }
        }else{
            System.out.println("no args" + " \n" + "enter");
        }
    }
}
