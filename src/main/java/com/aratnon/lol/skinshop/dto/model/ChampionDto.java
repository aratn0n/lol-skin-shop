package com.aratnon.lol.skinshop.dto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ChampionDto {
    private String id;
    private String name;
    private int goldPrice;
    private int rpPrice;
}
