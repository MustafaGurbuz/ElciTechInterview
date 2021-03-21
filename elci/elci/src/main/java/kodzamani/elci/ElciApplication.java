package kodzamani.elci;

import kodzamani.elci.model.User;
import kodzamani.elci.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElciApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElciApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;



	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Laptop Bozuk","En kısa sürede tamir edilmeli",1));
	}
}
