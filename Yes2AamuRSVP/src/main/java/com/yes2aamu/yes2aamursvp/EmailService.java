package com.yes2aamu.yes2aamursvp;

import com.yes2aamu.yes2aamursvp.entity.RSVPRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

  @Service
  public class EmailService {
    @Autowired
    JavaMailSender mailSender;

    public void sendNotification(RSVPRequest r) {
      SimpleMailMessage msg = new SimpleMailMessage();
      msg.setTo("host@gmail.com");
      msg.setSubject("New RSVP");
      msg.setText("Name: " + r.getName() +
          "\nEvents: " + r.getEvents() +
          "\nAttendees: " + r.getAttendees() +
          "\nAccommodation: " + r.getAccommodation());
      mailSender.send(msg);
    }
  }
