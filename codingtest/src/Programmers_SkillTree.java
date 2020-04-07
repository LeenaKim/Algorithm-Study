import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/*
문제 설명

선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.
예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
제한 조건
스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.
스킬 순서와 스킬트리는 문자열로 표기합니다.
예를 들어, C → B → D 라면 CBD로 표기합니다
선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.
skill_trees는 길이 1 이상 20 이하인 배열입니다.
skill_trees의 원소는 스킬을 나타내는 문자열입니다.
skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다.
입출력 예
skill	skill_trees	return
"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
입출력 예 설명
BACDE: B 스킬을 배우기 전에 C 스킬을 먼저 배워야 합니다. 불가능한 스킬트립니다.
CBADF: 가능한 스킬트리입니다.
AECB: 가능한 스킬트리입니다.
BDA: B 스킬을 배우기 전에 C 스킬을 먼저 배워야 합니다. 불가능한 스킬트리입니다.
 */
public class Programmers_SkillTree {
    public static void main(String[] args) {
        /*String skill = "CBD";
        String[] skill_trees = {"BACDE","CBADF", "AECB","BDA"};
        */

        String skill = "ABED";
        String[] skill_trees = {"ABECD", "VHIED", "HEABD"};

        //// 나의 첫 번째 풀이 ////
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

        //// 다른이들의 답을 참고해 다시 푼 풀이 ////

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
