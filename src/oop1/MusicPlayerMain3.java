package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        // 객체 지향 프로그래밍의 관점에서 리팩토링
        // 데이터와 기능을 하나로 묶어서 음악 플레이어라는 개념을 온전히 하나의 클래스에 담기
        // 프로그램을 작성하는 절차도 중요하지만 지금은 음악 플레이어라는 개념을 객체로 만드는 것에 집중
        // 즉, 객체 지향은 절차 지향에서 말하는 프로그램 작성 절차보다
        // 속성과 기능을 하나로 묶어서 객체를 구성하는 것에 더 집중

        // 속성 : volume, isOn
        // 기능: on(), off(), volumeUp(), volumeDown(), showStatus()

        MusicPlayer musicPlayer = new MusicPlayer();
        // 음악 플레이어에 필요한 모든 속성과 기능이 MusicPlayer라는 하나의 클래스에 모두 존재
        // 사용하는 입장에서는 내부 구현을 몰라도 사용하는데 지장X, 호출만 하면 됨
        // 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드로 외부에 제공하는 것을 캡슐화라고 함
        // 쉽게 생각하면 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것과 같음


        // 음악 플레이어 켜기
        musicPlayer.on();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 감소
        musicPlayer.volumeDown();
        // 상태 확인
        musicPlayer.showStatus();
        // 음악 플레이어 끄기
        musicPlayer.off();
    }
}
