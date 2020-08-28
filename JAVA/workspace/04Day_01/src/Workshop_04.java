
public class Workshop_04 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= 6; j++) {
				if ((i + j) == 6)
					System.out.println(i + "+" + j + "=" + (i + j));
			}
		}

	}

}