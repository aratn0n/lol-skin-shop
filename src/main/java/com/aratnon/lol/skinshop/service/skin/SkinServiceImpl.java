package com.aratnon.lol.skinshop.service.skin;

import com.aratnon.lol.skinshop.dto.mapper.SkinDtoMapper;
import com.aratnon.lol.skinshop.dto.model.SkinDto;
import com.aratnon.lol.skinshop.model.Skin;
import com.aratnon.lol.skinshop.repository.SkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Component
public class SkinServiceImpl implements SkinService {

    @Autowired
    private SkinRepository skinRepository;

    @Autowired
    private SkinDtoMapper skinDtoMapper;

    @Override
    public SkinDto addSkin(SkinDto skinDto) {
        Skin skin = new Skin(
                skinDto.getId(),
                skinDto.getChampionId(),
                skinDto.getName(),
                skinDto.getSplashUrl(),
                skinDto.getRpPrice()
        );
        return skinDtoMapper.toSkinDto(skinRepository.save(skin));
    }

    @Override
    public List<SkinDto> getAllSkinsById(String id) {
        List<SkinDto> skinDtos = new ArrayList<>();
        List<Skin> skins = skinRepository.findByChampionId(id);

        for (Skin skin: skins) {
            skinDtos.add(skinDtoMapper.toSkinDto(skin));
        }

        return skinDtos;
    }
}
