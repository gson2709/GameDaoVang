package com.example.thuctapxuong.dao;

import com.example.thuctapxuong.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterDao extends JpaRepository<Character, Integer> {
}
