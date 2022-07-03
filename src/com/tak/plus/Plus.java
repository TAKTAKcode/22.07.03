package com.tak.plus;

import java.util.Scanner;

public class Plus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 : ");
        int number = sc.nextInt();


        System.out.println("10을 더한 값은 : " + (number + 10) + "입니다.");
        System.out.println("10을 뺀 값은 : " + (number - 10) + "입니다.");
    }



}
