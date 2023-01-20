package v1.v1.main;
import java.util.*;
import java.lang.Math;

public class largestRec {
    
    inPut obj = new inPut();
    int arr [] = obj.scan();
    int i = 0;

    int area;
    
    public int calc () {
        Stack <Integer> stack = new Stack <>();
        int x;
    while( i < arr.length) {
        
        if (stack.isEmpty() || arr[i] >= arr[stack.peek()] ) {
            stack.push(i);
            i++;
        } else {
        
            int j = stack.pop();
            int k = arr[j];
            if (stack.isEmpty() ) {
                x = i;

            }
            else {
                x = i - stack.peek() - 1;
            }
            
            area = Math.max(k * x * 7, area);
        }
 
    }
 
    while (!stack.isEmpty()) {
        int j = stack.pop();
        int k = arr[j];
        if (stack.isEmpty() ) {
            x = i;

        }
        else {
            x = i- stack.peek() - 1;
        }
        
        area = Math.max(k * x * 7, area);
    }
 
    return area;
    }  
}  

    

