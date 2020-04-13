package com.silver.ofo.api.service;

import com.silver.ofo.domain.model.Event;
import com.silver.ofo.domain.persistence.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public ResponseEntity<List<Event>> getEvents() {
        List<Event> events = new ArrayList<>();
        events.addAll(eventRepository.getEvents());
        if (Objects.isNull(events)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    public ResponseEntity<Event> getEventById(String eventId) {
        Event event = eventRepository.getEventById(eventId);
        if (Objects.isNull(event)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(event, HttpStatus.OK);
    }
}
