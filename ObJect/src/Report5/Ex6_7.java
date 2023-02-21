package Report5;

public class Ex6_7 {
    //6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
    //이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
    //(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
    class Marine {
        int x=0, y=0; //Marine의 위치좌표 (x,y)
        int hp = 60; //현재 체력
        int weapon = 6; //공격력
        int armor = 0; //방어력
        void weaponUp() {
            weapon++;
        }
        void armorUp() {
            armor++;
        }
        void move(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
    // weapon, armor - 모든 Marine인스턴스에 대해 동일한 값
    // 모든 인스턴스가 공통적인값을 가져야하니깐 변수는 클래스 변수인 static 변수 사용해야 함
    // weaponUp(), armorUp() - static변수에 대한 작업을 하는 메서드
    // move 메서드는 인스턴스 변수 x y는  static을 붙어줘서는 안된다