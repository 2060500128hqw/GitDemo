package com.hqw.git;

public class GitText {
    public static void main(String[] args) {
        System.out.println("hello git");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("hello git1");
        System.out.println("master commit");
        System.out.println("hello git2");
        System.out.println("push github");
        System.out.println("pull github");
    }
}
