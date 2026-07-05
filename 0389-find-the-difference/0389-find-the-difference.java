class Solution {
    public char findTheDifference(String s, String t) {
             
                 int str1len = s.length();
                 int str2len = t.length();
                 int sum1 = 0;
                 for(int i=0;i<str1len;i++){
                        sum1+=s.charAt(i);
                 }

                 int sum2 = 0;
                 for(int j=0;j<str2len;j++){
                       sum2+=t.charAt(j);
                 }
             
                 return (char)(sum2-sum1);
    }
}