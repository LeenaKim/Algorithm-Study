/*
���� ����
124 ���� �ֽ��ϴ�. 124 ���󿡼��� 10������ �ƴ� ������ ���� �ڽŵ鸸�� ��Ģ���� ���� ǥ���մϴ�.

124 ���󿡴� �ڿ����� �����մϴ�.
124 ���󿡴� ��� ���� ǥ���� �� 1, 2, 4�� ����մϴ�.
���� �� 124 ���󿡼� ����ϴ� ���ڴ� ������ ���� ��ȯ�˴ϴ�.

10����	124 ����	10����	124 ����
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41
�ڿ��� n�� �Ű������� �־��� ��, n�� 124 ���󿡼� ����ϴ� ���ڷ� �ٲ� ���� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
n�� 500,000,000������ �ڿ��� �Դϴ�.
����� ��
n	result
1	1
2	2
3	4
4	11
 */
/*public class Programmers_124���� {
    public String solution(int n){
        String answer = "";
        String[] numbers = {"4", "1", "2"};
        int rest = 0;

        while (n > 0){
            rest = n % 3;
            n /= 3;

            if (rest == 0) { n--; rest = 4; }

            answer = rest + answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        Programmers_124���� test = new Programmers_124����();
        System.out.println(test.solution(n));
    }
}
*/