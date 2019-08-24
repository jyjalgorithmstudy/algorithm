package kakao2018;

import java.util.*;

public class Test02 {
    /***
     * 카카오 2018 실패율 (https://www.welcomekakao.com/learn/courses/30/lessons/42889)
     */
    public static void main(String[] args){
        int [] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int [] stages2 = {4, 4, 4, 4 ,4};
        int [] stages3 = {2, 2, 1, 5, 4, 4, 4, 2, 2};
        int[] answers = solution(5, stages1);
//        solution(4, stages2);
//        int[] answers = solution(5, stages3);
        for(int value : answers) {
            System.out.println("value = " + value);
        }
    }

    public static int[] solution(int N, int[] stages) {
        Map<Integer, Integer> stageToCount = getStageToCount(stages);
        List<Stage> failRates = getStage(N, stages, stageToCount);
        Collections.sort(failRates);
        int[] answer = new int[failRates.size()];
        int i = 0;
        for (Stage failRate : failRates) {
            answer[i] = failRate.stage;
            i++;
        }

        return answer;
    }

    private static List<Stage> getStage(int N, int[] stages, Map<Integer, Integer> stageToCount) {
        int stagesLength = stages.length;
        List<Stage> list = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            int count = stageToCount.getOrDefault(i, 0);
            list.add(new Stage(i, (count > 0)  ? (double) count / stagesLength : 0.0));
            stagesLength = stagesLength - count;
        }

        return list;
    }

    private static Map<Integer, Integer> getStageToCount(int[] stages) {
        Map<Integer, Integer> stageToCount = new HashMap<>();
        for (int stage : stages){
            int count = stageToCount.getOrDefault(stage, 0);
            stageToCount.put(stage, count + 1);
        }

        return stageToCount;
    }

    public static class Stage implements Comparable<Stage> {
        int stage;
        double failRate;

        Stage(int stage, double failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }

        @Override
        public int compareTo(Stage o) {
            if (this.failRate > o.failRate) {
                return -1;
            }else if (this.failRate < o.failRate) {
                return 1;
            }else {
                return 0;
            }
        }
    }
}
