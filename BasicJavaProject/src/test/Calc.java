package test;

public class Calc {

	private static final int _100 = 100;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArithmeticSample am = new ArithmeticSample();
		System.out.print("足し算をします\n");
		int ans = am.sum(_100, 200);
		System.out.print("答えは" + ans + "です");
	}

}
