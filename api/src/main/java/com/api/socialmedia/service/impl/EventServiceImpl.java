package com.api.socialmedia.service.impl;

import com.api.socialmedia.data.request.SaveEventRequest;
import com.api.socialmedia.data.response.EventResponse;
import com.api.socialmedia.entity.Event;
import com.api.socialmedia.repository.EventRepository;
import com.api.socialmedia.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;


    @Override
    public EventResponse save(SaveEventRequest request) {
        Event saved = eventRepository.save(request.toEntity());
        return saved.toResponse();
    }

    @Override
    public EventResponse get(String id) {
        Optional<Event> byId = eventRepository.findById(id);

        if (byId.isEmpty()) {
            throw new RuntimeException("böyle bir data yok");
        }

        return byId.get().toResponse();
    }
}
