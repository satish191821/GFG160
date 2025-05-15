class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>> map= new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            String s1=arr[i];
            char chars[]= new char[s1.length()];
            for(int j=0;j<s1.length();j++){
                chars[j]=s1.charAt(j);
            }
            
            Arrays.sort(chars);
            String key= new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s1);
        }
        ArrayList<ArrayList<String>> ans= new ArrayList<>();
           ans.addAll(map.values());
           return ans;
    }
}
