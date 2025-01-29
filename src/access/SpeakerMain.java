package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume(); // 100

        speaker.volumeUp();
        speaker.showVolume(); // 100

        speaker.volumeDown();
        speaker.showVolume(); // 90

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200;
        // speaker.showVolume(); // 200
        // 이렇게 외부에서 멤버변수에 직접 접근하는 것을 막기 위해 private 접근 제어자 사용

        // 접근 제어자는 private < default(package-private) < protected < public 순으로 범위가 넓음
        // 외부접근 X < 같은 패키지 내부에서만 < 같은 패키지 + 상속관계 < 외부 호출 가능
        // 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것
    }
}
