package commandPattern;

public class CommandPatternTest {

	public static void main(String[] args) {
		RemoteControl rc = RemoteLoader.getRemoteController();
		System.out.println(rc);
		rc.onButtonPushed(5);
		rc.onButtonPushed(1);
		rc.offButtonPushed(5);
	}

}
