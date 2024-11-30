package com.example.thuctapxuong.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "player_information")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class PlayerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer highestScore = 0;
    private Integer numberOfTurns = 6;
    private Integer currentTurns = 0;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "characterId")
    private Character character;
}
