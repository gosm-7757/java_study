package day_1;

public class intType {
    public static void main(String[] args) {
        // 정수 자료형 크기
        byte    _1b = 1;    // 1바이트의 크기를 표현
        short   _2b = 2 ;   // 2바이트의 크기를 표현
        int       _4b = 4;    // 4바이트의 크기를 표현
        long    _8b = 8;    // 8바이트의 크기를 표현  

        // 자료형을 넘어서는 수를 담을 수 없음
        byte test = 127;
        //byte test2 = 128;
        byte test3 = -128;
        //byte test4 = -129;

        //  큰 자료형에 작은 자료형의 값을 넣을 수 있음
        //  💡 묵시적(암시적) 형변환
        // 작은 자료형을 큰 자료형에 넣으면 자동으로 바뀜
        // _2b_short = _1b_byte;
        // _4b_int = _1b_byte; 
        // _4b_int = _2b_short;
        // _8b_long = _1b_byte; 
        // _8b_long = _2b_short; 
        // _8b_long = _4b_int;

        // //  ⚠️ 작은 자료형에 큰 자료형의 값을 '그냥' 넣을 수 없음
        // //  들어있는 값의 크기와 무관
        // _1b_byte = _2b_short; 
        // _1b_byte = _4b_int;
        // _1b_byte = _8b_long;
        // _2b_short = _4b_int; 
        // _2b_short = _8b_long;
        // _4b_int = _8b_long;

        //  ⭐ int의 범위를 벗어나는 수에는 리터럴에도 명시 필요
        //  끝에 l 또는 L을 붙여 볼 것
        long _8b_long1 = 123456789123456789L;

        //  💡 가독성을 위해 아래와 같이 표현 가능 (자바7부터)
        int _4b_int2 = 123_456_789;
        long _8b_long2 = 123_456_789_123_456_789L;


        // 형변환 CASTING
        // 큰 값을 가지는 자료형을 작은 값을 가지는 자료형에 넣을 때
        long num = 12L;
        int num2 = (int)num;

        //  ⚠️ 강제로 범주 외의 값을 넣을 경우 값 손실
        int intnum = 12345;
        byte bnum = (byte)intnum;
        System.out.println(bnum); // 12345 % 128의 값을 출력한다. 
        
        // A가 B를 반환 (return) : 코드상 A를 B로 ‘바꿔 쓸 수 있다’는 의미
        
        // 같은 자료형끼리 연산이 가능하다.
        // 단, byte와 short의 연산은 int로 결과가 나온다.
        // 컴퓨터가 int 크기의 자료형을 가장 다루기 쉽기 때문이다.
        // 다른 언어와의 api 통신을 위해서도 권장된다. 
        // 연산 속도가 다른 자료형 보다 빠르다. 
        int a = 2; int b = 3;
        int c = a + b;
        short e = (short) (a + b); 

        byte ba = 1; byte bb = 2;
        int cc = ba + bb;

        //  ⚠️ 정수 자료형의 계산은 소수점 아래를 '버림'
        byte int1 = 5/2; // 2
        int int2 = 10;
        int int3 = 3;
        int int4 = int2 / int3; // 3


        // 복합 대입 연산자
        // a += 1    ==    a = a + 1
        int aa = 1;
        int ab = 2;
        int ac = aa = ab;
        System.out.println(ac);

        String s1 = "ABC";
        String s2 = "가나다";
        String s3 = (s1 = s2);
        System.out.println(s3);


        // 💡 자료형의 범위를 넘어가도록 숫자를 더하거나 뺄 경우
        // 초기화가 아닌 경우에는 컴파일러가 거르지 않는다. 
        // 오류가 발생하지 않으므로 주의할 것
        byte x = 127;
        x += 1;

        byte y = -128;
        y -= 1;

        // 한 줄 코드가 끝나고 증가
        // i++
        // 한 줄 코드를 실행하기 전에 증가
        // ++i

        int xx = 1;
        
        //  메서드 안으로도 '반환'되어 사용되는 것
        System.out.println(xx++); // 1
        System.out.println(++xx); // 3
        System.out.println(xx); // 3

        //  ⚠️ 리터럴에는 사용 불가
        // int int5 = 3++;
        // int int6 = --3;
    }
}
