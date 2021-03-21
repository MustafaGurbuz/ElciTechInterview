package kodzamani.elci;

import kodzamani.elci.model.User;
import kodzamani.elci.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class AllData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;


    @Override
    public void run(String... args) throws Exception {
        this.userRepo.save(new User("Laptop Bozuk","En kısa sürede tamir edilmeli",1));
    }
}
