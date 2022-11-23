import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> userMap = new HashMap<>();
		userMap.put("田中", "suicaを使って2000円払った。");
		userMap.put("鈴木", "iDを使って1500円払った。");
		userMap.put("佐藤", "Visaを使って5000円払った。");

		List<String> userList = new ArrayList<>();
		userList.add("田中");
		userList.add("鈴木");
		userList.add("佐藤");
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i) + "は" + userMap.get(userList.get(i)));
		}
		userList.add("池田");

		try {
			System.out.println("userList更新後に再処理");
			for (int i = 0; i < userList.size(); i++) {
				System.out.println(userList.get(i) + "は" + userMap.get(userList.get(i)));
			}
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("userListに存在しない人がいます。");
		} finally {
			System.out.println("実際のリストは" + userMap.keySet() + "です。");
		}
	}
}
