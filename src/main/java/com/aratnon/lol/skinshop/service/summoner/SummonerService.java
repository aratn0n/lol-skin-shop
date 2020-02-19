package com.aratnon.lol.skinshop.service.summoner;

import com.aratnon.lol.skinshop.dto.model.SummonerDto;

import java.math.BigDecimal;

public interface SummonerService {

    SummonerDto signUp(SummonerDto summonerDto);
    SummonerDto login(SummonerDto summonerDto);
    SummonerDto changePassword(SummonerDto summonerDto, String newPassword);
    SummonerDto changeName(SummonerDto summonerDto, String newName);
    SummonerDto IncreaseLevel(SummonerDto summonerDto);
    SummonerDto addGold(SummonerDto summonerDto, BigDecimal gold);
    SummonerDto addRp(SummonerDto summonerDto, BigDecimal rp);

}
