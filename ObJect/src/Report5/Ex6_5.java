package Report5;

    class PlayingCard {
        int kind;
        int num;
        static int width;
        static int height;
        PlayingCard(int k, int n) {
            kind = k;
            num = n;
        }
        public static void main(String args[]) {
            PlayingCard card = new PlayingCard(1,1);
        }
    }

// 클래스 변수(static변수) :width , height
// 인스턴스 변수 : kind , num
// 지역변수 : k,n,card,args
//클래스 블럭쪽은  인스턴스 변수  staic변수는 클래스 변수이다
// 나머지는 지역변수