import java.util.Scanner;

public class q7 {
    /**
     * @param my
     * @return
     */
    public static Boolean chek(int[] my){

        for(int i =0;i<my.length;i++){
            for(int j =i;j<my.length-1;){
                if(my[i]==my[j]){
                    return false;
                }
                return true;

            }
            //if(my[i]!=)
        }
        // for(int e: my){
        //     if(e==my[e]){
        //         return true;
        //     // }else
        //     //  return false;
        //     }
        //     return false;

        // }
        return true;
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int num = sc.nextInt();
        // int su =sum(num);
        int[] ar =  { 1,34,3,2,11};
        boolean ck= chek(ar);
        System.out.println(ck);
        }
    }



