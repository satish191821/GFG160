

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n= arr.length;
        int longSeq=0;
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i] - 1)){
                int currNum=arr[i];
                int currSeq=1;
            
                while(set.contains(currNum+1)){
                    currNum++;
                    currSeq++;
                }
                longSeq=Math.max(currSeq,longSeq);
            }
        }
        return longSeq;
    }
}
