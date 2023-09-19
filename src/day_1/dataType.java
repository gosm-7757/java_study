package day_1;

public class dataType {
    public static void main(String[] args) {
        //  참/거짓 - boolean
        System.out.println(true);
        System.out.println(false);

        //  숫자
        System.out.println(123); // int
        System.out.println(3.14); // double

        //  문자 - char
        System.out.println('A');
        System.out.println('가');
        System.out.println('⭐');

        //  문자열 - String
        System.out.println("동네형보다 많은 자료형");

        double pi = 3.14;
        pi = 3.14159265358979; // 💡 값이 바뀔 수 있으므로 '변수'라 부름
    
        int age; // 💡 변수 선언: 주머니 만들기

        //  ⚠️ 아직 값이 없으므로 사용할 수는 없음
        //System.out.println(age); 
        // 변수에 값을 넣어주는 것을 초기화라고 한다.
        age = 20; 

        // 한 번에 여러개의 변수 선언 및 초기화
        char ch1, ch2, ch3; // 변수명만 선언 (빈 값)
        char ch4 = 'a', ch5 = 's', ch6 = 'd';

        // final 연산자를 사용하면 값을 변경할 수 없게 된다.
        final int AGE = 24;
    }
}
