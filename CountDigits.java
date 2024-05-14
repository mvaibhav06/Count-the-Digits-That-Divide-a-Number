class CountDigits {
    public int countDigits(int num) {
        int temp = num;
        int out = 0;

        while(temp>0){
            int a = temp%10;
            temp /= 10;
            if(num%a == 0){
                out++;
            }
        }
        return out;
    }
}
