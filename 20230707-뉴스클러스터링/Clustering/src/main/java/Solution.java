import javax.security.auth.callback.CallbackHandler;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int solution(String string1, String string2) {
        // 모두 대문자로
        string1 = string1.toUpperCase();
        string2 = string2.toUpperCase();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        // string1 다중 집합 만들기
        for (int i = 0; i < string1.length() - 1; i += 1) {
            char a = string1.charAt(i);
            char b = string1.charAt(i + 1);

            // 영문자만 가진 경우만 리스트에 추가
            if (Character.isLetter(a) && Character.isLetter(b)) {
                String string = Character.toString(a) + Character.toString(b);

                list1.add(string);
            }
        }

        // string2 다중 집합 만들기
        for (int i = 0; i < string2.length() - 1; i += 1) {
            char a = string2.charAt(i);
            char b = string2.charAt(i + 1);

            // 영문자만 가진 경우만 리스트에 추가
            if (Character.isLetter(a) && Character.isLetter(b)) {
                list2.add(Character.toString(a) + Character.toString(b));
            }
        }

        // 중복 원소 처리를 위해 두 집합 정렬
        Collections.sort(list1);
        Collections.sort(list2);

        // 교집합 구하기
        for (String string : list1) {
            // 집합1에 집합2가 포함된다면 삭제 후, 교집합에 추가
            if (list2.remove(string)) {
                intersection.add(string);
            }
            union.add(string);
        }

        // 합집합 구하기
        for (String string : list2) {
            // 교집합에서 제외된 것 뺀 나머지 합집합에 추가
            union.add(string);
        }

        // 자카드 유사도 구하기
        double a = intersection.size();
        double b = union.size();

        double jakard = 0;

        jakard = (union.size() == 0) ? 1 : (double) intersection.size() / (double) union.size();

        return (int) (jakard * 65536);
    }
}

/*
1. 이해
- 자카드 유사도 : 집합 간의 유사도를 검사하는 여러 방법 중의 하나
- 두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.
- 예를 들어, 집합 A = {1, 2, 3}, 집합 B = {2, 3, 4} 라고 할 때,
  교집합 A ∩ B = {2, 3}, 합집합 A ∪ B = {1, 2, 3, 4} 이므로
  집합 A, B 사이의 자카드 유사도 J(A, B) = 2/4 = 0.5가 된다.
- 집합 A와 집합 B가 모두 공집합일 경우에는 나눗셈이 정의되지 않으니 따로 J(A, B) = 1로 정의한다.
- 자카드 유사도는 원소의 중복을 허용하는 다중집합에 대해서 확장할 수 있다.
- 다중집합 A는 원소 "1"을 3개 가지고 있고, 다중집합 B는 원소 "1"을 5개 가지고 있다고 하자.
  이 다중집합의 교집합 A ∩ B 는 원소 "1"을 min(3, 5)인 3개, 합집합 A ∪ B 는 원소 "1"을 max(3,5)인 5개 가지게 된다.
- 다중집합 A = {1, 1, 2, 2, 3}, 다중집합 B = {1, 2, 2, 4, 5}라고 하면,
  교집합 A ∩ B = {1, 2, 2}, 합집합 A ∪ B = {1, 1, 2, 2, 3, 4, 5}가 되므로, 자카드 유사도 J(A, B) = 3/7, 약 0.42가 된다.
- 이를 이용하여 문자열 사이의 유사도를 계산하는데 이용할 수 있다.
   문자열 "FRANCE"와 "FRENCH"가 주어졌을 때, 이를 두 글자씩 끊어서 다중집합을 만들 수 있다.
   각각 {FR, RA, AN, NC, CE}, {FR, RE, EN, NC, CH}가 되며,
   교집합은 {FR, NC}, 합집합은 {FR, RA, AN, NC, CE, RE, EN, CH}가 되므로,
   두 문자열 사이의 자카드 유사도 J("FRANCE", "FRENCH") = 2/8 = 0.25가 된다.
2. 계획
3. 실행
 */
