package se.lexicon.classroomjpa.Repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.classroomjpa.models.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
