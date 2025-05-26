class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n= arr.length;
        if(n<=2){
            return 0;
        }
        int Lmax[]=new int[n];
         Lmax[0]= arr[0];
        for(int i=1;i<n;i++){
            Lmax[i]= Math.max(arr[i],Lmax[i-1]);
        }
        int Rmax[]= new int[n];
        Rmax[n -1]= arr[n-1];
        for(int i=n-2;i>=0;i--){
            Rmax[i]= Math.max(arr[i],Rmax[i+1]);
            
        }
        int trapedPani=0;
        for(int  i=0;i<n;i++){
            int paniLev= Math.min(Lmax[i],Rmax[i]);
            trapedPani +=paniLev - arr[i];
        }
        return trapedPani;
    }
}
