package repositories;

import com.example.academicevents.entities.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class StudentRepository {
    private final List<Student> data = new ArrayList<>();
    private long nextId = 1L;
    public Student save(Student s) {
        if (s.getId() == null) {
            s.setId(nextId++);
            data.add(s);
        } else {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getId().equals(s.getId())) {
                    data.set(i, s);
                }
            }
        }
        return s;
    }
    public List<Student> findAll() {
        return new ArrayList<>(data);
    }
    public Optional<Student> findById(Long id) {
        return data.stream().filter(s -> s.getId().equals(id)).findFirst();
    }
}