class Solution {
    public boolean isPalindrome(int x) {

        char[] newInt = String.valueOf(x).toCharArray();
        int count = 1; 
        boolean palindrome = true;
        for(int i = 0 ; i<newInt.length ; i++){
            if(newInt[i]!=newInt[newInt.length-count]){
                palindrome = false;
                break;
            }
            count++;
        }
        return palindrome; 
    }
}
