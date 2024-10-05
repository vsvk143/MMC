package com.example.mmc.website.repository;

import com.example.mmc.website.model.Winner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WinnerRepository extends JpaRepository<Winner, Long> {
}
