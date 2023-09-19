package day_1;

public class dataSize {
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
        // _2b_short = _1b_byte;
        // _4b_int = _1b_byte; _4b_int = _2b_short;
        // _8b_long = _1b_byte; _8b_long = _2b_short; _8b_long = _4b_int;

        // //  ⚠️ 작은 자료형에 큰 자료형의 값을 '그냥' 넣을 수 없음
        // //  들어있는 값의 크기와 무관
        // _1b_byte = _2b_short; _1b_byte = _4b_int; _1b_byte = _8b_long;
        // _2b_short = _4b_int; _2b_short = _8b_long;
        // _4b_int = _8b_long;
    }
}
