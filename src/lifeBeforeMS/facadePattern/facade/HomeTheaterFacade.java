package lifeBeforeMS.facadePattern.facade;


import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Amplifier;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.CDPlayer;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.DVDPlayer;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.PopcornPopper;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Projector;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Radio;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Screen;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.TheaterLights;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Tuner;

public class HomeTheaterFacade {
	private boolean homeTheaterIsOn = false;
	private Amplifier amp;
	private CDPlayer cdPlayer;
	private DVDPlayer dvdPlayer;
	private PopcornPopper popcornPopper;
	private Projector projector;
	private Radio radio;
	private Screen screen;
	private TheaterLights theaterLights;
	private Tuner tuner;
	
	public HomeTheaterFacade(Amplifier amp, CDPlayer cdPlayer, DVDPlayer dvdPlayer,
							PopcornPopper popcornPopper, Projector projector, Radio radio,
							Screen screen, TheaterLights theaterLights, Tuner tuner) {
		
		this.amp = amp;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
		this.popcornPopper = popcornPopper;
		this.projector = projector;
		this.radio = radio;
		this.screen = screen;
		this.theaterLights = theaterLights;
		this.tuner = tuner;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch movie......");
		popcornPopper.on();
		popcornPopper.pop();
		theaterLights.dim(2);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvdPlayer(dvdPlayer);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
		homeTheaterIsOn = true;
	}

	public void endMovie() {
		if(!homeTheaterIsOn) {
			System.out.println("Hometheater was already off");
			return;
		}
		System.out.println("Shutting movie theater down....");
		popcornPopper.off();
		theaterLights.on();
		projector.off();
		screen.up();
		amp.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
		homeTheaterIsOn = false;
	}
	
	public void listenToCD() {
		
	}
	
	public void endCD() {
		
	}
	
	public void listenToRadio() {
		
	}
	
	public void endRadio() {
		
	}
}
