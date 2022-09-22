package String;

public class String1 {
    public static void main(String[] args) {
        String s1 ="Kartik";
        String s2="Karan";
        int c1=0;
        int c2=0;
        if(s1.length() > s2.length())
            System.out.println(1);
        else if (s2.length() >s1.length()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i))
                    c1++;
                else if (s1.charAt(i) < s2.charAt(i)) {
                    c2++;
                }
            }

            if (c1 == s1.length())
                System.out.println(1);
            else if (c2 == s2.length())
                System.out.println(-1);
            else {
                System.out.println(0);
            }
        }
    }

    public static int isCompare(String s1, String s2){
        int i=0;
        int j=0;
        while(i <s1.length() && j< s2.length())
        {
            if(s1.charAt(i) >s2.charAt(j))
                return 1;
            else if (s2.charAt(j) >s1.charAt(i)) {
                return -1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
