package com.aratnon.lol.skinshop.dto.mapper;

import com.aratnon.lol.skinshop.dto.model.SkinDto;
import com.aratnon.lol.skinshop.model.Skin;
import org.springframework.stereotype.Component;

@Component
public class SkinDtoMapper {
    public SkinDto toSkinDto(Skin skin) {
        return new SkinDto(
                skin.getId(),
                skin.getChampionId(),
                skin.getName(),
                skin.getSplashUrl(),
                skin.getRpPrice()
        );
    }
}
