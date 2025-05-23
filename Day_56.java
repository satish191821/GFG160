class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n= arr.length;
        int start=0,end=0;
        int cSum=0;
        ArrayList<Integer>list= new ArrayList<>();
        for(int i=0;i<n;i++){
         cSum+=arr[i];
            if(cSum>=target){
                end =i;
            }
            while(cSum> target && start<end){
                cSum-=arr[start];
                start++;
            }
            if(cSum==target){
                list.add(start+1);
                list.add(end+1);
               return list; 
                
            }
        }
         list.add(-1);
         return list;
         
    }
}
