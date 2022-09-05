package lifeBeforeMS.facadePattern.factory;

import lifeBeforeMS.facadePattern.facade.HomeTheaterFacade;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Amplifier;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.CDPlayer;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.DVDPlayer;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.PopcornPopper;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Projector;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Radio;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Screen;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.TheaterLights;
import lifeBeforeMS.facadePattern.homeTheaterSubsystems.Tuner;

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
