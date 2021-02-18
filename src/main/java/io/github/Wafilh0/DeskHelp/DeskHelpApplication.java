package io.github.Wafilh0.DeskHelp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import io.github.Wafilh0.DeskHelp.api.entity.User;
import io.github.Wafilh0.DeskHelp.api.enums.ProfileEnum;
import io.github.Wafilh0.DeskHelp.api.repository.UserRepository;

@SpringBootApplication
public class DeskHelpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeskHelpApplication.class, args);
	}

	@Bean
    CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            initUsers(userRepository, passwordEncoder);
        };

    }
    
	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        User admin = new User();
        admin.setEmail("admin@deskhelp.com");
        admin.setPassword(passwordEncoder.encode("123456"));
        admin.setProfile(ProfileEnum.ROLE_ADMIN);

        User find = userRepository.findByEmail("admin@deskhelp.com");
        if (find == null) {
            userRepository.save(admin);
        }
    }
}
