package com.Spring.ExamCheatingDetection.Repository;

import com.Spring.ExamCheatingDetection.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}
