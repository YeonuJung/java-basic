package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
        volume = setVolumeUp(volume);
        System.out.println("음악 플레이어 볼륨:" + volume);
        volume = setVolumeUp(volume);
        System.out.println("음악 플레이어 볼륨:" + volume);
        volume = setVolumeDown(volume);
        System.out.println("음악 플레이어 볼륨:" + volume);
        System.out.println("음악 플레이어 상태 확인");
        checkStatus(isOn, volume);
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static int setVolumeUp(int volume){
        return volume + 1;
    }


    static int setVolumeDown(int volume){
        return volume - 1;
    }

   static void checkStatus(boolean isOn, int volume){
        if(isOn){
            System.out.println("음악 플레이어 ON, " + "볼륨:" + volume);
        }else{
            System.out.println("음악 플레이어 OFF, " + "볼륨:" + volume);
        }
   }
}
