import java.math.BigInteger;

/*
문제 설명
가로 길이가 Wcm, 세로 길이가 Hcm인 직사각형 종이가 있습니다. 종이에는 가로, 세로 방향과 평행하게 격자 형태로 선이 그어져 있으며, 모든 격자칸은 1cm x 1cm 크기입니다. 이 종이를 격자 선을 따라 1cm × 1cm의 정사각형으로 잘라 사용할 예정이었는데, 누군가가 이 종이를 대각선 꼭지점 2개를 잇는 방향으로 잘라 놓았습니다. 그러므로 현재 직사각형 종이는 크기가 같은 직각삼각형 2개로 나누어진 상태입니다. 새로운 종이를 구할 수 없는 상태이기 때문에, 이 종이에서 원래 종이의 가로, 세로 방향과 평행하게 1cm × 1cm로 잘라 사용할 수 있는 만큼만 사용하기로 하였습니다.
가로의 길이 W와 세로의 길이 H가 주어질 때, 사용할 수 있는 정사각형의 개수를 구하는 solution 함수를 완성해 주세요.

제한사항
W, H : 1억 이하의 자연수
입출력 예
W	H	result
8	12	80
입출력 예 설명
입출력 예 #1
가로가 8, 세로가 12인 직사각형을 대각선 방향으로 자르면 총 16개 정사각형을 사용할 수 없게 됩니다. 원래 직사각형에서는 96개의 정사각형을 만들 수 있었으므로, 96 - 16 = 80 을 반환합니다.

572957326.92.png
 */
/*public class Programmers_멀쩡한사각형 {
    class Square {
        private int w;
        private int h;


        public int getW(int i) {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        public int getH(int i) {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "w=" + w +
                    ", h=" + h +
                    '}';
        }

        /*public long solution() {
            long answer = 1;

            BigInteger b1 = BigInteger.valueOf(w);
            BigInteger b2 = BigInteger.valueOf(h);
            BigInteger gcd = b1.gcd(b2);
            long gcdd = gcd.intValue();

            answer = w * h - (w + h - gcdd);

            return answer;
        }*/
        /*
        public long solution() {
            long answer = 0;
            for(int i = 0; i < w; i++){
                answer += (Long.valueOf(h) * i ) / Long.valueOf(w);
            }
            return answer * 2;
        }
    }
    public static void main(String[] args) {
        Programmers_멀쩡한사각형 test = new Programmers_멀쩡한사각형();
        Programmers_멀쩡한사각형.Square test2 = test.new Square();
        test2.setH(12);
        test2.setW(8);
        System.out.println(test2.solution());
    }
}
*/