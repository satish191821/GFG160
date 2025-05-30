class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int n= arr.length;
        HashMap<Integer,Integer>map= new HashMap<>();
        int Psum=0,len=0;
        for(int i=0;i<n;i++){
            int temp;
            if(arr[i]==0){
                temp=-1;
            }else{
                temp=1;
            }
        Psum+=temp;
        if(Psum==0){
            len=i+1;
        }
        if(!map.containsKey(Psum)){
            map.put(Psum,i);
        }else{
            int pt=map.get(Psum);
            len=Math.max(len,i-pt);
        }
        }
         return len;
    }
}
