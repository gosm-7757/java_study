package day_1;

public class floatType {
    public static void main(String[] args) {

        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김
        double c = a + b; // 0.30000000000000004

        boolean bool = 0.1 + 0.2 == 0.3; // false
    }
}
