package com.api.socialmedia.repository;

import com.api.socialmedia.entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event,String> {
}
