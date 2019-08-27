package pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity

public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private List<Student> studentsWhoLerning;
    private Lector lector;

    public Discipline() {
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentsWhoLerning() {
        return studentsWhoLerning;
    }

    public void setStudentsWhoLerning(List<Student> studentsWhoLerning) {
        this.studentsWhoLerning = studentsWhoLerning;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
}
