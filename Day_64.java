// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n= arr.length;
        int pt=1;
     int ans[]=new int[n];
     ans[0]=1;
     for(int i=1;i<n;i++){
         ans[i]= ans[i-1]*arr[i-1];
     }
      for(int j=n-1;j>=0;j--){
          ans[j]=ans[j]*pt;
          pt=pt*arr[j];
      }
      return ans;
    }
}
