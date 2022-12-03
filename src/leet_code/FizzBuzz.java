package leet_code;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }

    private static List<String> fizzBuzz(int n) {
        List<String> arrayList = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            if (i % 3 ==0 && i % 5 == 0) arrayList.add("FizzBuzz");

            else if (i % 3 == 0) arrayList.add("Fizz");

            else if (i % 5 == 0) arrayList.add("Buzz");

            else arrayList.add(String.valueOf(i));
        }
        return arrayList;
    }

}
