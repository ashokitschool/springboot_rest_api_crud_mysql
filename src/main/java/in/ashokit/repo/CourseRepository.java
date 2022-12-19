package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
