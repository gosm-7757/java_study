package chapter_1;

public class stringType {
    public static void main(String[] args) {
        // - 0~다수의 문자들로 구성
        // - 쌍따옴표로 둘러쌈
        // - 이제까지 배운 자료형들과 달리 **참조 자료형**
        // - 그러나 특별히 원시값과 유사하게 사용될 수 있음

        //  리터럴 방식
        String str1 = "Hello World!";
        String str2 = "안녕하세요 😆 반갑습니다~ 🖐️🖐️🖐️";
        
        // 빈 문자열 가능
        String str3 = "";

        //  인스턴스 생성 방식
        String str4 = new String("나중에 자세히 배웁니다.");




        String hl1 = "Hello";
        String hl2 = "Hello";
        String wld = "World";

        //  리터럴끼리는 == 을 사용하여 비교 가능
        boolean bool1 = hl1 == hl2;     //true
        boolean bool2 = hl1 == wld;     //false

        String hl3 = new String("Hello");     
        String hl4 = new String("Hello");
        String hl5 = hl4;  // 메모리 주소를 저장

        //  💡 인스턴스와 비교하려면 .equals 메소드를 사용해야 함
        //   특별한 경우가 아니면 문자열은 .equals로 비교할 것
        boolean bool3 = hl3 == hl4;  // false  내용은 같지만 저장 메모리가 다르니까 false

        // 인스턴스를 비교하려면 이렇게 사용해야 한다. 
        boolean bool4 = hl1.equals(hl2); // true
        boolean bool5 = hl1.equals(hl3); // true  저장 메모리는 다르지만 내용이 같으니까 true
        boolean bool6 = hl3.equals(hl4); // true
        boolean bool7 = wld.equals(hl2);

        //  같은 곳을 참조하는 인스턴스들
        boolean bool8 = hl4 == hl5;  // true 
        System.out.println(bool6);

        // - `==` : 같은 종이인가? (같은 메모리인가)
        // - `equals` : 같은 글이 적혀있는가? (같은 내용인가)


        //  ⭐️ 각각의 메모리상 주소 식별자 비교 (메모리 주소를 가져온다.) 
        int hl1hash = System.identityHashCode(hl1); // hl1, hl2는 같다
        int hl2hash = System.identityHashCode(hl2);
        int hl3hash = System.identityHashCode(hl3); // hl3는 다르다
        int hl4hash = System.identityHashCode(hl4); // hl4, hl5는 같다
        int hl5hash = System.identityHashCode(hl5);

        // 연산자 
        String str_a1 = "안녕";

        boolean bool_a1 = str_a1.equals("안녕");

        //  💡 리터럴로 선언했어도 객체 인스턴스로 만들어짐
        //  때문에 객체의 기능인 메소드 사용 가능
        boolean bool_a2 = "안녕".equals("안녕");
        boolean bool_a3 = "안녕".equals(str_a1);

        String str_b1 = "Hello, ";
        String str_b2 = "World!";
        
        // + 연산자: 이어붙여진 결과를 반환 (문자열은 -는 사용할 수 없다.)
        String str_b3 = str_b1 + str_b2;  


        //  += 연산자:
        //  1. ⭐️ 해당 변수에 문자열을 이어붙임 (부수효과)
        String str_c1 = "나는 아무 생각이 없다. ";
        str_c1 += "왜냐하면 ";

        //  2. 그 결과를 반환
        String str_c2 = str_c1 += "아무 생각이 없기 때문이다.";

        boolean bool_c = (str_c1).equals(str_c2);

        //  ⚠️ 상수에는 적용할 수 없음
        final String str_d = "헬로";
        // str_d += "월드";

        int intNum = 123;
        float fltNum = 3.14f;
        boolean bool = true;
        char character = '가';

        String str_d1 = "자, 이어붙여볼까요? ";

        //  💡 문자열에 다른 자료형을 더하면 문자열로 이어붙여짐
        String str_d2 = str_d1 + intNum + fltNum + bool + character;
        System.out.println(str_d2);


        //  💡 타 자료형으로부터 문자열로 변환
        String _str1 = String.valueOf(true);
        String _str2 = String.valueOf(false);
        String _str3 = String.valueOf(123);
        String _str4 = String.valueOf(3.14f);
        String _str5 = String.valueOf('가');

        // 문자열을 더하는 방법도 있다. 
        String str6 = true + "";
        String str7 = 123.45 + "";


        String str123 = "123";

        //  문자열을 정수 자료형으로 변환하기
        byte bytNum = Byte.parseByte(str123);
        short srtNum = Short.parseShort(str123);
        int _intNum = Integer.parseInt(str123);
        long lngNum = Long.parseLong(str123);


        //  대소문자 무관 'true'일 때 true 반환
        boolean _bool1 = Boolean.parseBoolean("TRUE");
        boolean _bool2 = Boolean.parseBoolean("true");
        boolean _bool3 = Boolean.parseBoolean("T");  // flase 반환

        String strA = "A";

        //  문자열을 문자로 바꿈 
        char chr = strA.charAt(0);


        // 컴파일 단계에서는 오류를 검출하지 않음 
        // 실행 단계에서 오류가 발생한다. 

        //byte bytNum2 = Byte.parseByte("12345");
        //int intNum2 = Integer.parseInt("123.45");
        //double dblNum2 = Integer.parseInt("하나");



        String __str1 = "문자열에 \"큰따옴표가\" 안 들어가요";
        String __str2 = "엔터도 안 들어가요. \n못 믿겠으면 넣어봐.";

        // | 이스케이프 표현 | 대체 |

        // | \" | 큰따옴표 |
        // | \’ | 작은따옴표 |
        // | \n | 줄바꿈 |
        // | \t | 탭 |
        // | \\ | 백슬래시 하나 |

        String table = "언어\t\t종류\t\t\t\t자료형\nJava\tcompiled\t\t정적\nPython\tinterpreted\t\t동적";
        System.out.println(table);

        String path = "C:\\Document\\MyCodings";
        System.out.println(path);
    }
}
