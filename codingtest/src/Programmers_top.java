/*
���� ����
���� ������ ž N�븦 �������ϴ�. ��� ž�� ����⿡�� ��ȣ�� ��/�����ϴ� ��ġ�� ��ġ�߽��ϴ�. �߻��� ��ȣ�� ��ȣ�� ���� ž���� ���� ž������ �����մϴ�. ����, �� �� ���ŵ� ��ȣ�� �ٸ� ž���� �۽ŵ��� �ʽ��ϴ�.

���� ��� ���̰� 6, 9, 5, 7, 4�� �ټ� ž�� �������� ���ÿ� ������ ��ȣ�� �߻��մϴ�. �׷���, ž�� ������ ���� ��ȣ�� �ְ��޽��ϴ�. ���̰� 4�� �ټ� ��° ž���� �߻��� ��ȣ�� ���̰� 7�� �� ��° ž�� �����ϰ�, ���̰� 7�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž��, ���̰� 5�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž�� �����մϴ�. ���̰� 9�� �� ��° ž�� ���̰� 6�� ù ��° ž�� ���� ������ ��ȣ�� � ž������ ������ �� �����ϴ�.

�۽� ž(����)	���� ž(����)
5(4)	4(7)
4(7)	2(9)
3(5)	2(9)
2(9)	-
1(6)	-
�� ���ʺ��� ������� ž�� ���̸� ���� �迭 heights�� �Ű������� �־��� �� �� ž�� �� ��ȣ�� ��� ž���� �޾Ҵ��� ����� �迭�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
heights�� ���� 2 �̻� 100 ������ ���� �迭�Դϴ�.
��� ž�� ���̴� 1 �̻� 100 �����Դϴ�.
��ȣ�� �����ϴ� ž�� ������ 0���� ǥ���մϴ�.
����� ��
heights	return
[6,9,5,7,4]	[0,0,2,2,4]
[3,9,9,3,5,7,2]	[0,0,0,3,3,3,6]
[1,5,3,6,7,6,5]	[0,0,2,0,0,5,6]
����� �� ����
����� �� #1
�ռ� ������ ���� �����ϴ�.

����� �� #2

[1,2,3] ��° ž�� �� ��ȣ�� �ƹ��� �������� �ʽ��ϴ�.
[4,5,6] ��° ž�� �� ��ȣ�� 3��° ž�� �����մϴ�.
[7] ��° ž�� �� ��ȣ�� 6��° ž�� �����մϴ�.

����� �� #3

[1,2,4,5] ��° ž�� �� ��ȣ�� �ƹ��� �������� �ʽ��ϴ�.
[3] ��° ž�� �� ��ȣ�� 2��° ž�� �����մϴ�.
[6] ��° ž�� �� ��ȣ�� 5��° ž�� �����մϴ�.
[7] ��° ž�� �� ��ȣ�� 6��° ž�� �����մϴ�.
 */
/*public class Programmers_top {
    public int[] solution(int[] heights){
        int[] answer = new int [heights.length];
        answer[0] = 0;
        int restart = heights.length-1;
        int i = restart - 1;

        while (restart > 0){
            if(heights[restart] < heights[i]){
                answer[restart] = i + 1;
                restart--;
                i = restart - 1;
            } else if (i == 0 && heights[restart] >= heights[i]){
                answer[restart] = 0;
                restart--;
                i = restart -1;
            } else i--;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {3, 9, 9, 3, 5, 7, 2};
        Programmers_top test = new Programmers_top();
        for(int a : test.solution(heights)){
            System.out.printf("%d\t", a);
        }
    }
}
*/