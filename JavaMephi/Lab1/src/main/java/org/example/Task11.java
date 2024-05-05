package org.example;


import java.util.Scanner;

public class Task11 {
    public static void run() {
        System.out.println("Task11");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < 32 || ch > 127) {
                System.out.println((int) ch + ": " + ch);
            }
        }

        System.out.println();
    }
}
//𝒜𝓈𝒸𝒾𝒾 𝒽𝑒𝓁𝓅 𝓂𝑒 𝓌𝒾𝓉𝒽 𝓉𝒽𝑒 𝓈𝓉𝓇𝒾𝓃𝑔
//🌟✨🌈💫🎉🎊🎈🎆🎇🎶🎵🎭🎰🎲🎳
//你好，世界！🌏
//Владимир Путин молодец!