package day_1;

public class boolType {
    public static void main(String[] args) {
          // - 참/거짓 둘 중 한 값을 가짐
          // - 1바이트 *(8비트)* 공간 차지
          //     - 하드웨어 구조와의 호환성 - *CPU가 수월히 다룰 수 있는 최소 단위*
          // - 리터럴보다는 반환값으로 많이 사용됨

        boolean bool3 = !true;
        boolean bool4 = !false;

        boolean bool5 = !!bool3;
        boolean bool6 = !!!bool3;
        System.out.println(bool3);


        boolean bool7 = !(1 > 2); // true
        boolean bool8 = !((5 / 2) == 2.5);  // true
        boolean bool9 = !((3f + 4.0 == 7) != ('A' < 'B'));  // true


        int num = 4;

        boolean isPositiveAndOdd = num >= 0 && num % 2 == 1;
        boolean isPositiveOrOdd = num >= 0 || num % 2 == 1;

        boolean isPositiveAndEven = num >= 0 && num % 2 == 0;
        boolean isPositiveOrEven = num >= 0 || num % 2 == 0;

        num = 6;

        //  💡 &&가 ||보다 우선순위 높음
        boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10);
        boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10);
    
        // - `&&` : 앞의 것이 `false`면 뒤의 것을 평가할 필요 없음
        // - `||` : 앞의 것이 `true`면 뒤의 것을 평가할 필요 없음
        // - 평가는 곧 실행 - 이 점을 이용한 간결한 코드
        // - 💡연산 부하가 적은 코드를 앞에 - 리소스 절약


        // ### 삼항 연산자

        // - a ? b : c
        //     - a : 불리언 값
        //     - b : a가 `true` 일 때 반환될 값
        //     - c : a가 `false` 일 때 반환할 값

        int num1 = 3, num2 = 4;

        char num1OE = num1 % 2 == 1 ? '홀' : '짝';
        char num2OE = num2 % 2 == 1 ? '홀' : '짝';


        num = 3;
        
        //  아래 값들을 바꿔가며 실행해 볼 것
        boolean mult2 = true;
        //mult2 = false;
        
        boolean plus5 = true;
        //plus5 = false;

        System.out.println(
                (!mult2 && !plus5) ? num                // true
                : (mult2 && plus5) ? num * 2 + 5    // true
                : mult2 ? num * 2                             // true
                : num + 5);                                        // false


        int x = 1, y = 2;

        //  💡 단축평가 적용됨
        // x와 y가 번갈아 가며 2씩 더해짐 
        int changed1 = x < y ? (x += 2) : (y += 2);
        int changed2 = x < y ? (x += 2) : (y += 2); 
        int changed3 = x < y ? (x += 2) : (y += 2);
        int changed4 = x < y ? (x += 2) : (y += 2);
        int changed5 = x < y ? (x += 2) : (y += 2);
    
    }
}
