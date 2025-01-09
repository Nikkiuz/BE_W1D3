package Exercise2;

public class test_sim {
	public static void main(String[] args) {
		Sim mySim = new Sim("393123456", 10.5);
		mySim
			.chiama("333123123", 500)
			.chiama("444333211", 350)
			.chiama("555444333", 320);
		System.out.println(mySim);

	}
}
