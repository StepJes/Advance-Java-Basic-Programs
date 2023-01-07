package lamda;

interface AD {
	void show();

}

public class DemoLamda2 {
	public static void main(String[] args) {
		AD obj = new AD() {
			public void show() {
				System.out.println("Yo. Lamda 2 here...");
			}
		};
		obj.show();
	}
}
