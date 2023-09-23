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


        // 무한 루프
        //  종료조건이 없는 for 루프
        /* for (;;) {
            System.out.println("영원히");
        } */
        // System.out.println("닿지 않아"); // ⚠️ 실행되지 않음


        //  종료조건을 만족시키지 못하는 무한루프
        /* for (int i = 0; i < 10; i++) {
            System.out.println("그래도");
            i--; // 이거 때문에 무한 반복
        }
        //! 이런 경우에는 밑에 빨간 줄이 그이지는 않는다. (컴파일 에러로 못 잡아냄)
        System.out.println("닿지 않아"); // ⚠️ 실행되지 않음 */



        //  4의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf4 = new int[count];

        for (int i = 1, c = 0; c < count; i++) {
            if (i % 4 == 0) {
                multiOf4[c++] = i;
            }
        }
        //  💡 배열 순환 (기본적인 방법) 꺼내기
        for (int i = 0; i < multiOf4.length; i++) {
            System.out.println(multiOf4[i]);
        }


        System.out.println("\n- - - - -\n");

        //  💡 for each 문법 - 배열이나 이후 배울 콜랙션 등에 사용
        for (int num : multiOf4) { // num 안에 multiOf4의 요소 하나씩 대입
            System.out.println(num);
        }

        System.out.println("\n- - - - -\n");

        int sumOfArray = 0;
        for (int num : multiOf4) {
            sumOfArray += num;
        }

        System.out.println("\n- - - - -\n");

        for (String s : "호롤롤로".split("")) {
            System.out.println(s);
        }



        //  구구단
        // for 문 안에서 선언한 변수는 그 안에서만 사용할 수 있다.
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %2d%n", i, j, i * j);
            }
        }

        String[][] quotesInLangs = {
                {
                    "I am vengeance.",
                    "I am night.",
                    "I am Batman.",
                },
                {
                    "나는 복수를 하지.",
                    "나는 밤이지.",
                    "나는 배트맨이지.",
                },
        };

        String result = "";
        for (String[] quotes : quotesInLangs) {  // 첫번째 인덱스 요소는 배열이니까 [] 추가
            for (String quote : quotes) {
                result += quote + " "; 
            }
            result = result.trim().concat("\n");
        }

        System.out.println(result);




        for (int i = 0; i < 100; i++) {

            //  💡 continue : 한 루프만 건너뜀
            if (i % 3 == 0) continue;  // 한턴만 아래 코드 실행 안함

            //  💡 break : 블록 전체를 종료
            if (i == 10) break;  // 그냥 반복문을 나감

            System.out.println(i);
        }



        System.out.println("\n- - - - -\n");

        String str = "호";

				//  ⭐️ 무한루프 탈출에 사용 가능
        for (;;) { // 다음 강의 while을 더 많이 사용
            str += "롤";
            System.out.println(str);
            if (str.length() == 100) break;
        }

        str += "로";
        System.out.println(str);




        System.out.println("\n- - - - -\n");

        //  💡 label : 중첩 루프에서 어느쪽을 continue, break 할 지 구분
        // 라벨은 내 마음대로 지정할 수 있다. 
        outer:
        for (int i = 0; i < 10; i++) {

            inner:
            for (int j = 0; j < 10; j++) {
                if (j % 2 == 0) continue inner;
                if (i * j >= 30) continue outer;

                if (j > 8) break inner;
                if (i - j > 7) break outer;

                System.out.printf("i: %d, j: %d%n", i, j);
            }
        }
    }
}
