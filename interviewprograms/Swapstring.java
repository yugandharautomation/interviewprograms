package class1;

public class Swapstring {
    public boolean swap(String s1, String s2) {
        int len1 = s1.length();
       int len2 = s2.length();

       if (len1 != len2) {
           return false;
       }

       int diffNum = 0;
       int[] idx = new int[2];

       for (int i = 0; i < len1; i++) {
           if (s1.charAt(i) != s2.charAt(i)) {
               if (diffNum >= 2) {
                   return false;
               }

               idx[diffNum++] = i;
           }
       }

       if (diffNum == 0) {
           return true;
       }

       if (diffNum == 2) {
           if (s1.charAt(idx[0]) == s2.charAt(idx[1])
               && s1.charAt(idx[1]) == s2.charAt(idx[0])) {
               return true;
           }
       }

       return false;
   }
public static void main(String[] args) {
	Swapstring obj=new Swapstring();
	boolean a=obj.swap("bark" , "bark");
	System.out.println(a);
}
}
