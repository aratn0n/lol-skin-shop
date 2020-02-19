package com.aratnon.lol.skinshop.controller.v1;

import com.aratnon.lol.skinshop.dto.model.ChampionDto;
import com.aratnon.lol.skinshop.model.Champion;
import com.aratnon.lol.skinshop.model.Skin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/champion")
public class ChampionController {

    @GetMapping("/test")
    public Champion getTestChampion() {
        return new Champion(
                "Ahri",
                "Ahri",
                4800,
                450,
                new ArrayList<>()
        );
    }
}
