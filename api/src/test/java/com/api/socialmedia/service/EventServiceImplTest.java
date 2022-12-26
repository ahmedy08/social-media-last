package com.api.socialmedia.service;

import com.api.socialmedia.data.request.SaveEventRequest;
import com.api.socialmedia.data.response.EventResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EventServiceImplTest {

    @Autowired
    private EventService eventService;

    @Test
    void eventShouldBeSaved() {
        // given
        SaveEventRequest request = SaveEventRequest.builder().name("test").build();

        // when
        EventResponse actual = eventService.save(request);

        // then
        assertNotNull(actual.getId());
        assertEquals(actual.getName(), request.getName());

    }

    @Test
    void eventShouldBeFetched() {
        // given
        SaveEventRequest request = SaveEventRequest.builder().name("test").build();
        EventResponse expected = eventService.save(request);

        // when
        EventResponse actual = eventService.get(expected.getId());

        // then
        assertNotNull(actual.getId());
        assertEquals(actual.getName(), request.getName());

    }

}
