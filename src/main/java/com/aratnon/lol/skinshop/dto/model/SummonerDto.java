package com.aratnon.lol.skinshop.dto.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SummonerDto {
    private String username;
    private String password;
    private String email;
    private String name;
    private BigDecimal level;
    private BigDecimal gold;
    private BigDecimal rpPoint;
    private List<ChampionDto> unlockedChampion;
    private List<SkinDto> unlockedSkin;
}
