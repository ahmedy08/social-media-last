package com.api.socialmedia.entity;


import com.api.socialmedia.data.response.EventResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "s_event")
public class Event extends BaseEntity {
    private static final long serialVersionUID = -8335020847869052244L;

    @Min(5)
    @Column(name = "event_name")
    private String name;

    @NotNull
    @Column(name = "event_date")
    private Instant eventDate;

    @NotNull
    @Column(name = "event_owner")
    private String owner;

    @Column(name = "photo_file_id")
    private String photoFileId;

    public EventResponse toResponse() {
        return EventResponse.builder().id(id).name(name).owner(owner).eventDate(eventDate).build();
    }

}
