public class bul {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("vidhi");
        System.out.println(str);
        str.setCharAt(2, 'w');
        System.out.println(str);
        System.out.println(str.charAt(4));
        str.insert(4, 'y');
        System.out.println(str);
        str.delete(2, 4);
        System.out.println(str);
        str.append('s');
        System.out.println(str);
        


    }
}
