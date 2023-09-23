package chapter_2;

public class while_do {
    public static void main(String[] args) {
        int i = 0;

        //  💡 while 문의 괄호에는 종료조건만
        while (i < 10) {
            // 종료조건 충족을 위한 값 변화는 외적으로 
            System.out.println(i++);
            }

        
        //  💡 의도적인 무한 루프에 널리 쓰이는 코드
        /* while (true) {
            System.out.println("인간의 욕심은 끝이 없고");
            System.out.println("같은 실수를 반복한다.");
        } */



        /* double popInBillion = 7.837;

        //  ⭐️ break 를 통한 반복 탈출
        while (true) {
            System.out.println("세계인구: " + (popInBillion -= 0.1));
            if (popInBillion <= 0) break;

            System.out.println("인간의 욕심은 끝이 없고");
            System.out.println("같은 실수를 반복한다.");
        }

        System.out.println("인류 멸종"); */




        //  100보다 작은 3의 배수들 출력해보기				

        i = 1;

        // ⚠️ 의도대로 작동하지 않음. 이유는?
        // while (true) {
        //     if (i % 3 != 0) continue;  
        //     System.out.println(i);  // 이 조건에 맞아가지고 계속 반복됨
             // 아래 코드까지 도달하지 못해서 i의 값이 계속 1을 유지하게 됨
        //     if (i++ == 100) break;
        // }

        System.out.println("\n- - - - -\n");

        while (true) {
            if (i++ == 100) break; // i값이 변하는 코드를 위에 적어두면 해결된다. 
            if ((i - 1) % 3 != 0) continue;  // i의 값이 늘어났기 때문에 1을 빼준다.

            System.out.println(i - 1);
        }

        System.out.println("\n- - - - -\n");


        //  보다 가독성을 높이고 의도를 잘 드러낸 코드
        i = 1;
        while (true) {
            int cur = i++;  // 변수에 대입된 후 1씩 증가

            if (cur == 100) break;
            if (cur % 3 != 0) continue;
            
            System.out.println(cur);

        }


        System.out.println("\n- - - - -\n");


        int enemies = 0;

        System.out.println("일단 사격");

        do {
            System.out.println("탕");
            if (enemies > 0) enemies--;  // 적 한명 감소시킴
        } while (enemies > 0);  // 적이 1명이라도 남아있으면 다시 반복

        System.out.println("사격중지 아군이다");



        System.out.println("\n- - - - -\n");



        int x = 10; // 10 이상으로 바꿔서 다시 실행해 볼 것
        int y = x;

        // 조건을 보고 코드 실행
        while (x < 10) {
            System.out.println("while 문: " + x++);
        }

        // 일단 실행하고 조건 확인
        do {
            System.out.println("do ... while 문: " + y++);
        } while (y < 10);


        System.out.println("\n- - - - -\n");



        // 중첩 반복
        int lineWidth = 5;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }



        //  for 문으로 다시 작성
        for (int k = lineWidth; k > 0; k--) {
            for (int j = k; j > 0; j--) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
