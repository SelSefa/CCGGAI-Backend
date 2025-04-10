package CCGGAI.bau.project.backend_CCGGAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "CCGGAI.bau.project.model")
@EnableJpaRepositories(basePackages = "CCGGAI.bau.project.repository")
public class BackendCcggaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendCcggaiApplication.class, args);
    }
}
