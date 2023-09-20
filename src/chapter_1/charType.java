package chapter_1;

public class charType {
    public static void main(String[] args) {
        // 그냥 정수처럼 사용이 가능하다. 
        // 유니코드를 사용한다. 
        //  2바이트 사용 - short와 동일
        //  각 문자는 상응하는 정수를 가짐
        //  단따옴표를 사용하여 1개의 문자 표현 - 빈 문자 불가
        char ch1 = 'A';         // 65
        char ch2 = 'B';         // 66
        char ch3 = 'a';         // 97
        char ch4 = 'a' + 1;   // 98 b  
        char ch5 = '가';        // 44032 가
        char ch6 = '가' + 1; // 44033 각
        char ch7 = '가' + 2; // 44034 갂
        char ch8 = '가' + 3; // 44035 갃
        char ch9 = '나';        // 45208 나

        int ch1Int = (int) ch1;  // 정수로 저장 65
        int ch9Int = (int) ch9;  // 정수로 저장 45208

        // 문자 리터럴과 숫자, 유니코드로 표현 가능
        char ch10 = 'A';
        char ch11 = 65; // A 반환
        char ch12 = '\u0041'; // 유니코드 표기 방법



        char ch_a1 = 'A';
        int int_a1 = (int) ch_a1; // 강제 형변환 (안해도 가능)

        //  정수값을 얻는 다른 방법들 - 정수값과 연산하기
        int int_a2 = ch_a1 + 0; // 연산을 하면서 정수로 바뀜
        int int_a3 = ch_a1 - 0;

        //  💡 리터럴에 더할 때와 변수에 더할 때 반환 자료형이 다름
        char ch_a2 = 'A' + 1;
        // 변수에 연산을 하는 순간 자료형이 바뀌어 버림
        //char ch_a3 = ch_a1 + 1; // ⚠️ 불가, 리터럴일 경우에만 가능하다.
        int int_a4 = ch_a1 + 1;

        //  💡 int 1과 char '1'은 다름! - 문자로서의 '1'
        //  - 해당 문자의 정수값 확인
        char ch_b1 = '1';       // 1 49
        char ch_b2 = '2';       // 2 50

        //  ⚠️ 숫자 문자에 사칙연산 - 문자 번호 기준 결과 반환
        char ch_b3 = '1' + '2';  // c 99
        int int_b4 = ch_b1 + ch_b2; //  99

        //  💡 아래의 기능으로 문자가 의미하는 정수로 변환
        int int_d1 = Character.getNumericValue('1');
        int int_d2 = Character.getNumericValue('2');
        // 위와 같은 방법
        int int_d3 = '1' - '0';
        int int_d4 = '5' - '0';
        

        //  ⚠️ 빈 문자는 사용 불가, 공백(space)는 가능
        //  - 이후 배울 문자열(String)과의 차이
        //char empty = ''; // 최소한 스페이스바는 넣어줄 것 (오류발생)
        String emptyStr = ""; // 문자열은 가능

        char space = ' ';


        //  같은 문자열인지 여부 반환
        boolean bool1 = 'A' == 'A';
        boolean bool2 = 'A' == '가';

        //  숫자와 비교할 시 해당 정수값 기준으로
        boolean bool3 = 'A' == 65;
        boolean bool4 = 'A' > 64.0;
        boolean bool5 = 'A' > 66f;

        //  사전순 상 먼저 오는 쪽이 작음
        boolean bool6 = 'A' < 'B';
        boolean bool7 = '가' > '나';
    }
}
