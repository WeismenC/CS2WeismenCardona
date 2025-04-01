package app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import app.adapters.inputs.LoginInput;

@SpringBootApplication
@ComponentScan(basePackages = "app")
@EnableJpaRepositories(basePackages = "app.adapters")
public class VeterinaryApplication implements CommandLineRunner {

    @Autowired
    private LoginInput loginInput;

    @Override
    public void run(String... args) throws Exception {
        loginInput.menu();
    }

    public static void main(String[] args) {
        SpringApplication.run(VeterinaryApplication.class, args);
    }
}
