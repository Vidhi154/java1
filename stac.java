import java.util.Stack;


public class stac {
    // private static String vidhi;

    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        //5 available methods 
        //peek - last item see
        //puch - add 
        //pop - last item remove 
        //empty - is empty
        //search - search for an item in stack 
        System.out.println(st.empty());
        st.push("vidhi");//6
        st.push("disha");//5
        st.push("chintu");//4
        st.push("mummy");//3
        st.push("papa");//2
        st.push("last item");// 1
        // System.out.println(st.peek());
        String sy = st.peek();
        System.out.println(st.empty());
        System.out.println(sy);
        System.out.println(st.search("chintu"));
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.push("garbage"));
        System.out.println(st);
        st.pop();
        String  atore = st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(atore);
        st.empty();

    }
}
