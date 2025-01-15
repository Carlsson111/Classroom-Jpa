package se.lexicon.classroomjpa.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.classroomjpa.models.Classroom;

@Repository
public interface ClassroomRepository extends CrudRepository<Classroom, Long>  {
}
