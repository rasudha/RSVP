package com.yes2aamu.yes2aamursvp.modal;

import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RSVPRequestDTO {

    private String name;
    private String response;
    private List<String> events;
    private String accommodation;
    private int attendees;

  }
