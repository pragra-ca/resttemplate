package io.pragra.learning.resttemplatedemo.mapper;

import io.pragra.learning.resttemplatedemo.domain.PEvent;
import io.pragra.learning.resttemplatedemo.domain.Subscriber;
import io.pragra.learning.resttemplatedemo.dto.SubscriberDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class SubscriberMapper {
    public Subscriber mapToSubscriber(SubscriberDto dto){
        return Subscriber.builder().fullName(dto.getFullName()).build();
    }

    public SubscriberDto mapToSubscriberDto(Subscriber subscriber){
        return
                SubscriberDto.builder()
                        .id(subscriber.getId())
                        .fullName(subscriber.getFullName())
                        .eventIds(subscriber.getEvents().stream().map(PEvent::getEventId).collect(Collectors.toList()))
                        .build();
    }
}
