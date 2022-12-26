package com.api.socialmedia.data.response;

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
public class EventResponse implements Serializable {

    private static final long serialVersionUID = -3944487666227768740L;

    private String id;
    private String name;
    private String owner;
    private Instant eventDate;
}
