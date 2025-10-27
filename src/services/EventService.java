package services;

import com.example.academicevents.entities.Event;
import com.example.academicevents.repositories.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class EventService {
    private final EventRepository eventRepository;
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    public Event createEvent(String nombre, String fecha, int duracion, String modalidad)
    Event e = new Event(null, nombre, fecha, duracion, modalidad);
 return eventRepository.save(e);
}
public List<Event> getAllEvents() {
    return eventRepository.findAll();
}
public Optional<Event> getEventById(Long id) {
    return eventRepository.findById(id);
}
 }
