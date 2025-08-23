package com.yes2aamu.yes2aamursvp.controller;

import com.yes2aamu.yes2aamursvp.EmailService;
import com.yes2aamu.yes2aamursvp.entity.RSVPRequest;
import com.yes2aamu.yes2aamursvp.modal.RSVPRequestDTO;
import com.yes2aamu.yes2aamursvp.repository.RSVPRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RSVPController {
  @Autowired
  private RSVPRepository repo;
  @Autowired
  private EmailService emailService;

  @PostMapping("/rsvp")
  public String submit(@RequestBody RSVPRequestDTO r) {
    log.info("Received RSVP submission: {}", r);
    // Convert DTO to Entity
    RSVPRequest entity = RSVPRequest.builder()
        .name(r.getName())
        .events(r.getEvents())
        .attendees(r.getAttendees())
        .accommodation(r.getAccommodation())
        .build();

    repo.save(entity);
//    emailService.sendNotification(entity);

    return "OK";
  }


  @GetMapping("/count")
  public long totalCount() {
    return repo.count();
  }
}
