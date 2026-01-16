package org.example.lv0;

/**
 * 프로그래머스 lv.0
 * 옹알이 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */
public class Solution120956 {
    public static void main(String[] args) {
        Solution120956 solution = new Solution120956();
        int firstResult = solution.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        int secondResult = solution.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});

        System.out.println("===== Result =====");
        System.out.println(firstResult);
        System.out.println(secondResult);
    }

    public int solution(String[] babbling) {
        int answer = 0;
        String[] okWords = { "aya", "ye", "woo", "ma"};

        for (String inputWord : babbling) {
            for (String okWord : okWords) {
                if (inputWord.contains(okWord)) {
                    inputWord = inputWord.replace(okWord, " ");
                }
            }

            if (inputWord.replaceAll(" ", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
