package lifeBeforeMS.facadePattern.homeTheaterSubsystems;

public class Projector {

	public void on() {
		System.out.println("FacadePattern\tThe Projector is on");
	}

	public void wideScreenMode() {
		System.out.println("FacadePattern\tProjector wide screen mode (16x9 ratio)");		
	}

	public void off() {
		System.out.println("FacadePattern\tThe Projector is off");		
	}

}
