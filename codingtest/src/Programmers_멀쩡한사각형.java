import java.math.BigInteger;

/*
���� ����
���� ���̰� Wcm, ���� ���̰� Hcm�� ���簢�� ���̰� �ֽ��ϴ�. ���̿��� ����, ���� ����� �����ϰ� ���� ���·� ���� �׾��� ������, ��� ����ĭ�� 1cm x 1cm ũ���Դϴ�. �� ���̸� ���� ���� ���� 1cm �� 1cm�� ���簢������ �߶� ����� �����̾��µ�, �������� �� ���̸� �밢�� ������ 2���� �մ� �������� �߶� ���ҽ��ϴ�. �׷��Ƿ� ���� ���簢�� ���̴� ũ�Ⱑ ���� �����ﰢ�� 2���� �������� �����Դϴ�. ���ο� ���̸� ���� �� ���� �����̱� ������, �� ���̿��� ���� ������ ����, ���� ����� �����ϰ� 1cm �� 1cm�� �߶� ����� �� �ִ� ��ŭ�� ����ϱ�� �Ͽ����ϴ�.
������ ���� W�� ������ ���� H�� �־��� ��, ����� �� �ִ� ���簢���� ������ ���ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
W, H : 1�� ������ �ڿ���
����� ��
W	H	result
8	12	80
����� �� ����
����� �� #1
���ΰ� 8, ���ΰ� 12�� ���簢���� �밢�� �������� �ڸ��� �� 16�� ���簢���� ����� �� ���� �˴ϴ�. ���� ���簢�������� 96���� ���簢���� ���� �� �־����Ƿ�, 96 - 16 = 80 �� ��ȯ�մϴ�.

572957326.92.png
 */
/*public class Programmers_�����ѻ簢�� {
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
        Programmers_�����ѻ簢�� test = new Programmers_�����ѻ簢��();
        Programmers_�����ѻ簢��.Square test2 = test.new Square();
        test2.setH(12);
        test2.setW(8);
        System.out.println(test2.solution());
    }
}
*/