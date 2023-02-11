package com.lab2toi;

import com.shared.SharedMethods;

public class Bai1 {
    static char ch;
    static SharedMethods sm = new SharedMethods();

    static void checkVowelOrConsonant(char ch) {
        if (!Character.isAlphabetic(ch)) {
            System.out.println(ch + " không là chữ cái");
            return;
        }
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'ă':
            case 'â':
            case 'e':
            case 'ê':
            case 'i':
            case 'o':
            case 'ô':
            case 'ơ':
            case 'u':
            case 'ư':
            case 'y':
                System.out.println(ch + " là nguyên âm");
                break;
            default:
                System.out.println(ch + " là phụ âm");
                break;
        }
    }
    public static void main(String[] args) {
        ch = sm.inputChar("chữ cái");
        checkVowelOrConsonant(ch);
    }
}
