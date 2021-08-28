package io.pragra.learning.resttemplatedemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class SubscriberDto {
    private Integer id;
    private String fullName;
    private List<Integer> eventIds;
}
