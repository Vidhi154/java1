public class stack {

    public static void name(){
        System.out.println("my name is vidhi");
    }

    public static void greet(){
        name();
        System.out.println("how are you ");
    }


    public static void bye(){
        greet();
        System.out.println("bye bye");
    }
    public static void main(String[] args) {
        int intro;
        bye();
    }
}
