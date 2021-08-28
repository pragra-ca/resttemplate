package io.pragra.learning.resttemplatedemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
public class PEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eventId;

    private Date eventDate;

    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Temporal(TemporalType.TIME)
    private Date endTime;

    private EventStatus status;

    private Long subsCount;

    private String city;
    private String country;


}
