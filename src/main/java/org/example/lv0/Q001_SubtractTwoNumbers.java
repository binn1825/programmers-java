package org.example.lv0;

/**
 * 프로그래머스 lv.0
 * 두 수의 차 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120803
 */
public class Q001_SubtractTwoNumbers {
    public static void main(String[] args) {
        Q001_SubtractTwoNumbers q001SubtractTwoNumbers = new Q001_SubtractTwoNumbers();
        int firstValue = q001SubtractTwoNumbers.solution(500000, 3);
        int secondValue = q001SubtractTwoNumbers.solution(100, 2);

        System.out.println(firstValue);
        System.out.println(secondValue);
    }

    private int solution(int num1, int num2) {
        if (checkRangeReverse(num1) || checkRangeReverse(num2)) {
            return -1;
        }
        return num1 - num2;
    }

    private boolean checkRangeReverse(int num) {
        return (num < -50000 || num > 50000);
    }
}
