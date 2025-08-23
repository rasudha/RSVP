package com.yes2aamu.yes2aamursvp.repository;

import com.yes2aamu.yes2aamursvp.entity.RSVPRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RSVPRepository extends JpaRepository<RSVPRequest, Long> { }
