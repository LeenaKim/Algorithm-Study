import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/*
���� ����

���� ��ų�̶� � ��ų�� ���� ���� ���� ����� �ϴ� ��ų�� ���մϴ�.
���� ��� ���� ��ų ������ ����ũ �� ����Ʈ�� ��Ʈ �� ����϶�, ����� ������ ���� ����Ʈ�� ��Ʈ�� ����� �ϰ�, ����Ʈ�� ��Ʈ�� ������ ���� ����ũ�� ����� �մϴ�.
�� ������ ���� �ٸ� ��ų(���� ��)�� ������ ������� ��� �� �ֽ��ϴ�. ���� ����ũ �� ���� �� ����Ʈ�� ��Ʈ �� ����� ���� ��ųƮ���� ����������, ��� �� ����ũ�� ����Ʈ�� ��Ʈ �� ����ũ �� ���� �� ����� ���� ��ųƮ���� �Ұ����մϴ�.
���� ��ų ���� skill�� �������� ���� ��ųƮ��1�� ���� �迭 skill_trees�� �Ű������� �־��� ��, ������ ��ųƮ�� ������ return �ϴ� solution �Լ��� �ۼ����ּ���.
���� ����
��ų�� ���ĺ� �빮�ڷ� ǥ���ϸ�, ��� ���ڿ��� ���ĺ� �빮�ڷθ� �̷���� �ֽ��ϴ�.
��ų ������ ��ųƮ���� ���ڿ��� ǥ���մϴ�.
���� ���, C �� B �� D ��� CBD�� ǥ���մϴ�
���� ��ų ���� skill�� ���̴� 1 �̻� 26 �����̸�, ��ų�� �ߺ��� �־����� �ʽ��ϴ�.
skill_trees�� ���� 1 �̻� 20 ������ �迭�Դϴ�.
skill_trees�� ���Ҵ� ��ų�� ��Ÿ���� ���ڿ��Դϴ�.
skill_trees�� ���Ҵ� ���̰� 2 �̻� 26 ������ ���ڿ��̸�, ��ų�� �ߺ��� �־����� �ʽ��ϴ�.
����� ��
skill	skill_trees	return
"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
����� �� ����
BACDE: B ��ų�� ���� ���� C ��ų�� ���� ����� �մϴ�. �Ұ����� ��ųƮ���ϴ�.
CBADF: ������ ��ųƮ���Դϴ�.
AECB: ������ ��ųƮ���Դϴ�.
BDA: B ��ų�� ���� ���� C ��ų�� ���� ����� �մϴ�. �Ұ����� ��ųƮ���Դϴ�.
 */
public class Programmers_SkillTree {
    public static void main(String[] args) {
        /*String skill = "CBD";
        String[] skill_trees = {"BACDE","CBADF", "AECB","BDA"};
        */

        String skill = "ABED";
        String[] skill_trees = {"ABECD", "VHIED", "HEABD"};

        //// ���� ù ��° Ǯ�� ////
        /*int cnt = 0;
        int cntt = 0;
        int answer = 0;
        HashMap<String, String> skillAndIndex = new HashMap<>();
        ArrayList<Integer> indexOfSkill = new ArrayList<>();

        for(int j = 0; j < skill_trees.length; j++){
            String tree = skill_trees[j];
                for(int i = 0; i < skill.length(); i++) {
                    for(int h = 0; h < tree.length(); h++){
                        if(skill.charAt(i) == tree.charAt(h)) {
                            indexOfSkill.add(h);
                            cntt += 1;
                        }
                        if(h == tree.length()-1 && cntt == 0){
                            indexOfSkill.add(30);
                        }
                    }
                    cntt = 0;
                    if(i > 0 && indexOfSkill.get(i-1) < indexOfSkill.get(i))
                        cnt += 1;
                }
                if(cnt == skill.length()-1) answer += 1;
                indexOfSkill.clear();
                cnt = 0;
        }
        System.out.println(answer);



    */

        //// �ٸ��̵��� ���� ������ �ٽ� Ǭ Ǯ�� ////

        int answer = 0;

        for(int i=0; i<skill_trees.length; i++){
            boolean flag = true;
            int skillIndex = 0;
            for(int j=0; j<skill_trees[i].length(); j++){

                for(int h=skillIndex; h<skill.length(); h++){
                    if(skill_trees[i].charAt(j)==skill.charAt(h)){
                        if(h!=skillIndex) flag = false;
                        else skillIndex++;
                    }
                }
            }
            if(flag) answer++;
        }
        System.out.println(answer);
    }
}
