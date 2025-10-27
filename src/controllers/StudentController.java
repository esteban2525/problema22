package controllers;

import com.example.academicevents.entities.Event;
import com.example.academicevents.entities.Student;
import com.example.academicevents.services.EnrollmentService;
import com.example.academicevents.services.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    private final EnrollmentService enrollmentService;
    public StudentController(StudentService studentService, EnrollmentService enrollmentS
        this.studentService = studentService;
        this.enrollmentService = enrollmentService;
}
@PostMapping("/create")
public Student createStudent(@RequestParam String nombre,
                             @RequestParam String email,
                             @RequestParam String codigo) {
    return studentService.createStudent(nombre, email, codigo);
}
@GetMapping
public List<Student> getAllStudents() {
    return studentService.getAllStudents();
}
B. StudentController.java
@PostMapping("/{studentId}/enroll/{eventId}")
public String enrollStudent(@PathVariable Long studentId, @PathVariable Long eventId)
 return enrollmentService.enrollStudentToEvent(studentId, eventId);
 }
@GetMapping("/{studentId}/events")
public List<Event> getStudentEvents(@PathVariable Long studentId) {
    return enrollmentService.getEventsForStudent(studentId);
}
 }