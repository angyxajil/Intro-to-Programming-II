package exercise;

import java.util.Random;

public class WiseSaying {

	private Random random = new Random();

		String result[] = {"As I see it,\n     yes", "Ask again\n    later.", "   Better not\n tell you now.",
				"\nCannot\n predict\n  now.", "Concentrate and\n     ask again.", "Don’t count\n     on it.", 
				"It is certain.", "	It is \ndecidedly so.", "Most likely.", "My reply is no.", 
				"My sources\n   say no.", "Outlook not\n  so good.", "Outlook good.", "Reply hazy,\n  try again.", 
				"Signs point\n    to yes.", "Very doubtful.", "Without a doubt.", "Yes.", 
				"Yes – definitely.", "You may\nrely on it."};
		
		public String getRandomSaying() {
			
			int rand = random.nextInt(result.length);
			
			//System.out.println("response randomized");			
			return result[rand];
	}
}
