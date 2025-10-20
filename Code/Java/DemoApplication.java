package com.spring_demo.coursework1;

// Imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api/people")
@CrossOrigin(origins = "*") // allows HTML/JS to access API
public class DemoApplication {

    // Arraylist to hold people
    private List<Person> people = new ArrayList<>(Arrays.asList(
        new Person(1L, "Taylor Swift", "Singer-Songwriter", 34, "taylor.jpg"),
        new Person(2L, "Chris Hemsworth", "Actor", 41, "chris.jpg"),
        new Person(3L, "Zendaya", "Actress", 28, "zendaya.jpg"),
        new Person(4L, "Elon Musk", "Entrepreneur", 53, "elon.jpg"),
        new Person(5L, "Ariana Grande", "Singer", 32, "ariana.jpg"),
        new Person(6L, "Ryan Reynolds", "Actor", 48, "ryan.jpg"),
        new Person(7L, "Emma Watson", "Actress", 35, "emma.jpg"),
        new Person(8L, "Ed Sheeran", "Musician", 34, "ed.jpg")
    ));

    @GetMapping
    public List<Person> getAllPeople() {
        return people;
    }

    // Search function
    @GetMapping("/search")
    public List<Person> searchPeople(@RequestParam String name) {
        String search = name.toLowerCase();
        return people.stream()
                .filter(p -> p.getName().toLowerCase().contains(search))
                .toList();
    }

    // Application Entry point
    @SpringBootApplication
    public class Coursework1Application {
        public static void main(String[] args) {
            SpringApplication.run(Coursework1Application.class, args);
        }
}

}