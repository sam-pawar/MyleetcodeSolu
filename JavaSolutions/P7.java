class Solution {
    public int reverse(int temp) {
        int result = 0;
        int x = Math.abs(temp);
        while(x != 0){
            int w = x % 10;
            if (result > (Integer.MAX_VALUE - w) / 10) {
                return 0; 
            }
            result = result * 10 + w;
            x = x / 10;
        }
        return (temp < 0) ? (-result) : result;
        
    }
}
