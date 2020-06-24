package com.example.demo.dto;

import com.example.demo.entity.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {

    private String name;
    private String city;

    public TeamDto(TeamEntity teamEntity) {
        this.name = teamEntity.getName();
        this.city = teamEntity.getCity();
    }
}
