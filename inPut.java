package v1.v1.main;
//import java.util.Arrays;

import java.util.Scanner;

public class inPut {
    public int num;  
    int [] avg_numbers;
    public int [] scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input: ");
        num = sc.nextInt();
        avg_numbers = new int [num];
        for (int i = 0; i < num ; i++) {
            avg_numbers[i] = sc.nextInt();
        }
        
        sc.close();
        return avg_numbers;

    }
}
