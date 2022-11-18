package group_1;

import java.util.HashMap;
import java.util.Map;

public class PrintVowels {

	public static void main(String[] args) {
		String str = "Md Arshad Ansari";
		String str1 = "Education";

		// LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		String sd = str.concat(str1);
		// System.out.println(sd);
		String tr = "";
		String[] df = sd.split(" ");
		for (int i = 0; i < df.length; i++) {

			tr = tr + df[i];

		}
		System.out.println(tr);

		for (int i = 0; i < tr.length(); i++) {
			int count = 0;
			if ((tr.charAt(i) == 'a') || (tr.charAt(i) == 'e') || (tr.charAt(i) == 'i') || (tr.charAt(i) == 'o')
					|| (tr.charAt(i) == 'u')) {
				count++;
				// System.out.println(tr.charAt(i));

			}
			if (count > 0)
				System.out.println(count + "=" + tr.charAt(i));

		}
		System.out.println("--------------------------------------");
		//sd = sd.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = sd.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				if (map.containsKey(ch[i]))
					map.put(ch[i], map.get(ch[i]) + 1);
				else
					map.put(ch[i], 1);
			}
		}
		map.forEach((key, value) -> System.out.println(key + "---->" + value));

	}

}
