import java.util.ArrayList;

/*
���� ����
���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.

��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.

���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� �� �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
�۾��� ����(progresses, speeds�迭�� ����)�� 100�� �����Դϴ�.
�۾� ������ 100 �̸��� �ڿ����Դϴ�.
�۾� �ӵ��� 100 ������ �ڿ����Դϴ�.
������ �Ϸ翡 �� ���� �� �� ������, �Ϸ��� ���� �̷�����ٰ� �����մϴ�. ���� ��� �������� 95%�� �۾��� ���� �ӵ��� �Ϸ翡 4%��� ������ 2�� �ڿ� �̷�����ϴ�.
����� ��
progresses	speeds	return
[93,30,55]	[1,30,5]	[2,1]
����� �� ����
ù ��° ����� 93% �Ϸ�Ǿ� �ְ� �Ϸ翡 1%�� �۾��� �����ϹǷ� 7�ϰ� �۾� �� ������ �����մϴ�.
�� ��° ����� 30%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 30%�� �۾��� �����ϹǷ� 3�ϰ� �۾� �� ������ �����մϴ�. ������ ���� ù ��° ����� ���� �ϼ��� ���°� �ƴϱ� ������ ù ��° ����� �����Ǵ� 7��° �����˴ϴ�.
�� ��° ����� 55%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 5%�� �۾��� �����ϹǷ� 9�ϰ� �۾� �� ������ �����մϴ�.

���� 7��°�� 2���� ���, 9��°�� 1���� ����� �����˴ϴ�.
 */
/*public class Programmers_��ɰ��� {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> workDays = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++){
            if((100-progresses[i]) % speeds[i] == 0){
                workDays.add((100-progresses[i]) / speeds[i]);
            } else {
                workDays.add((100-progresses[i]) / speeds[i] + 1);
            }
        }

        int restart = 0;
        int cnt = 1;
            for(int j = restart+1; j < workDays.size(); j++){
                if(workDays.get(restart) >= workDays.get(j)){
                    cnt++;
                    if(j == workDays.size()-1){
                        answerList.add(cnt);
                    }
                } else {
                    answerList.add(cnt);
                    cnt = 1;
                    restart = j;
                    if(restart == workDays.size()-1){
                        answerList.add(cnt);
                    }
                }
            }

        int[] answer = new int[answerList.size()];
            for(int i = 0; i < answerList.size(); i++){
                answer[i] = answerList.get(i);
            }
        return answer;
    }
    public static void main(String[] args) {
        int[] progresses = {10, 30, 40, 20, 15};
        int[] speeds = {2, 10, 6, 1, 3};
        Programmers_��ɰ��� test = new Programmers_��ɰ���();
        System.out.println(test.solution(progresses, speeds));

    }
}
*/