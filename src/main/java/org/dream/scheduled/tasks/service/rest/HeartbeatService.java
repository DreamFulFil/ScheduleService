package org.dream.scheduled.tasks.service.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("heartbeat")
public class HeartbeatService {

    @GetMapping("/")
    @PreAuthorize("hasAuthority('HEART')")
    public boolean alive() {
        return true;
    }
    
}
