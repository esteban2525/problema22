package services;

import com.example.academicevents.entities.Student;
import com.example.academicevents.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(String nombre, String email, String codigo) {
        Student s = new Student(null, nombre, email, codigo);
        return studentRepository.save(s);
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
}
