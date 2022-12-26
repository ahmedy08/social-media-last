package com.api.socialmedia.service;

import com.api.socialmedia.data.request.SaveEventRequest;
import com.api.socialmedia.data.response.EventResponse;

public interface EventService {
    EventResponse save(SaveEventRequest request);

    EventResponse get(String id);
}
