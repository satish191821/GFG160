class Solution {
    public int countSubarrays(int arr[], int k) {
        Map<Integer,Integer> map= new HashMap<>();
        int ans=0;
        int n= arr.length;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum==k){
            ans++;
            }
        
        int a= currSum-k;
        if(map.containsKey(a)){
            ans+=map.get(a);
        }
        if(map.containsKey(currSum)){   // alternatively can use :- prefixSums.put(currSum, prefixSums.getOrDefault(currSum, 0) + 1);
            int b= map.get(currSum);
            map.put(currSum,b+1);
        }else{
            map.put(currSum,1);
        }
        }
       return ans; 
    }
    
}
