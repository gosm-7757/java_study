package chapter_1;

public class stringMethod2 {
    public static void main(String[] args) {
        // 문자열 이어 붙이기
        //  💡 concat : 문자열을 뒤로 이어붙임
        String str_a1 = "슉-";
        String str_a2 = "슈슉-";
        String str_a3 = "슈슈슉-";

        String str_a4 = str_a1 + str_a2 + str_a3;

        // concat으로도 붙일 수 있음
        String str_a5 = str_a1.concat(str_a2);  // 슉-슈슉-

        //  ⭐️ 메서드 체이닝 (더하고 더하고 더하고 .....)
        String str_a6 = str_a1
                .concat(str_a2)
                .concat(str_a3)
                .concat(str_a4)
                .concat(str_a5);





        //  ⭐️ + 연산자와의 차이

        String str_b1 = "ABC";

        //  1. concat에는 문자열만 이어붙일 수 있음
        String str_b2 = str_b1 + true + 1 + 2.34 + '가';
        String str_b3 = str_b1 // concat을 문자열만 받을 수 있다. 
                 .concat(String.valueOf(true));  // 자료형을 변경하면 가능
                //  .concat(1)
                //  .concat(2.34)
                //  .concat('가')
                ;

        //  2. concat은 필요시에만 새 인스턴스 생성 (큰 의미 없음)
        String str_b4 = str_b1 + "";
        String str_b5 = str_b1.concat("");

        int str_b1Hash = System.identityHashCode(str_b1);  // 원본
        int str_b4Hash = System.identityHashCode(str_b4);  // 원본과 다른 메모리 주소
        int str_b5Hash = System.identityHashCode(str_b5);  // 원본과 같은 메모리 주소 


        //  3. null이 포함될 경우

        String str_c1 = null;

        //  + 연산자는 null과 이어붙이기 가능
        String str_c3 = str_c1 + null + "ABC";

        //  ⚠️ concat은 NullPointerException 발생 (무조건 문자열이며 null이 아니여야 한다. )
        //String str_c4 = str_c1.concat("ABC");
        //String str_c5 = "ABC".concat(str_c1);


        //  4. ⭐️ 다중 연산시 생성되는 문자열 인스턴스의 수가 다름(중요!)

        String str_d1 = "a" + "b" + "c" + "d"; // abcd

        // + 연산은 내부적으로 아래와 같이 최적화됨 (이후 배움)
        String str_d2 = new StringBuilder("a")  //abcd
                .append("b")
                .append("c")
                .append("d")
                .toString(); // "abcd"가 생성됨
        // "a", "b", "c", "d", "abcd"가 생성되어 메모리 차지 (기억했다가 최종 결과만 저장, 메모리 효율적)

        //  concat은 매 번 문자열을 반환하므로
        String str_d3 = "a"                                 // abcd
                .concat("b") // "ab"가 생성됨
                .concat("c") // "abc"가 생성됨
                .concat("d"); // "abcd"가 생성됨
        // "a", "b", "c", "d", "ab", "abc", "abcd"가 생성되어 메모리 차지 (낭비 발생)


        str_a1 = "덜컹";

        // 💡 repeat : 문자열을 주어진 정수만큼 반복
        str_a2 = str_a1.repeat(2); // 2번 반복 "덜컹덜컹"
        str_a3 = str_a1                             // "덜컹 덜컹 덜컹"
                .concat(" ")
                .repeat(3)
                .trim();


        // 문자열 잘라내기 
        str_b1 = "대한민국 다 job 구하라 그래";

        //  💡 substring : ~번째 문자부터 (~번째 문자까지) 잘라서 반환
        str_b2 = str_b1.substring(7);
        str_b3 = str_b1.substring(7, 10);  // job
        str_b4 = str_b1.substring(11, 14); // 구하라 (마지막 인덱스 전까지)

        String piece1 = "다 ";
        String piece2 = "구하라";
        str_b5 = str_b1.substring(  // 다 job 구하라
                str_b1.indexOf(piece1),  // 5
                str_b1.indexOf(piece2) + piece2.length()  // 11 + 3 = 14 
        );


        // 치환 replace()
        //  💡 replace : 주어진 앞의 문자(열)을 뒤의 문자(열)로 치환
        str_c1 = "점심에 보쌈집에 가서 수육을 먹었다.";
        String str_c2 = str_c1.replace("보쌈", "중국");

        //  여럿 포함시 모두 치환
        str_c3 = "밥 좀 먹자, 응? 야, 밥 좀 먹자고 밥 밥 밥";
        String str_c4 = str_c3.replace('밥', '빵');

        // ⭐️ 원본은 바뀌지 않는 점 확인

        //  메서드 체이닝
        str_d1 = "하여튼 호의가 반복되면 권리인 줄 알아";
        str_d2 = str_d1
                .replace("하여튼", "아무튼")
                .replace("호의", "호이".repeat(2))
                .replace("권리", "아기공룡 둘리");

        String str_e1 = "02=123.4567_8900";

        //  💡 replaceAll / replaceFirst : ⭐️ 정규표현식 사용 가능
        //  전부 치환 / 첫 번째 일치부분만 치환
        String str_e2 = str_e1 // [] 안에 있는 것들 중 하나라도 포함되면 바꿔라 
                .replaceAll("[=._]", "-")  // 02-123-4567-8900
                .replaceFirst("[-@#]", ")"); // 02)123-4567-8900



        // 배열 반환
        String str1 = "가나다라마";
        String str2 = "010-1234-5678";
        String str3 = "하나 둘 셋 넷 다섯";

        //  💡 toCharArray : 문자열을 분할하여 문자열의 배열로 반환
        char[] chAry1 = str1.toCharArray(); // ['가', '나', '다', '라', '마']
        char[] chAry2 = str3
                .replace(" ", "") // 하나둘셋넷다섯
                .toCharArray();                                 // ['하', '나', '둘', '셋', '넷', '다', '섯']

        //  💡 split : 주어진 기준으로 (~개까지) 분할하여 문자열 배열로 반환
        String[] strAry1 = str1.split(""); //  ['가', '나', '다', '라', '마']
        String[] strAry2 = str2.split("-");     // ['010', '1234', '5678']
        String[] strAry3 = str3.split(" ");     // ['하나', '둘', '셋', '넷', '다섯']
        String[] strAry4 = str3.split(" ", 3); // ['하나', '둘', '셋 넷 다섯'] (자르는 개수를 제한)
        
    }
}
