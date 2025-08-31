package com.thealgorithms.matrixexponentiation;

public class FibonacciStairs {
    /**
     * 피보나치수를 이용한 경우의 수 계산방법 : 반복문을 이용한 방법
     *
     * @param n
     * @return
     */
    public static int calcLoopFibonacci(int n) {
        int answer = 0;

        // [CASE1] 값이 1인 경우 해당 값을 반환합니다.
        if (n <= 1) return n;

        // [STEP2] 계단을 오르는 방법에는 한 계단과 두 계단 방법으로 첫번째와 두번째 값을 지정합니다.
        int prevPrev = 1;
        int prev = 2;

        // [STEP3] 3번째 요소부터 배열을 순회하면서 이전 계단을 오르는 방법의 수를 더하여 계산을 합니다.
        for (int i = 3; i <= n; i++) {
            answer = prev + prevPrev;
            prevPrev = prev;
            prev = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("계단을 오르는 방식 : " + calcLoopFibonacci(n)); // 계단을 오르는 방식 : 5
    }
}
