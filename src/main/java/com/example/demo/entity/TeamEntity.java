package com.example.demo.entity;


import com.example.demo.dto.TeamDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    public TeamEntity(TeamDto teamDto) {
        this.name = teamDto.getName();
        this.city = teamDto.getCity();
    }
}
