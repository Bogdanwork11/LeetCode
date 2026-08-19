package com.example.commontopreffix;

public class preffix {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i<strs[0].length(); i++){
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if(i>=strs[i].length()||strs[j].charAt(i) != currentChar){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
