package chapter_1;

public class array {
    public static void main(String[] args) {
        // 특정 타입의 데이터를 묶어서 다루기 위해 사용
        // 지정된 자료형과 개수만큼 메모리 공간을 나란히 확보 (갯개수 변경 불가)

        //  💡 사용할 자료형 뒤에 []를 붙여 선언
        char[] 윷놀이 = {'도', '개', '걸', '윷', '모'};

        //  💡 length : 배열의 길이 반환
        int length = 윷놀이.length;

        //  💡 [] 안에 인덱스 정수를 넣어 접근
        //  ⭐ 0부터 시작
        char first = 윷놀이[0];
        char last = 윷놀이[-1];

        //  💡 초기화하지 않고 일단 선언하기 (메모리 공간만 만들어두기)
        //  ⭐ 어떤 값으로 초기화되는지 확인
        boolean[] boolary = new boolean[3];  // false false false
        int[] intAry = new int[3];                      // 0 0 0
        double[] doubleary = new double[3]; // 0.0 0.0 0.0
        char[] chrAry = new char[3];    // nul nul nul (크기를 가짐)
        String[] strary = new String[3];  // null null null (주소를 가짐)

        //  아스키 코드의 0번 글자. 문자열의 끝을 표시하는데 사용
        char NUL = chrAry[0];

        //  다음과 같이 원하는 위치의 값 변경
        intAry[0] = 123;
        intAry[1] = 456;
        intAry[2] = 789;







        //  초기화 블록을 사용한 선언 동시 초기화
        //  두 가지 방법 사용 가능
        char[] dirAry1 = {'동', '서', '남', '북'};
        char[] dirAry2 = new char [] {'동', '서', '남', '북'};

        char[] dirAry3;

        //  선언만 먼저 한 상태에서는 두 번째 방법만 가능
        //irAry3 = {'동', '서', '남', '북'}; // ⚠️ 불가
        dirAry3 = new char[] {'동', '서', '남', '북'};


        // 3자리만 예약했는데 5명이 들어감
        // int [] intAry = {1, 2, 3, 4, 5}; 오류

        //  ⚠️ 런다임 에러: ArrayIndexOutOfBoundsException
        int outOfAry = intAry[intAry.length]; // bound 에러, index 에러






        //  이중 배열
        boolean[][] dblBoolAry = new boolean[3][3];

        int[][] dblIntAry = new int[][] {
                //  ⭐️ 요소 배열의 크기가 다를 수 있음
                {1, 2, 3}, // 주소값이 저장됨 (맨 마지막이 실제 크기를 가지는 값)
                {4, 5},
                {6, 7, 8, 9},
        };

        //  삼중 배열
        char[][][] trpChrAry = {
                {{'자', '축'}, {'인', '묘'}},
                {{'진', '사'}, {'오', '미'}},
                {{'신', '유'}, {'술', '해'}},
        };


        int int1 = dblIntAry[0][1];
        int int2 = dblIntAry[2][3];
        intAry = dblIntAry[1];  // 배열을 뱉음

        char[][] dblChrAry = trpChrAry[0];
        chrAry = dblChrAry[0];
        char chr1 = chrAry[1];
        char chr2 = trpChrAry[2][0][1];




        //  🧪 디버깅해서 결과를 볼 것
        //?  ⭐ 원시 자료형은 값 자체를 복사 - 별개의 값이 됨

        boolean bool1 = true;
        boolean bool2 = false;
        bool2 = bool1;
        bool1 = false;

        int int12 = 1;
        int int22 = 2;
        int22 = int12;      // 1
        int22 = 3;            // 3  

        char ch1 = 'A';
        char ch2 = 'B';
        ch2 = ch1;
        ch1 = '가';



        //?  ⭐ 참조 자료형은 값 주머니의 주소를 복사
        //  두 변수가 같은 주머니를 가리키게 됨

        boolean[] boolAry1 = { true, true, true };
        boolean[] boolAry2 = { false, false, false };
        boolAry2 = boolAry1; 
        boolAry1[0] = false;
        //!  둘 다 첫 번째 요소가 변경된다. (같은 주소이기 때문에)

        int[] intAry1 = { 1, 2, 3 };
        int[] intAry2 = { 4, 5 };
        intAry2 = intAry1;
        intAry2[1] = 100;

        char[] chAry1 = { 'A', 'B', 'C' };
        char[] chAry2 = { 'a', 'b', 'c', 'd', 'e' };
        chAry2 = chAry1;
        chAry1[2] = '다';





        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
        String str1 = "코인 함";
        String str2 = "관심 없음";
        str2 = str1; //

        str1 = "고점에 익절";



        //  상수 배열의 경우
        final int[] NUMBERS = {1, 2, 3, 4, 5};  // 주소는 못 바꾸지만 집안에 있는 요소들은 변경 가능

        //  ⚠️ 다른 배열을 할당하는 것은 불가
        //! NUMBERS = new int[] {2, 3, 4, 5, 6};

        //?  ⭐️ 배열의 요소를 바꾸는 것은 가능
        NUMBERS[0] = 11;


        String[] strings = {"한놈", "두시기", "석삼", "너구리"};

        //  💡 join 정적 메소드 - 문자열(정확히는 CharSequence)의 배열을 하나로 이어붙임
        //  첫 번째 인자를 각 사이에 삽입 (글 사이에 이거 넣고 합쳐줭)
        String join1 = String.join(", ", strings);
        String join2 = String.join("-", strings);
        String join3 = String.join(" 그리고 ", strings);
        String join4 = String.join("", strings);
    }
}
