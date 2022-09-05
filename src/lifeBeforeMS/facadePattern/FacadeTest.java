package lifeBeforeMS.facadePattern;

import lifeBeforeMS.facadePattern.facade.HomeTheaterFacade;
import lifeBeforeMS.facadePattern.factory.HomeTheaterFactory;

public class FacadeTest {

	public static void main(String[] args) throws InterruptedException {
		HomeTheaterFacade homeTheater = HomeTheaterFactory.getHomeTheater();
		homeTheater.watchMovie("Harry potter and the Half blood prince");
		Thread.sleep(10000);
		homeTheater.endMovie();
	}

}
