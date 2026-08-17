package com.example.polindrome;

public class polindromMain {

    public boolean isPolindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        //представим 1221 121
        int b = 0;
        while (x > b) {
            b = b * 10 + x % 10;
            x = x / 10;
        }
        return b == x || b / 10 == x;
    }
}


