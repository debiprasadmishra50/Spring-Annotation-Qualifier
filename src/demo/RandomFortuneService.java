package demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create a random array of Strings
	private String [] fortune = {
		"Beware of wolf in sheep's clothing",
		"Diligence is mother of good luck",
		"The journey is the reward"
	};
	
	// Create Random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		// Pick one random fortune from the array
		int no = random.nextInt(fortune.length);
		String randomFortune = fortune[no];
		
		return "RandomFortuneService : "+randomFortune;
	}

}
