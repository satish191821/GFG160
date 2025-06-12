// User function Template for Java
class Solution {
    double power(double b, int e) {
       if(e==0){
           return 1;
       }
       if(e<0){
           return 1/power(b,-e);
       }
       double hp=power(b,e/2);
       if(e%2==0){
           return hp*hp;
       }else{
           return b*hp*hp;
       }
    }
}
