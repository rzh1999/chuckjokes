package bill.guru.springframework.chuckjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChuckjokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckjokesApplication.class, args);
        System.out.println("Testing Chuck Jokes App");
    }

}
