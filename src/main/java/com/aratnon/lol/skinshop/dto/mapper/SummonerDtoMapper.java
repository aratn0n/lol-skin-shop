package com.aratnon.lol.skinshop.dto.mapper;

import com.aratnon.lol.skinshop.dto.model.SummonerDto;
import com.aratnon.lol.skinshop.model.Summoner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;

@Component
public class SummonerDtoMapper {
    public SummonerDto toSummonerDto(Summoner summoner) {
        return new SummonerDto(
                summoner.getUsername(),
                summoner.getPassword(),
                summoner.getName(),
                summoner.getEmail(),
                summoner.getLevel(),
                summoner.getGold(),
                summoner.getRiotPoint(),
                new ArrayList<>(),
                new ArrayList<>()
        );
    }
}
