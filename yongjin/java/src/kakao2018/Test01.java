package kakao2018;

import java.util.*;

public class Test01 {
    /***
     * 카카오 2018 오픈채팅방 (https://www.welcomekakao.com/learn/courses/30/lessons/42888)
     */
    public static void main(String[] args){
        String[] record = {"Enter uid1234 Muzi",
                            "Enter uid4567 Prodo",
                            "Leave uid1234",
                            "Enter uid1234 Prodo",
                            "Change uid4567 Ryan"};
        solution(record);
    }

    public static String[] solution(String[] record) {
        Map<String, String> uidToName = getUidToNameMap(record);
        String[] answer = getAnswerMessage(uidToName, record);

        Set<String> keys = uidToName.keySet();
        for(String key : keys){
            System.out.println("uid = " + key + ", name = " + uidToName.get(key));
        }

        for(String message : answer){
            System.out.println(message);
        }

        return answer;
    }

    private static Map<String, String> getUidToNameMap(String[] record) {
        HashMap<String, String> uidToName = new HashMap<>();
        for (String row : record) {
            String[] message = row.split(" ");
            if("Leave".equals(message[0])){
                continue;
            }

            uidToName.put(message[1], message[2]);
        }

        return uidToName;
    }

    private static String[] getAnswerMessage(Map<String, String> uidOfName, String[] record) {
        List<String> messageList = new ArrayList<>();
        for (String row : record) {
            String[] message = row.split(" ");
            if("Change".equals(message[0])){
                continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(uidOfName.get(message[1]));
            sb.append("님이");
            switch (message[0]) {
                case "Enter" :
                    sb.append(" 들어왔습니다.");
                    break;
                case "Leave" :
                    sb.append(" 나갔습니다.");
                    break;
            }

            messageList.add(sb.toString());
        }

        return messageList.toArray(new String[messageList.size()]);
    }
}
