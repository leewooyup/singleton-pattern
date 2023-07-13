package hello_java_world;

class 창구직원 {
	public int id;
	private static 창구직원 a마지막_창구직원;
	private static int lastId;
	
	static {
		a마지막_창구직원 = null;
		lastId = 0;
	}
	
	public 창구직원(int id) {
		this.id = id;
	}
	
	public static 창구직원 get창구직원() {
		if(lastId == 3) {
			return a마지막_창구직원;
		}
		int id = ++lastId;
		창구직원 a창구직원 = new 창구직원(id);
		a마지막_창구직원 = a창구직원;
		return a창구직원;
	}
	
	public void 자기소개() {
		System.out.printf("저는 %d번 창구직원입니다.\n", id);
	}
}

public class 창구직원Test {
	public static void main(String[] args) {
		창구직원[] 창구 = new 창구직원[7];
		창구[0] = 창구직원.get창구직원();
		창구[1] = 창구직원.get창구직원();
		창구[2] = 창구직원.get창구직원();
		창구[3] = 창구직원.get창구직원();
		창구[4] = 창구직원.get창구직원();
		창구[5] = 창구직원.get창구직원();
		창구[6] = 창구직원.get창구직원();
		
		for(int i = 0; i < 창구.length; i++) {
			창구[i].자기소개();
		}
	}
}
