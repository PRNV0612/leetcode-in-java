//234.Sliding Window Maximum

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//using double ended queue(deque)
public class slidingwindowmax {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            Deque<Integer> de = new LinkedList<Integer>();
            List<Integer> answers = new ArrayList<>();

            int n = nums.length;
            de.offer(0); 
            
            //for first window
            for(int i=1;i<k;i++){
                //leftmost element in the de is the max element
                while(de.size()>0 && nums[de.peekLast()] < nums[i]){
                    de.removeLast();
                }
                de.offerLast(i);
            }
            answers.add(nums[de.peek()]);

            //for rest of windows
            for(int j=k;j<n;j++){
                int startpt=j-k+1;
                //remove all indexes from de that are less than the startpt
                while(de.size()>0 && de.peek() < startpt){
                    de.removeFirst();
                }

                while(de.size() > 0 && nums[de.peekLast()] < nums[j]){
                    de.removeLast();
                }
                de.offerLast(j);
                answers.add(nums[de.peek()]);
            }

            int[] ans = new int[answers.size()];

            for(int i=0;i<answers.size();i++){
                ans[i]=answers.get(i);
            }

            return ans;
        }
    }
}




//Inefficient Solution
//exceeds time

// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n=nums.length;
//         int[] ans=new int[n-(k-1)];
//         for(int i=0;i<n-k+1;i++){
//             int max=nums[i];
//             for(int j=i;j<i+k;j++){
//                 max=Math.max(max,nums[j]);
//             }
//             ans[i]=max;
//         }

//         return ans;
//     }
// }
