package services;

import com.example.academicevents.entities.Event;
import com.example.academicevents.entities.Student;
import com.example.academicevents.repositories.EventRepository;
import com.example.academicevents.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class EnrollmentService {
    private final EventRepository eventRepository;
    private final StudentRepository studentRepository;
    public EnrollmentService(EventRepository eventRepository, StudentRepository studentRe
        this.eventRepository = eventRepository;
        this.studentRepository = studentRepository;
}
public String enrollStudentToEvent(Long studentId, Long eventId) {
    Optional<Student> studentOpt = studentRepository.findById(studentId);
    Optional<Event> eventOpt = eventRepository.findById(eventId);
    if (studentOpt.isEmpty()) return "Estudiante no encontrado";
    if (eventOpt.isEmpty()) return "Evento no encontrado";
    Student student = studentOpt.get();
    Event event = eventOpt.get();
    if (!student.getEventIds().contains(eventId)) {
        student.getEventIds().add(eventId);
        studentRepository.save(student);
    }
    if (!event.getStudentIds().contains(studentId)) {
        event.getStudentIds().add(studentId);
        eventRepository.save(event);
    }
    return "Inscripción exitosa";
}
public List<Event> getEventsForStudent(Long studentId) {
    Optional<Student> studentOpt = studentRepository.findById(studentId);
    if (studentOpt.isEmpty()) return new ArrayList<>();
    Student student = studentOpt.get();
    List<Event> events = new ArrayList<>();
    for (Long eventId : student.getEventIds()) {
        eventRepository.findById(eventId).ifPresent(events::add);
        C. EnrollmentService.java
    }
    return events;
}
 }
