package chapter_1;

public class noDefineType {
    public static void main(String[] args) {
        //타입추론 
        // 자바 10 버전부터 도입됨
        // var 연산자로 변수 선언 - 타입을 명시하지 않음
            // 대입된 값을 통해 컴파일러사 추론함
        // 지역 변수에서만 사용 가능 
            // 클래스의 필드로는 불가 

    
        var intNum = 1;
        var doubleNum = 3.14;
        var charLet = 'A';
        var StringWord = "안녕하세요";

        //  ⚠️ 아래와 같이는 사용 불가
        //  컴파일러가 타입을 추론할 수 없는 상황 (값이 들어와야 자료형을 추론할 수 있음)
        //var notInit; // ?초기화가 안 됨 
        //var nullVar = null; //? null로 초기화


        //  ⚠️ 자료형을 변경 불가
        //  !intNum = 1.23;
        //  !StringWord = 123;

        //  이후 배울 반복문에서 편리하게 사용
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //?  배열의 경우 초기화시에 명시
        var chars = new char[] {'A', 'B', 'C', 'D', 'E'};
        //  var chars2 = {'A', 'B', 'C', 'D', 'E'}; // ⚠️ 불가

        for (var c : chars) {
            System.out.println(c);
        }
    }
}
