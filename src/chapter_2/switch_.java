public class switch_ {
    public static void main(String[] args) {

        byte fingersOut = 5;

        //  💡 switch : 괄호 안에 기준이 될 변수를 받음
        //  가능한 자료형: byte, short, int, char, String, enum(이후 배움)
        
        switch (fingersOut) {

            //  💡 case : 기준에 일치하는 case로 바로 이동
            //  💡 break : switch문 실행을 종료
            //  💡 default: 해당하는 case가 없을 때 - 마지막에 작성

            case 2: // case 안에는 정수만 들어가야 된다. (switch 괄호 안에 들어간 값이 정수이기 때문에)
                System.out.println("가위");
                break;
            case 0:
                System.out.println("바위");
                break;
            case 5:
                System.out.println("보");
                break;
            default:
                System.out.println("무효"); // 위에 조건이 다 맞지 않으면 default 출력
        }



        String direction = "west";
        String dirKor;

        //  break 제거하고 실행해 볼 것
        switch (direction) {
            case "north":
                dirKor = "북";
                break;
            case "south":
                dirKor = "남";
                break;
            case "east":
                dirKor = "동";
                break;
            case "west":
                dirKor = "서";
                break;
            default:
                dirKor = null;
        }

        System.out.println(
                dirKor != null ? dirKor : "무효"
        );



        //  💡 break 관련 동작방식을 이용
        char yutnori = '개';

        switch (yutnori) {  // 조건이 맞는 순간 아래코드 전체 실행 (break로 막을 수 있다.)
            case '모': System.out.println("앞으로");
            case '윷': System.out.println("앞으로");
            case '걸': System.out.println("앞으로");
            case '개': System.out.println("앞으로");
            case '도': System.out.println("앞으로"); break;  // break 문이 위로 올라가면 디폴트 값도 같이 출력됨
            default:
                System.out.println("무효");
        }



        byte month = 1;
        byte season;

        switch (month) {
            case 1: case 2: case 3:
                season = 1;
                break;
            case 4: case 5: case 6:
                season = 2;
                break;
            case 7: case 8: case 9:
                season = 3;
                break;
            case 10: case 11: case 12:
                season = 4;
                break;
            default:
                season = 0;
        }

        System.out.println(
                season > 0
                ? String.format("지금은 %d분기입니다.",season)
                        : "무효한 월입니다."
        );




        byte startMonth = 1;
        String holidays = "";

        switch (startMonth) {
            case 1:
                holidays += "설날, ";
            case 2:
            case 3:
                holidays += "3·1절, ";
                break;
            case 4:
            case 5:
                holidays += "어린이날, ";
            case 6:
                holidays += "현충일, ";
                break;
            case 7:
            case 8:
                holidays += "광복절, ";
            case 9:
                holidays += "추석, ";
                break;
            case 10:
                holidays += "한글날, ";
            case 11:
            case 12:
                holidays += "크리스마스, ";
                break;
            default:
                holidays = null; // 휴일이 없는 분기와 구분
        }

        // holiday가 지금으로서는 null이라서 result 변수에 넣어줘야함
        String result = holidays == null  // null과 같으면 
                ? "(잘못된 월입니다)"
                : "분기 내 휴일: " + holidays
                .substring(0, holidays.lastIndexOf(", "));
    }
}
