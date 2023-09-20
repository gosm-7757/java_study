package chapter_1;

public class stringMethod1 {
    public static void main(String[] args) {
        // - 문자열 스스로를 변경하는 메소드는 없음 - *”문자열 고쳐 쓰는 거 아니다”*
        // - 새 문자열 또는 다른 값을 반환
        // - ⚠️ 문자열 변수에 다른 값을 넣을 수 없다는 뜻이 아님

        // 문자열 길이를 반환한다. 
        int int1 = "".length();
        int int2 = "헬로".length();
        int int3 = "Hello".length();
        int int4 = "김수한무 거북이와 두루미".length();


        // 빈 문자열 여부 확인 
        String str1 = "";
        String str2 = " \t\n"; // 길이 3
        
        int _int1 = str1.length();
        int _int2 = str2.length();  // 3

        //  💡isEmpty : 문자열의 길이가 0인지 여부
        boolean bool1 = str1.isEmpty(); // true
        boolean bool2 = str2.isEmpty(); // false

        //  💡isBlank : 공백(white space)을 제외한 문자열의 길이가 0인지 여부  (글자라고 할 게 있나?)
        //boolean bool3 = str1.isBlank(); // true
        //boolean bool4 = str2.isBlank(); // true : jdk 11부터 사용 가능 

        // 트리밍
        String str3 = "\t 킹       아       !! \n";

        //  💡 trim : 앞뒤의 공백(white space) 제거
        String str4 = str3.trim();
        System.out.println(str3);
        System.out.println(str4);

        //  변수 그 자체에 적용하기
        //  - 문자열은 불변 : 변수가 가리키는 종이를 바꾸는 것
        str3 = str3.trim();


        // 문자 반환 
        str1 = "아야 슬슬 오함마 준비해야 쓰것다";

        //  💡 charAt : ~번째 문자 반환
        char ch1 = str1.charAt(0);  // 아
        char ch2 = str1.charAt(4);  // 슬

        //  ⭐️ 마지막 문자 얻기
        char ch3 = str1.charAt(str1.length() - 1);  // 다



        // 문자(열)의 위치index 반환
        str2 = "얄리 얄리 얄라셩 얄라리 얄라";

        //  💡 indexOf/lastIndexOf : 일치하는 첫/마지막 문자열의 위치
        //  앞에서부터 카운트해서 int로 반환

        //  두 번째 인자 : ~번째 이후/이전부터 셈
        int1 = str2.indexOf('얄');
        int2 = str2.indexOf('얄', 4); // 어디서 부터 체크할지 정할 수 있음

        int3 = str2.indexOf("얄라");
        int4 = str2.lastIndexOf("얄라");
        int  int5 = str2.lastIndexOf("얄라", 12);

        //  💡 포함되지 않은 문자는 -1 반환
        int int6 = str2.indexOf('욜'); 
        System.out.println(int6);


        // 값 동일 여부 확인 (boolean 반환)
        //  💡 equals : 대소문자 구분하여 비교
        String str_a1 = "Hello World";
        String str_a2 = new String("Hello World");
        String str_a3 = "HELLO WORLD";

        boolean bool_a0 = str_a1 == str_a2;  // ⚠️ 문자열은 이렇게 비교하지 말 것!

        boolean bool_a1 = str_a1.equals(str_a2);  // true
        boolean bool_a2 = str_a1.equals(str_a3);  // false

        //  💡 equalsIgnoreCase : 대소문자 구분하지 않고 비교
        boolean bool_a3 = str_a1.equalsIgnoreCase(str_a3);  // true
        boolean bool_a4 = str_a2.equalsIgnoreCase(str_a3);  // true



        // 문자열 포함 여부 확인 
        String str_b1 = "옛날에 호랑이가 한 마리 살았어요.";

        //  💡 contains : 포함 여부
        boolean bool_b1 = str_b1.contains("호랑이");  // true
        boolean bool_b2 = str_b1.contains("나무꾼");  // false

        //  💡 startsWith : (주어진 위치에서) 해당 문자열로 시작 여부
        boolean bool_b3 = str_b1.startsWith("옛날에");  // true
        boolean bool_b4 = str_b1.startsWith("호랑이");  // false
        boolean bool_b5 = str_b1.startsWith("호랑이", 4);  // true 시작 위치 지정

        //  💡 endsWith : 해당 문자열로 끝남 여부
        boolean bool_b6 = str_b1.endsWith("살았어요.");  // true
        boolean bool_b7 = str_b1.endsWith("호랑이");  // false



        // 정규 표현식 일치 여부 확인 
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";  // 이메일 허용 형식

        String str_c1 = "yalco@yalco.kr";
        String str_c2 = "yalco.yalco.kr";
        String str_c3 = "yalco@yalco@kr";

        boolean bool_c1 = str_c1.matches(emailRegex); // true
        boolean bool_c2 = str_c2.matches(emailRegex); // false
        boolean bool_c3 = str_c3.matches(emailRegex); // false



        // 문자열 비교 (정렬할 때 주로 사용)
        str_a1 = "ABC";
        str_a2 = "ABCDE";
        str_a3 = "ABCDEFG";

        //  💡 compareTo : 사전순 비교에 따라 양수 또는 음수 반환

        //  같은 문자열이면 0 반환
        int int_a1 = str_a1.compareTo(str_a1);  // 0

        //  시작하는 부분이 같을 때는 글자 길이의 차이 반환
        int int_a2 = str_a1.compareTo(str_a2);  // -2
        int int_a3 = str_a1.compareTo(str_a3);  // -4
        int int_a4 = str_a2.compareTo(str_a3);  // -2
        int int_a5 = str_a3.compareTo(str_a1);  // 4

        String str_a4 = "HIJKLMN";

        //  시작하는 부분이 다를 때는 첫 글자의 정수값 차이 반환
        int int_a6 = str_a1.compareTo(str_a4);  // -7
        int int_a7 = str_a4.compareTo(str_a3);  // 7


        str_b1 = "abc";
        String str_b2 = "DEF";

        int int_b1 = str_b1.compareTo(str_b2);  // 29

        //  💡 compareToIgnoreCase : 대소문자 구분 없이 비교
        int int_b2 = str_b1.compareToIgnoreCase(str_b2);  // -3



        // 대소문자 변환
        str_a1 = "Hello, World!";

        // 💡 toUpperCase / toLowerCase : 모두 대문자/소문자로 변환
        str_a2 = str_a1.toUpperCase();  // HELLO WORLD!
        str_a3 = str_a1.toLowerCase();  // hello world!

        str_b1 = "Hi! How are you? I'm fine. Thank you!";
        str_b2 = "how";  // 이 문자열이 있는지 비교하고 싶을 때

        bool_b1 = str_b1.contains(str_b2);  // false

        //  ⭐️ 영문 텍스트에서 대소문자 무관 특정 텍스트 포함 여부 확인시
        bool_b2 = str_b1        // true
                .toUpperCase()
                .contains(str_b2.toUpperCase());

        bool_b3 = str_b1        // true
                .toLowerCase()
                .contains(str_b2.toLowerCase());
    }
}
