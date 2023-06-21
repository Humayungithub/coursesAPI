package com.poc.coursesapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Spring", "Ranga Karanam"),
                new Course(2, "Learn Spring-Boot", "Ranga Karanam"),
                new Course(3, "Learn Microservices", "Frank P Moley"),
                new Course(4, "Learn DevOps", "Azure"),
                new Course(5, "Project Management", "Bonnie Biafore")
        );
    }
}
