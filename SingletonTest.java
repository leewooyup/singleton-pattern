package hello_java_world;

class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}

//new Singleton(); 외부에서 객체 생성 x

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
	}
}
