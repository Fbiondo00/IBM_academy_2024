package com.sistemi.informativi.repository;

import com.sistemi.informativi.document.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}
