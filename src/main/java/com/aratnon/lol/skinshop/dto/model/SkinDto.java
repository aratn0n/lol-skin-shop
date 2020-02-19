package com.aratnon.lol.skinshop.dto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class SkinDto {
    private String id;
    private String championId;
    private String name;
    private String splashUrl;
    private int rpPrice;
}
