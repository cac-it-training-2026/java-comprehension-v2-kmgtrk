package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		Member data = new Member();

		data.showMember();

		//		data.setName("null");
		//		data.setAge(0);
		//		data.setRank(0);

		Member data1 = new Member("Miura Manabu", 28, 2);

		data1.showMember();

	}

}
