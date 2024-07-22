//875. Koko Eating Bananas

/*
find the range of possible bananas per hour, 
ie: start will be minimum 1 as she will have to eat atleast 1 banana,
end will be the maximum value of bananas in the piles.

if the selected speed is possible within the given time, then,
we check for a value less than it which will be valid.
 */



class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=findMax(piles);

        int k=-1; //ans

        while(start<=end){
            int mid=(start+end)/2;

            if(isPossible(piles,h,mid)){
                k=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return k;

    }

    public boolean isPossible(int[] piles,int h,int k){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=Math.ceil((piles[i]+0.0)/k);
        }
        return hours<=h;
    }

    public int findMax(int[] piles){
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
}