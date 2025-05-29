

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n= arr.length;
        HashMap<Integer,Integer>map= new HashMap<>();
        int Psum=0;
        int currL=0,maxL=0;
        for(int i=0;i<n;i++){
            Psum+=arr[i];
            if(Psum==k){
                maxL= i+1;
            }
            if(map.containsKey(Psum-k)){
                currL=i-map.get(Psum-k);
                maxL=Math.max(currL,maxL);
            }
            if(!map.containsKey(Psum)){
                map.put(Psum,i);
            }
        }
        return maxL;
    }
}
