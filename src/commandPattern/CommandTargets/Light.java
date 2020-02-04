package commandPattern.CommandTargets;

public class Light {
	private String type;
	
	public Light(String type) {
		this.type = type;
	}
	public void on() {
		System.out.println(this.type+" on");
	}
	public void off() {
		System.out.println(this.type+" off");
	}
}
