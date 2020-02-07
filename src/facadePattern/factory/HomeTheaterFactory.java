package facadePattern.factory;

import facadePattern.facade.HomeTheaterFacade;
import facadePattern.homeTheaterSubsystems.Amplifier;
import facadePattern.homeTheaterSubsystems.CDPlayer;
import facadePattern.homeTheaterSubsystems.DVDPlayer;
import facadePattern.homeTheaterSubsystems.PopcornPopper;
import facadePattern.homeTheaterSubsystems.Projector;
import facadePattern.homeTheaterSubsystems.Radio;
import facadePattern.homeTheaterSubsystems.Screen;
import facadePattern.homeTheaterSubsystems.TheaterLights;
import facadePattern.homeTheaterSubsystems.Tuner;

public class HomeTheaterFactory {

	public static HomeTheaterFacade getHomeTheater() {
		Amplifier amp = new Amplifier();
		CDPlayer cdPlayer = new CDPlayer();
		DVDPlayer dvdPlayer = new DVDPlayer();
		PopcornPopper popcornPopper = new PopcornPopper();
		Projector projector = new Projector();
		Radio radio = new Radio();
		Screen screen = new Screen();
		TheaterLights theaterLights = new TheaterLights();
		Tuner tuner = new Tuner();
		
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, cdPlayer, dvdPlayer, 
				popcornPopper, projector, radio, screen, theaterLights, tuner);
		return homeTheaterFacade;
	}

}
