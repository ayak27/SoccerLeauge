package com.example.SoccerLeauge.Controller;

import com.example.SoccerLeauge.Service.playerService;
//import com.example.SoccerLeauge.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class playerController {

    @Autowired
    private playerService playerService;

    @PostMapping("/players")
    public ResponseEntity<String> addPlayer(
            @RequestParam String name,
            @RequestParam String position,
            @RequestParam MultipartFile photo) throws Exception {

        playerService.savePlayer(name, position, photo);
        return ResponseEntity.ok("Player saved!");
    }
}