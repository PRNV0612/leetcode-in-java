class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        String[] ans= new String[n];
        for(int i=0;i<n;i++){
            int k=findtallest(heights);
            ans[i]=names[k];
        }

        return ans;
    }

    public int findtallest(int[] heights){
        int maxindex=0;
        int n=heights.length;

        for(int i=0;i<n;i++){
            if(heights[i]>heights[maxindex]){
                maxindex=i;
            }
        }
        heights[maxindex]=0;

        return maxindex;
    }
}