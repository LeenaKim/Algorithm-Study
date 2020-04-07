import java.util.LinkedList;

/*
���� ����

�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. �̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.
1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
3. �׷��� ������ J�� �μ��մϴ�.
���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� �߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.
���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. ���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.
���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� ���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� location�� �Ű������� �־��� ��, ���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
���ѻ���
���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ ������� ���� �տ� ������ 0, �� ��°�� ������ 1�� ǥ���մϴ�.
����� ��
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5
����� �� ����
���� #1
������ ���� ���� �����ϴ�.
���� #2
6���� ����(A, B, C, D, E, F)�� �μ� ����Ͽ� �ְ� �߿䵵�� 1 1 9 1 1 1 �̹Ƿ� C D E F A B ������ �μ��մϴ�.
 */
public class Programmers_Printer {
    /*public int solution (int[] priorities, int location) {
        int cnt = 0;
        int answer = 1;

//// ���� �� ��° Ǯ�� ////
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int priority : priorities){
            pq.add(priority);
        }
        while(!pq.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(pq.peek() == priorities[i]){
                    pq.poll();
                    answer++;
                    if (location == i){
                        pq.clear();
                        break;
                    }
                }
            }
        }
        return answer;
//// ���� �� ��° Ǯ�� ////
        LinkedList<Integer> waitingLine = new LinkedList<>();
        //LinkedList<Integer> printed = new LinkedList<>();

        for (int priority : priorities) {
            waitingLine.add(priority);
        }

        int maxIndex = 0;

        while (waitingLine.size() != 0) {
            System.out.println(waitingLine);
            // �ִ� ������ ���ֱ� //
            int max = waitingLine.get(0);
            for (int i = 0; i < waitingLine.size(); i++) {
                if (max < waitingLine.get(i)) {
                    max = waitingLine.get(i);
                    maxIndex = i;
                } else if (max == waitingLine.get(i)) {
                    maxIndex = 0;
                }
            }
            for(int i = 0; i < priorities.length; i++){
                if (waitingLine.peek() == max) {
                    if (maxIndex == location) {
                        answer = cnt;
                    }
                    waitingLine.poll();
                    cnt++;
                } else {
                    waitingLine.offer(waitingLine.poll());
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        Programmers_Printer one = new Programmers_Printer();
        System.out.println(one.solution(priorities, location));
*/
//// ���� ù ��° Ǯ�� ////
        /*while (printed.size() < priorities.length){
            System.out.println(waitingLine);
            // �ִ� ������ ���ֱ� //
            int max = waitingLine.get(0);
            for(int i = 0; i < waitingLine.size(); i++){
                if(max < waitingLine.get(i)) {
                    max = waitingLine.get(i);
                }
            }

            if (waitingLine.peek() < max){
                waitingLine.offer(waitingLine.poll());

            } else {

                printed.add(waitingLine.poll());

            }

            }
        System.out.println(printed);
        System.out.println(cnt);

         */



        }



