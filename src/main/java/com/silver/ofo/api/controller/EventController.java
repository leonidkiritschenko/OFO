package com.silver.ofo.api.controller;

import com.silver.ofo.api.service.EventService;
import com.silver.ofo.domain.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "api/events",
        produces = {"application/json"},
        method = RequestMethod.GET)
    public ResponseEntity<List<Event>> getEvents() {
        return eventService.getEvents();
    }

    @RequestMapping(value = "/api/events/{eventId}",
        produces = {"application/json"},
        method = RequestMethod.GET)
    public ResponseEntity<Event> getEventById(@PathVariable("eventId") String eventId) {
        return eventService.getEventById(eventId);
    }
}
