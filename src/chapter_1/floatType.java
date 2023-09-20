package chapter_1;

public class floatType {
    public static void main(String[] args) {

        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김
        double c = a + b; // 0.30000000000000004

        boolean bool = 0.1 + 0.2 == 0.3; // false
        // 2진법을 사용하는 컴퓨터는 부동소수점을 사용하여 
        // 실수를 표현하기 때문이다. 
        // 고정 소수점 : 1비트 부호, 15비트 숫자, 16비트 소수점 아래
        // 부동 소수점 : 1비트 부호, 8비트 소수점의 칸 수
        // 16비트 소수점이 움직이고 난 후 남은 값
        // IEEE 754 라고도 한다. 

        //  float의 최대값과 최소값
        float fMin = -Float.MAX_VALUE;
        float fMax = Float.MAX_VALUE;

        //  double의 최대값과 최소값
        double dMin = -Double.MAX_VALUE;
        double dMax = Double.MAX_VALUE;

        //  최소 절대값
        float fAbsMin = Float.MIN_VALUE;
        double dAbsMin = Double.MIN_VALUE;

        // ⭐ double이 범위도 넓고, 정밀도도 높음 확인
        boolean bool1 = Float.MAX_VALUE < Double.MAX_VALUE; // true
        boolean bool2 = Float.MIN_VALUE > Double.MIN_VALUE;  // true

        //  최대 정밀도 테스트
        double dblNum = 0.123456789123456789; // 끝까지 표현
        float fltNum = 0.123456789123456789f; // 0.123456789 까지 표현
    
        //  float은 뒤에 f 또는 F를 붙여 표현
        float flt1 = 3.14f;
        double dbl1 = 3.14;

        //  ⚠️ float에는 double을 담을 수 없음
        float flt2 = (float)dbl1;
        //  반대는 가능
        double dbl2 = flt1;


        // 정수 자료형 중에 가장 큰 long은 float, double에 대입 가능
        long lng1 = 123;

        //  정수를 대입할 시 묵시적 변환
        //  💡 float(4바이트)에도 long(8바이트)의 값 담을 수 있음
        float flt3 = lng1;
        double dbl3 = lng1;

        long lng2 = Long.MAX_VALUE;

        //  ⭐ 큰 수(정확히 표현가능한 한도를 넘어서는)일 경우
        //  가능한 최대 정확도로 
        // float, double 둘 다 정확히 long을 표현하지 못하지만 double이 더 자세하게 표현해준다.
        float flt4 = lng2;
        double dbl4 = lng2;

        // float과 double을 연산하면 double로 전환됨
        				float flt01 = 4.124f;
        float flt02 = 4.125f;
        double dbl01 = 3.5;

        // float끼리의 연산은 float 반환
        float flt03 = flt01 + flt02;

        //  float과 double의 연산은 double 반환
        float flt04 = (float) (flt01 + dbl01); // ⚠️ 불가

        //  부동소수점 방식상 오차 자주 있음
        double dbl02 = 0.2 + 0.3f;
        double dbl03 = 0.2f * 0.7f;
        double dbl04 = 0.4 - 0.3;
        double dbl05 = 0.9f / 0.3;
        double dbl06 = 0.9 % 0.6;

        // 소수부가 2의 거듭제곱인 숫자간 연산은 오차 없음
        // 컴퓨터가 2진수로 계산하기 때문에  
        double dbl07 = 0.25 * 0.5f; 
        double dbl08 = 0.5 + 0.25 + 0.125 + 0.0625;
        double dbl09 = 0.0625f / 0.125;
        //  💡 정수 자료형과 실수 자료형의 계산은 실수 반환
    
        //  💡 리터럴로 작성시 double임을 명시하려면 .0을 붙여줄 것
        double dbl5 = 5 / 2; // 2.0
        double dbl6 = 5.0 / 2; // 2.5
        double dbl7 = (double) 5 / 2; // 2.5

        //  💡 정수/실수간, 다른 숫자 자료형간 사용 가능
        boolean bool0 = 123 == 123F; // true
    }
}
