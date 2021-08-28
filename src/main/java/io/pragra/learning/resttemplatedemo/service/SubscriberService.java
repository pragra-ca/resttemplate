package io.pragra.learning.resttemplatedemo.service;

import io.pragra.learning.resttemplatedemo.domain.Subscriber;
import io.pragra.learning.resttemplatedemo.dto.SubscriberDto;
import io.pragra.learning.resttemplatedemo.mapper.SubscriberMapper;
import io.pragra.learning.resttemplatedemo.repo.EventRepo;
import io.pragra.learning.resttemplatedemo.repo.SubscriberRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
public class SubscriberService {

    private final SubscriberMapper mapper;
    private final SubscriberRepo repo;
    private final EventRepo eventRepo;

    public SubscriberDto createSubscriber(SubscriberDto dto){
        return mapper.mapToSubscriberDto(this.repo.save(mapper.mapToSubscriber(dto)));
    }

    public SubscriberDto subscribeEvent( int subId , int [] eventId){
        Optional<Subscriber> subscriber = repo.findById(subId);
        if(subscriber.isPresent()){
            Subscriber sub = subscriber.get();
            for (int id: eventId ){
                eventRepo.findById(id).ifPresent(e->sub.getEvents().add(e));
            }
            return mapper.mapToSubscriberDto(this.repo.save(sub));
        }else {
            throw new RuntimeException("Subscriber Not found");
        }


    }
}
