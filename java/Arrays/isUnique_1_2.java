//O(n²) solution to check if a string is unique without any using data structure.

public class isUnique_1_2 {
    public static void main(String arg[]) {
        String myString = "Sandeep";
        
        System.out.println(isUnique(myString));
    }
    
    private static boolean isUnique(String str) {
        if(str.length() > 128) return false;
        
        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}