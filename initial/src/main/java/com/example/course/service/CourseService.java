package com.example.course.service;

import com.example.course.dto.CourseDto;
import com.example.course.domain.Course;
import com.example.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;
    
    public Course createCourse(CourseDto courseDto) {
        Course course = convertDtoToEntity(courseDto);
        return courseRepository.save(course);
    }
    
    // Implement other service methods (update, get) similarly
    
    private Course convertDtoToEntity(CourseDto courseDto) {
        Course course = new Course();
        course.setName(courseDto.getName());
        course.setSubject(courseDto.getSubject());
        course.setChapters(courseDto.getChapters());
        course.setNumberOfClasses(courseDto.getNumberOfClasses());
        course.setType(courseDto.getType());
        course.setLearnMode(courseDto.getLearnMode());
        return course;
    }
}
