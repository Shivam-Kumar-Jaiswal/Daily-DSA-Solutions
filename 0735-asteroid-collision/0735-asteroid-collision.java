class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> list = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<0){
                while(!list.isEmpty()  && list.peek()>0&&list.peek()<Math.abs(asteroids[i]))
                    list.pop();
                if(list.isEmpty()||list.peek()<0){
                    list.push(asteroids[i]);
                }else if(list.peek()==Math.abs(asteroids[i])){
                    list.pop();
                    continue;
                }
            }else{
                list.push(asteroids[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna