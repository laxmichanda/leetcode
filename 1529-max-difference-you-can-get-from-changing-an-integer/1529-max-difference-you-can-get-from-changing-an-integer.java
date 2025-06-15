

// public class Solution {
//     public int maxDiff(int num) {
//         String str=String.valueOf(num);
//         Set<Character> digits=new HashSet<>();
//         for(char ch:str.toCharArray())
//         {
//             digits.add(ch);
//         }

//         int max=num;
//         int min=num;
//         for(char digit:digits)
//         {
//             for (char temp='0';temp<='9';temp++)
//             {
//                 if(str.charAt(0)==digit && temp==0)continue;
            
//              String newNumStr = str.replace(digit, temp);
//                 int newNum = Integer.parseInt(newNumStr);
//                 max = Math.max(max, newNum);
//                 min = Math.min(min, newNum);
//             }
//         }
//         return max - min;
        
//     }
// }

import java.util.*;

public class Solution {
    public int maxDiff(int num) {
        String numStr = String.valueOf(num);
        Set<Character> uniqueDigits = new HashSet<>();
        for (char ch : numStr.toCharArray()) {
            uniqueDigits.add(ch);
        }

        int maxVal = num, minVal = num;

        for (char digit : uniqueDigits) {
            for (char newDigit = '0'; newDigit <= '9'; newDigit++) {
                if (numStr.charAt(0) == digit && newDigit == '0') continue;
                String newNumStr = numStr.replace(digit, newDigit);
                int newNum = Integer.parseInt(newNumStr);
                maxVal = Math.max(maxVal, newNum);
                minVal = Math.min(minVal, newNum);
            }
        }
        return maxVal - minVal;
    }
}