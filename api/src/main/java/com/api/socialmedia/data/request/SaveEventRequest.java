package com.api.socialmedia.data.request;

import com.api.socialmedia.entity.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveEventRequest implements Serializable {

    private static final long serialVersionUID = 6463156788218718516L;

    private String name;
    private String owner;
    private Instant eventDate;


    public Event toEntity() {
        return Event.builder().name(name).owner(owner).eventDate(eventDate).build();
    }
}
