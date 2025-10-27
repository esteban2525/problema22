package controllers;

import com.example.academicevents.entities.Event;
import com.example.academicevents.services.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @PostMapping("/create")
    public Event createEvent(@RequestParam String nombre,
                             @RequestParam String fecha,
                             @RequestParam int duracion,
                             @RequestParam String modalidad) {
        return eventService.createEvent(nombre, fecha, duracion, modalidad);
    }
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
