public class Comdln{
public static void main(String[] args){

if(args.length>0){
System.out.println("the command line " + "arguments are:");
for(int i =0;i<args.length;i++){
System.out.println(args[i]);
}
}else{
System.out.println("no command line" + "arguments found");
}
}
}