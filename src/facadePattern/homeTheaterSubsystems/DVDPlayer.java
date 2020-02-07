package facadePattern.homeTheaterSubsystems;

public class DVDPlayer {
	private String movie;
	public void on() {
		System.out.println("FacadePattern\tDVD player is on");
	}

	public void play(String movie) {
		this.movie = movie;
		System.out.println("FacadePattern\tNow playing.... "+this.movie);
	}

	public void stop() {
		System.out.println("FacadePattern\tStopping DVD player");		
	}

	public void eject() {
		System.out.println("FacadePattern\tEjecting movie disk");
		this.movie = null;
	}

	public void off() {
		System.out.println("FacadePattern\tTurning off DVD player");
	}

}
