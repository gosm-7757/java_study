package chapter_1;

public class formating_and_null {
    public static void main(String[] args) {
        // 포맷팅
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        //  💡 formatted : 주어진 형식에 따라 문자열 생성
        //  ⭐️ 13+버전에 추가됨. 편의상 강의에서 많이 사용할 것 (나는 11버전임)
        // String str2 = str1.formatted(circle, two, PI);  // 원의 둘레는 반지름 X 2 X 3.140000입니다.

        //  💡 이전 버전에서의 방식. 실무에서 사용하려면 기억
        String str3 = String.format(str1, circle, two, PI);

        // %b  불리언
        // %d  10진수 정수
        // %f      실수
        // %c      문자
        // %s  문자열
        // %n  (포맷 문자열 내 바꿈)

        //  ⭐️ 시스템의 printf 메소드 : String.format과 같은 형식으로 출력
        //  줄바꿈을 하지 않으므로 직접 넣어줘야 함
        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);
        // printf는 포맷팅을 포함하는 메서드

        // - `%n` 은 OS별로 일정하게 줄바꿈이 되도록 적절한 개행문자를 넣어줌
        // - 윈도우 : `\r\n` , 맥&리눅스 : `\n`


        // %5d => 포맷팅 문자를 포함하여 5칸
        // %05d => 포맷팅 문자를 포함하여 5칸이지만 공백이 아닌 0으로 채워라
        System.out.printf("%d, %5d, %05d%n- - - - -%n%n", 123, 123, 123);



        //  💡 *정수* 다양하게 포매팅하기
        String[] intFormats = {
                "%d",        // 1. 기본
                "%13d",      // 2. n 자리수 확보, 오른쪽 정렬
                "%013d",     // 3. 빈 자리수 0으로 채움
                "%+13d",     // 4. 양수는 앞에 + 붙임 (보호표시)
                "%,13d",     // 5. 쉼표 사용
                "%-13d",     // 6. 자리수 확보, **왼쪽 정렬**
                "%+,013d"    // 7.
        };

        String[] intResults = new String[intFormats.length];

        // 이후의 배울 for 반복문
        // - 위의 형식들로 하나하나 출력해보는 코드
        for (var i = 0; i < intFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 4; j++) {
                format += intFormats[i] + " ";
            }
            format = format.trim() + "%n%n";  // "%d %d %d %d%n%n" ...
            System.out.println(format); // 🔍 주석해제하여 함께 확인

            //  🔍 이 숫자들을 스페이스로 구분해서 출력해 볼 것
            System.out.printf(format, 12, 2345, 67890, -1234567);

            //  ⭐️ formatted 메소드에서도 사용 가능
            intResults[i] = String.format(format, 12, 2345, 67890, -1234567);
        }


        System.out.println("\n\n\n\n"); // 구분하기 위함


        //  💡 실수 다양하게 포매팅하기
        String[] fltFormats = {
                "%f",       // 1. 기본 (소수점 6자리, 0으로 메움)
                "%.2f",     // 2. 소수점 n자리까지
                "%13.2f",   // 3. 정수자리 확보, 소수자리 제한
                "%,f",      // 4
                "%+013.2f",  // 5
                "%-13.2f",  // 6
        };

        String[] fltResults = new String[fltFormats.length];

        for (var i = 0; i < fltFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 4; j++) {
                format += fltFormats[i] + " ";
            }
            format = format.trim() + "%n%n";

            System.out.printf(format, 1.2, 123.456, 1234.123456789, -123.4567);

            fltResults[i] = String.format(format, 1.2, 123.456, 1234.123456789, -123.4567);
        }



        System.out.println("\n\n\n\n"); // 구분하기 위함 
        
        

        // 문자열 
        //  💡 문자열 다양하게 포매팅하기
        String[] strFormats = {
                "%s",    // 1. 기본
                "%9s",   // 2. 자리 확보
                "%.2s",  // 3. ~글자만
                "%9.2s", // 4.
                "%-9s",  // 5. 왼쪽 정렬
        };

        String[] strResults = new String[strFormats.length];

        for (var i = 0; i < strFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 2; j++) {
                format += strFormats[i] + " ";
            }
            format = format.trim() + "%n%n";

            System.out.printf(format, "Hello", "하이염");

            strResults[i] = String.format(format, "Hello", "하이염");
        }
        


        // null 문자열
        String emptyStr = "";  // 메모리가 존재함 
        String nullStr = null;   // 메모리 자체가 없음

        //  ⭐️ 빈 문자열과 null은 다름
        boolean bool1 = emptyStr == nullStr;  // false

        //  ⚠️ null은 문자열 인스턴스 메소드 사용 불가
        //  아래의 코드들은 모두 런타임 에러를 발생시킴

        // 런타임 오류
        //  int int1 = nullStr.length();  // null은 길이를 잴 수 없음
        //boolean bool2 = nullStr.equals(emptyStr); // null은 문자열이 아님(어떤 기능을 갖지 않음)
        //String str1 = nullStr.concat("ABC"); // 어떤 기능을 갖지 않음 

        //  💡 문자열을 외부로부터 받아올 경우 등...
        String defaultStr =
                (nullStr != null && !nullStr.isEmpty())  // null아 아니고 빈 값이 아니라면 
                        ? nullStr : "(기본값)";

        //  💡 초기화되지 않은 변수와 비교
        String notInitStr;
        String nullStr2 = null;

        //  ⚠️ 컴파일 오류 발생
        // System.out.println(notInitStr); 초기화가 안되면 컴파일 오류

        //  코드에 따라 정상실행 또는 런타임 오류
        System.out.println(nullStr2);



        //  ⭐️ 이 외에도 참조 자료형의 인스턴스는 null 가능
        Object obj = null;
        System sys = null;

        //  ⭐️ 원시값들도 참조 자료형의 인스턴스로는 null 가능
        Integer nullInt1 = null;
        Double nullDbl1 = null;
        Boolean nullBool1 = null;
        Character nullChr1 = null;

        //  ⚠️  원시값은 불가
        //int nullInt2 = null;
        //double nullDbl2 = null;
        //boolean nullBool2 = null;
        //char nullChr2 = null;

    }
}
