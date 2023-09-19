package day_1;

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


        // 잘라오기 
        str_b1 = "대한민국 다 job 구하라 그래";

        //  💡 substring : ~번째 문자부터 (~번째 문자까지) 잘라서 반환
        str_b2 = str_b1.substring(7);
        str_b3 = str_b1.substring(7, 10);  // job
        str_b4 = str_b1.substring(11, 14); // 구하라 (마지막 인덱스 전까지)

        String piece1 = "다 ";
        String piece2 = "구하라";
        str_b5 = str_b1.substring(
                str_b1.indexOf(piece1),
                str_b1.indexOf(piece2) + piece2.length()
        );
    }
}
