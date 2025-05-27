

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int left=0;
        int right=arr.length-1;
        int ans=0;
        while(left<right){
            int h= Math.min(arr[left],arr[right]);
            int w= right-left;
            int currPani=h*w;
            ans=Math.max(ans,currPani);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
            
            
        }
        return ans;
    }
}
