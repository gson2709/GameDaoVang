package com.example.thuctapxuong.dao;

import com.example.thuctapxuong.entity.PlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerInfoDao extends JpaRepository<PlayerInfo, Integer> {
}
