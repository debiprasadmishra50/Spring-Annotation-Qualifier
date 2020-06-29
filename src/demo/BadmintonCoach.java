package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
//	@Qualifier("randomFortuneService")
//	@Qualifier("databaseFortuneService")
//	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	/*
	 * If we wanna use the @Qualifier with constructor injection then we have to place @Qualifier annotation inside the constructor argument
	 * Comment the @Autowired and all @Qualifier above

	@Autowired
	public BadmintonCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	*/
	
	@Override
	public String getDailyWorkout() {
		return "In BadmintonCoach : Practice Badminton smash 2 hours a day";
	}

	@Override
	public String getDailyFortune() {
		return "In BadmintonCoach : "+fortuneService.getFortune();
	}

}
