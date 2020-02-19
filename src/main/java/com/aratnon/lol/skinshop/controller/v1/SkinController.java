package com.aratnon.lol.skinshop.controller.v1;

import com.aratnon.lol.skinshop.dto.model.SkinDto;
import com.aratnon.lol.skinshop.model.Skin;
import com.aratnon.lol.skinshop.service.skin.SkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/skin")
public class SkinController {

    @Autowired
    private SkinService skinService;

    @GetMapping("/test")
    public Skin getTestSkin() {
        return new Skin(
                "skin_ahri_0",
                "ahri",
                "Dynasty Ahri",
                "https://vignette.wikia.nocookie.net/leagueoflegends/images/3/36/Ahri_DynastySkin.jpg/revision/latest?cb=20181021021234",
                975
        );
    }

    @GetMapping("/champion/{championId}")
    public List<SkinDto> getAllSkinsById(@PathVariable String championId) {
        return skinService.getAllSkinsById(championId);
    }

    @PostMapping("/test")
    public SkinDto addTestSkin(@RequestBody SkinDto skinDto) {
        return skinService.addSkin(skinDto);
    }
}
