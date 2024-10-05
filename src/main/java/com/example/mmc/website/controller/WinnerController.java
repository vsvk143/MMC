package com.example.mmc.website.controller;

import com.example.mmc.website.model.Winner;
import com.example.mmc.website.repository.WinnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/winners")
public class WinnerController {

    @Autowired
    private WinnerRepository winnerRepository;

    // GET: Retrieve all winners
    @GetMapping
    public List<Winner> getAllWinners() {
        return winnerRepository.findAll();
    }

    // POST: Add a new winner
    @PostMapping
    public Winner addWinner(@RequestBody Winner winner) {
        return winnerRepository.save(winner);
    }
}

