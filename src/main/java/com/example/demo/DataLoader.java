package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Course course;
        course = new Course("Toyota", "Camri", "It's old and brown and sad and barely runs :(", "2006");
        repository.save(course);

        course = new Course("I dont know", "any other car", "this one can be blue i guess", "2006");
        repository.save(course);

        course = new Course("Uuh another car", "Mrs Piggy", "Its awful girl", "2006");
        repository.save(course);
    }
}
