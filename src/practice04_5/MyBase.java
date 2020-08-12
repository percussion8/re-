package practice04_5;

/*
 * 1. Base 클래스 상속받으세요
 * 2. 메서드 오버라이딩을 사용하세요 
 */

public class MyBase extends Base {

	@Override
	public void service(String state) {
		if (state.equals("낮")) {
			this.day();
		} else if (state.equals("밤")) {
			super.service(state);
		} else if (state.equals("오후")) {
			this.afternoon();
		}
	}

	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}

}
