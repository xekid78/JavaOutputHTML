/**
 *
 * @author xekid78
 *
 */
public class Html {

	public static void main(String[] args) {
		String[] kanto = {"東京都","茨木県","栃木県","群馬県","埼玉県","千葉県","神奈川県"};
		System.out.println("<select name='area'>");
		for (int i = 0; i < 7; i++) {
			System.out.println("<option>" + kanto[i] + "</option>");
		}
		System.out.println("</select>");

	}

}
