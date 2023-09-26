public class codd {
   
        static char getCharacter(int k, String s) {
            // Write your code here.
            char find ;
            String chh;
            for(int i =0;;i++){
                chh=s.concat(s);
                
            }
            if (k >= 0 && k < s.length()) {
                return s.charAt(k);
            // return s.charAt(k);
            
        }
        public static void main(String[] args) {
            String s = "abvd";
            int k =5;
            getCharacter(k, s);
        }
    }

