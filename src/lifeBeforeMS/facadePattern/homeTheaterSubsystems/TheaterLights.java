package lifeBeforeMS.facadePattern.homeTheaterSubsystems;

public class TheaterLights {
	int brightness = 10;
	public void dim(int brightness) {
		this.brightness = brightness;
		System.out.println("FacadePattern\tDimming light brightness to "+ brightness);				
	}

	public void on() {
		System.out.println("FacadePattern\tTuring on lights with regular brightness");
		this.brightness = 10;
	}

}
