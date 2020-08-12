package practice05_2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if (function.equals("앱")) {
			this.app();
		} else if (function.equals("음악")) {
			this.playMusic();
		} else {
			super.execute(function);
		}
		
	}


	public void app() {
		System.out.println("앱 실행");
	}

	@Override
	public void playMusic() {
		System.out.println("다운로드 해서 음악재생");
	}

}
