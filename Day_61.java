class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n= arr.length;
         int totSum=0;
         int Lsum=0,Rsum=0;
         
        for(int i=0;i<n;i++){
            totSum+=arr[i];
        }
        for(int i=0;i<n;i++){
            Rsum=totSum-Lsum-arr[i];
            if(Lsum==Rsum){
                return i;
            }else{
                Lsum+=arr[i];
            }
               
            
        }
        return -1;
    }
}
