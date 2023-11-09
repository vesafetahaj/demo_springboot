package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commmandLineRunner(StudentRepository repository){
        return args -> {
            Student vesa = new Student(
                    "Vesa",
                    "vesafetahaj2@gmail.com",
                    LocalDate.of(2004, Month.JUNE,30),
                    19);
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2002, Month.JUNE,1),
                    22);
            repository.saveAll(List.of(vesa,alex));
        };
    }
}

