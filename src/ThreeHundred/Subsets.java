package ThreeHundred;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        List<List<Integer>> ans =subsets(nums);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(nums,0,new ArrayList<Integer>() , ans);
        return ans;

    }

    public static void generateSubsets(int[] nums, int indx, List<Integer> current, List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(current));

        for(int i=indx; i <nums.length;i++)
        {
            current.add(nums[i]);
            generateSubsets(nums,i+1,current,ans);
            System.out.println(current);
            current.remove(current.size()-1);
        }

    }
}
