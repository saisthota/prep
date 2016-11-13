public class isUnique {
    public static void main(String args[]) {
        String myString = "Sai";
        System.out.println(isUnique(myString)); //prints true;
    }
    
    private static boolean isUnique(String str) {
        if(str.length() > 128) return false;
        
        boolean[] char_set = new boolean[128];
        
        for(int i=0; i<str.length(); i++) {
            int val = str.charAt(i); // returns ascii value of the character at i.
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
