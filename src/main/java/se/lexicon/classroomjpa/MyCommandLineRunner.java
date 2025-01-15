package se.lexicon.classroomjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.classroomjpa.Repository.ClassroomRepository;
import se.lexicon.classroomjpa.Repository.TeacherRepository;
import se.lexicon.classroomjpa.models.Classroom;
import se.lexicon.classroomjpa.models.Teacher;

import java.time.LocalDate;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    public MyCommandLineRunner(ClassroomRepository classroomRepository, TeacherRepository teacherRepository) {
        this.classroomRepository = classroomRepository;
        this.teacherRepository = teacherRepository;
    }
    TeacherRepository teacherRepository;
    ClassroomRepository classroomRepository;


    @Override
    public void run(String... args) throws Exception {

        //Creat Classroom
        Classroom classroom = new Classroom("Java 1337",15);
        classroomRepository.save(classroom);

        //Creat Teacher
        Teacher teacher1 = new Teacher("Simon Elbrink ","Java-Jpa ",LocalDate.now(),classroom);
        teacherRepository.save(teacher1);

        Teacher teacher2 = new Teacher("Mehrdad Javan","Java-Fundamentals ",LocalDate.now(),classroom);
        teacherRepository.save(teacher2);


    




    }
}


