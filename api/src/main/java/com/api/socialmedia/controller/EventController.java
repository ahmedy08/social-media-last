package com.api.socialmedia.controller;

import com.api.socialmedia.data.request.SaveEventRequest;
import com.api.socialmedia.data.response.EventResponse;
import com.api.socialmedia.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/event")
public class EventController {

    private final EventService service;

    /*
     * @RequestBody
     * @PathVariable
     * @RequestParam
     * */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EventResponse> saveEvent(@RequestBody SaveEventRequest request) {
        EventResponse response = service.save(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EventResponse> getEvent(@RequestParam("id") String id) {
        EventResponse response = service.get(id);
        return ResponseEntity.ok(response);
    }

    // TODO
    // @DeleteMapping -> silme
    // @GetMapping -> Tüm eventleri listeleme
}
