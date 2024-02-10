package com.example.course.controller;

import com.example.course.dto.CourseDto;
import com.example.course.domain.Course;
import com.example.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    
    @Autowired
    private CourseService courseService;
    
    @PostMapping("/create")
    public ResponseEntity<Course> createCourse(@RequestBody CourseDto courseDto) {
        Course course = courseService.createCourse(courseDto);
        return ResponseEntity.ok(course);
    }
    
    // Implement other endpoints (update, get) similarly
}
