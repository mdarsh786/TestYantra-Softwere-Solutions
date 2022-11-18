package Programs;

public class LowerToCapital {
	public static void main(String[] args) {
		String str = "my name is ankur";
		String[] st = str.split(" ");
		String newS = "";
		for (int i = 0; i < st.length; i++) {
			String s = lowerToCapital(st[i]);
			newS = newS + s;
		}
		System.out.println(newS);

	}

	public static String lowerToCapital(String str) {
		char[] ch = str.toCharArray();
		String st = " ";
		for (int i = 0; i < ch.length; i++) {
			if (i == 0) {
				st = st + (char) (ch[i] - 32);
			} else
				st = st + ch[i];
		}
		return st;
	}

}
