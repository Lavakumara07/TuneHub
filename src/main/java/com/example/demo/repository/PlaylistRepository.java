package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitis.Playlist;

public interface PlaylistRepository  extends JpaRepository<Playlist, Integer>{

}
