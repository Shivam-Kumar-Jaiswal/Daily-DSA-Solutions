class Solution {
    public String intToRoman(int num) {
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] st = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        int i=0,r=0;
        while(num>0){
            if(num>=arr[i]){
                r=num/arr[i];
                while(r>0){
                    sb.append(st[i]);
                    r--;
                }
                num=num%arr[i];
            }
            i++;
        }
        return sb.toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna