package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        // 절차 지향 프로그래밍의 관점에서 리팩토링
        // 관련 변수를 묶었고, 중복되는 코드를 메서드로 추춣하여 다음과 같은 장점을 가졌다.
        // 하지만 데이터와 기능이 분리되어 있다는 한계가 존재한다.
        // 여기서 객체 지향 프로그래밍을 활용하면 이러한 한계를 해결할 수 있다.

        // 각각의 변수를 선언하는 것이 아닌 클래스를 사용하게 되면
        // 음악플레이어와 관련된 변수들이 모두 data 객체에 속해있으므로 관리가 쉽다
        // (리팩토링 1. 관련 데이터 묶음)
        MusicPlayerData data = new MusicPlayerData();

        // 중복되는 코드들은 메서드로 추출
        // 이렇게 하면 중복이 제거되고, 기능 수정 시 메서드 내부만 변경하면 된다.
        // 뿐만 아니라 메서드 이름을 통해 코드를 쉽게 이해할 수 있다.
        // (리팩토링 2. 메서드 추출)

        // 음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);
        // 상태 확인
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

   static void showStatus(MusicPlayerData data){
       System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, " + "볼륨:" + data.volume);
        }else{
            System.out.println("음악 플레이어 OFF, " + "볼륨:" + data.volume);
        }
   }
}
