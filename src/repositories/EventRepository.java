package repositories;

import com.example.academicevents.entities.Event;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class EventRepository {
    private final List<Event> data = new ArrayList<>();
    private long nextId = 1L;
    public Event save(Event e) {
        if (e.getId() == null) {
            e.setId(nextId++);
            data.add(e);
        } else {
            for (int i = 0; i < data.size(); i++) {
            }
        }
        return e;
    }
 if (data.get(i).getId().equals(e.getId())) {
        data.set(i, e);
    }
    public List<Event> findAll() {
        return new ArrayList<>(data);
    }
    public Optional<Event> findById(Long id) {
        return data.stream().filter(e -> e.getId().equals(id)).findFirst();
    }
}