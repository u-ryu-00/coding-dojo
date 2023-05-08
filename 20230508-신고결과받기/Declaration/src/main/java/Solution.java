import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 1. 중복 제거
        HashSet<String> reportSet = new HashSet<String>();
        for (String reportItem : report) reportSet.add(reportItem);

        // 2. notifyListHash 만들기
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for (String reportItem : reportSet) {
            int blankIdx = reportItem.indexOf(" ");
            String reporter = reportItem.substring(0, blankIdx);
            String reportee = reportItem.substring(blankIdx + 1);

            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            if (reporterList == null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);

        }

        // 3. notifyListHash를 기반으로 reporterHash 만들기
        HashMap<String, Integer> reporterHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values())
            if (notifyList.size() >= k)
                for (String reporter : notifyList)
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);

        // 4. reporterHash를 기반으로 answer 배열을 채운다.
        for (int i = 0; i < id_list.length; i += 1) {
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        }
        return answer;
    }
}

/*
1. 이해
- 각 유저는 한 번에 한 명의 유저를 신고할 수 있다.
    - 신고 횟수에 제한은 없다. 서로 다른 유저를 계속해서 신고할 수 있다.
    - 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리된다.
- k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
    - 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송한다.
-> 이용자의 ID가 담긴 문자열 배열 : id_list
-> 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 : report
-> 정지 기준이 되는 신고 횟수 : k
2. 계획
1) 중복 제거
- HashSet을 사용하여 report의 중복된 정보를 제거한다.
2) 신고자 목록
- Hash로 각 사용자를 신고한 사람들의 목록을 관리한다.
3) 신고한 사용자
- 정지된 사용자를 신고한 사용자에게 알려주고, 이 정보를 Hash로 정리
3. 실행
 */
