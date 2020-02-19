package com.aratnon.lol.skinshop.service.skin;

import com.aratnon.lol.skinshop.dto.model.SkinDto;

import java.util.List;

public interface SkinService {
    SkinDto addSkin(SkinDto skinDto);
    List<SkinDto> getAllSkinsById(String id);
}
