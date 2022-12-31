package Stack;

import java.util.Stack;
/*n = 4, m = 4
M[][] = {{0 1 1 0},
         {1 1 1 1},
         {1 1 1 1},
         {1 1 0 0}}*/
public class MaximalRectangle {
    public static void main(String[] args) {
        int[][]matrix={{0, 1, 1, 0},
                {1, 1, 1, 1},
                {1 ,1, 1, 1},
                {1 ,1 ,0 ,0}};
            int []ans=new int[matrix[0].length];
            int area=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==1)
                    ans[j]++;
                else
                    ans[j]=0;
            }
            area=Math.max(area,are(ans));
        }
        System.out.println(area);
    }
        public static int are(int[]arr)
        {
            java.util.Stack<Integer> s= new Stack<>();
            int maxarea=0;
            for(int i=0;i<arr.length;i++)
            {
                while(!s.isEmpty() && arr[i]<arr[s.peek()]) { // getting the previous greater element
                    int h = arr[s.pop()];
                    int r = i;
                    if (s.isEmpty())
                        maxarea = Math.max(maxarea, h * r);
                    else {
                        int l=s.peek();
                        maxarea=Math.max(maxarea,h*(r-l-1));
                    }
                }
                s.push(i);
            }
            int r=arr.length;
            while(!s.isEmpty() ) {
                int h = arr[s.pop()];

                if (s.isEmpty())
                    maxarea = Math.max(maxarea, h * r);
                else {
                    int l=s.peek();
                    maxarea=Math.max(maxarea,h*(r-l-1));
                }
            }
            return maxarea;
        }

//        public static int maxA(int[]arr)
//        {
//            int maxarea=0;
//            Stack<Integer> s= new Stack<>();
//            for (int i=0;i< arr.length;i++)
//            {
//                while (!s.isEmpty() && arr[s.peek()] <arr[i])
//
//
//                s.push(arr[i]);
//            }
//            return maxarea;
//        }
}
