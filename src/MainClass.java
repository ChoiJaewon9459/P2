import java.util.Scanner;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("오징어 게임에 오신것을 환영합니다.");
        System.out.println("이번 게임은 구슬 게임입니다.");
        System.out.println("당신과 나는 각각 10개의 구슬을 가지고 있습니다.");
        System.out.println("10개의 구슬을 다 잃으면 죽습니다.");
        System.out.println("시작합니다.");
        System.out.println("배팅 하세요.");
        int bet_player1 = 10;
        int bet_player2 = 10;

        //베팅 숫자를 입력받기
        int bet = 0;//입력 받기 위한 준비
        boolean stop = true;
        while (stop){
            System.out.print("입력 : ");
            bet = sc.nextInt();//숫자를 입력받아서 bet변수에 저장
            System.out.println("당신은 몇개의 구슬을 배팅했습니다. 갯수 :"+bet);
            if(bet_player1 < bet){
                System.out.println("갯수가 부족합니다.");
            }else {
                System.out.println("게임진행");
                //stop = false;
                break;
            }
        }
        System.out.println("맞춰봐");
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int bet_2 =0;
        bet_2 =random.nextInt(10) + 1; //1~10까지 숫자가 랜덤으로 나옴
        System.out.println("컴퓨터가 낸 문제(구슬갯수) : " + bet_2);
        String dao = "짝";
        if (bet_player2 % 2 == 0){
            dao = "짝";
        }else {
            dao = "홀";
        }
        System.out.println(dao);
        String Play1dao = sc.next();

        //만약에 내가 가진 갯수 보다 많이 배팅을 하면
        //안된다 다시 배팅해라
        //내가 가진 갯수 보다 적게 배팅하면 홀짝 게임 진행
        bet_player1 = bet_player1 - bet;
        bet_player2 = bet_player2 - bet_2;

    }
}
