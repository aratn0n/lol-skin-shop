package com.aratnon.lol.skinshop.controller.v1;

import com.aratnon.lol.skinshop.dto.model.SummonerDto;
import com.aratnon.lol.skinshop.service.summoner.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/summoner")
public class SummonerController {

    @Autowired
    private SummonerService summonerService;

    @GetMapping("/test")
    public SummonerDto test() {
        return new SummonerDto(
                "username",
                "password",
                "email",
                "name",
                BigDecimal.valueOf(1),
                BigDecimal.valueOf(0),
                BigDecimal.valueOf(0),
                new ArrayList<>(),
                new ArrayList<>()
        );
    }

    @GetMapping("/login")
    public SummonerDto login(@RequestBody SummonerDto summonerDto) {
        return summonerService.login(summonerDto);
    }


    @PostMapping("/signup")
    public SummonerDto signUp(@RequestBody SummonerDto summonerDto) {
        return summonerService.signUp(summonerDto);
    }
}
