package lifeBeforeMS.facadePattern.homeTheaterSubsystems;

public class Amplifier {
	private int volume;
	private DVDPlayer dvdPlayer;
	public void on() {
		System.out.println("FacadePattern\tTurning on the amp");
	}

	public void setDvdPlayer(DVDPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
		System.out.println("FacadePattern\tDVD player is set");		
	}

	public void setSurroundSound() {
		System.out.println("FacadePattern\tAmps Surroundsound activated");		
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("FacadePattern\tAmps volume is set to "+this.volume);
	}

	public void off() {
		System.out.println("FacadePattern\tTurning off amp");		
	}

}
