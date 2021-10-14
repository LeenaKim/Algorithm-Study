package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
/*
 * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)

둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.
 */
/*
 * 첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
 */
public class Order10814 {
	
	public static class Members {
		int age;
		String name;
		int order;
		
		Members(int age, String name, int order){
			this.age = age;
			this.name = name;
			this.order = order;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Members[] members = new Members[n];
		
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			String[] vars = input.split(" ");
			Members mem = new Members(Integer.parseInt(vars[0]), vars[1], i);
			members[i] = mem;
		}
		
		Arrays.sort(members, new Comparator<Members>() {

			@Override
			public int compare(Members o1, Members o2) {
				if(o1.age == o2.age) {
					return o1.order - o2.order;
				} else {
					return o1.age - o2.age;
				}
			}
		});
		
		for(Members m : members) {
			System.out.println(m.age + " " + m.name);
		}
	}
}
