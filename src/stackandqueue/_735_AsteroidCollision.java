package stackandqueue;

import java.util.Stack;

// https://leetcode.com/problems/asteroid-collision/

public class _735_AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            boolean add = true;
            if(asteroid > 0){
                stack.push(asteroid);
            }
            else{ // asteroid < 0
                if(!stack.isEmpty() && stack.peek() > 0){ // COLLISION
                    while(!stack.isEmpty() && stack.peek() > 0){
                        if(Math.abs(asteroid) == Math.abs(stack.peek())){
                            stack.pop();
                            add = false;
                            break;
                        }
                        else if(Math.abs(asteroid) > Math.abs(stack.peek())){
                            stack.pop();
                        }
                        else{
                            add = false;
                            break;
                        }
                    }
                    if(add)stack.push(asteroid);
                }
                else{
                    stack.push(asteroid);
                }
            }
        }
        int[] res = new int[stack.size()];
        while(!stack.isEmpty()){
            res[stack.size() - 1] = stack.pop();
        }
        return res;
    }
}
