package se.lexicon.classroomjpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDate;

@Data
@Getter
@Setter
@ToString
@Entity (name = "Teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String name;


    @Column(nullable = false,length = 100)
    private String subject;


    @Column(nullable = false)
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;


    public Teacher() {
    }

    public Teacher(String name,String subject, LocalDate hireDate,Classroom classroom) {
        this.name = name;
        this.subject = subject;
        this.hireDate = hireDate;
        this.classroom = classroom;
    }

    public Teacher(Long id, String name, String subject, LocalDate hireDate, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.hireDate = hireDate;
        this.classroom = classroom;
    }
}
