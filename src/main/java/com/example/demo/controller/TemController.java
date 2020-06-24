package com.example.demo.controller;

import com.example.demo.dto.TeamDto;
import com.example.demo.entity.TeamEntity;
import com.example.demo.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@AllArgsConstructor
@Controller
public class TemController {

    private TeamRepository teamRepository;

    @PostMapping(value = "/team")
    public void add(@RequestBody TeamDto teamDto) {
        teamRepository.save(new TeamEntity(teamDto));
    }

    @GetMapping(value = "team/{id}")
    @ResponseBody
    public TeamDto get(@PathVariable Integer id) {
        return new TeamDto(teamRepository.getOne(id));
    }
}
