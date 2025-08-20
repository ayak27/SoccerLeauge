package com.example.SoccerLeauge.Service;

import com.example.SoccerLeauge.Model.Player;
import com.example.SoccerLeauge.Repository.playerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class playerService {

    @Autowired
    private playerRepository playerRepo;

    public void savePlayer(String name, String position, MultipartFile photo) throws IOException {
        String folder = "uploads/";
        File dir = new File(folder);
        if (!dir.exists()) dir.mkdirs();

        String filename = System.currentTimeMillis() + "_" + photo.getOriginalFilename();
        File dest = new File(folder + filename);
        photo.transferTo(dest);

        Player player = new Player();
        player.setName(name);
        player.setPosition(position);
        player.setPhotoPath(dest.getPath());

        playerRepo.save(player);
    }
}

