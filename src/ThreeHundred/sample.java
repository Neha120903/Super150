package ThreeHundred;
/*Sample Input
aaabbccds
Sample Output
a3b2c2d1s1*/
import java.util.*;

public class sample {


        public static long chessboard(int n, int r, int c, String ans,List<Integer> primes)
        {
            long sum = 0;
            if (r >= n || c >= n)
                return 0;
            if ((r + 1) == n && n == (c + 1))
            {
                ans = ans + ("{" + r + "-" + c + "}");
                System.out.print(ans + " ");
                return 1;
            }
            int number=n*(r+1)-(n-c-1);

            if(primes.contains(number))
            {
                int index=Collections.binarySearch(primes,number);
                if(index%2!=0)
                    sum += chessboard(n, n-1, n-1, ans + "{" + r + "-" + c + "}" + "P",primes);
                else return sum;
            }

            if ((r + 2) < n && (c + 1) < n)
                sum += chessboard(n, (r + 2), (c + 1), ans + "{" + r + "-" + c + "}" + "K",primes);

            if ((r + 1) < n && (c + 2) < n)
                sum += chessboard(n, (r + 1), (c + 2), (ans + ("{" + r + "-" + c + "}" + "K")),primes);

            if (r == 0 || r + 1 == n || c == 0 || c + 1 == n)
            {
                for (int i = 1; (c + i) < n; i++)
                    sum += chessboard(n, r, (c + i), (ans + ("{" + r + "-" + c + "}" + "R")),primes);

                for (int i = 1; (r + i) < n; i++)
                    sum += chessboard(n, (r + i), c, ans + ("{" + r + "-" + c + "}" + "R"),primes);

            }
            if ((r==c) || r+c==n-1)
            {
                for (int i = 1; (r + i) < n && (c + i) < n; i++)
                    sum += chessboard(n, (r + i), (c + i), ans + ("{" + r + "-" + c + "}" + "B"),primes);

            }
            return sum;
        }
        public static List<Integer> Sieve(int n)
        {
            boolean[] arr = new boolean[n + 1];
            arr[0] = true;
            arr[1] = true;

            for (int i = 2; i*i< arr.length; i++)
            {
                if (arr[i] == false) {
                    for (int j = 2; i * j <= n; j++) {
                        arr[i * j] = true;
                    }
                }
            }
            List<Integer> al=new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == false) {
                    al.add(i);
                }
            }
            return al;
        }
        public static void main(String args[]) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            long ans = chessboard(n, 0, 0, "",Sieve(n*n));
            System.out.println();
            System.out.println(ans);
        }
    }


