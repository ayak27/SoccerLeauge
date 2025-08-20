package com.example.SoccerLeauge.Repository;

import com.example.SoccerLeauge.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public class playerRepository {

    public void save(Player player) {


    }

    public interface PlayerRepository extends JpaRepository<Player, Long> {}

}
