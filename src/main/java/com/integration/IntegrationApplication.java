package com.integration;

import com.integration.primary.repositories.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = ElasticsearchDataAutoConfiguration.class)
@RestController
public class IntegrationApplication {

    @Autowired
    private UserRepository userRepository;

  /*  @PostConstruct
    public void addData2DB() {
        userRepository.saveAll(Stream.of(new User(744, "John"), new User(455, "Pitter")).collect(Collectors.toList()));
        bookRepository.saveAll(
                Stream.of(new Book(111, "Core Java"), new Book(222, "Spring Boot")).collect(Collectors.toList()));
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
*/
    public static void main(String[] args) {
        SpringApplication.run(IntegrationApplication.class, args);
    }

}

