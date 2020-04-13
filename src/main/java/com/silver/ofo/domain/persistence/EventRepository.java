package com.silver.ofo.domain.persistence;

import com.silver.ofo.domain.model.Event;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public class EventRepository {

    public Set<Event> getEvents() {
        return null;
    }

    public Event getEventById(String eventId) {
        Event event = new Event();
        event.setTitle("Title");
        event.setDescription("Description");
        event.setEventId(42L);
        event.setStartDate(LocalDate.now());
        event.setEndDate(LocalDate.now().plusDays(1));
        return event;
    }
}
