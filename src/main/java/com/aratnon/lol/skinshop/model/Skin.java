package com.aratnon.lol.skinshop.model;

import lombok.*;

import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skin {
    @Id
    private String id;
    private String championId;
    private String name;
    private String splashUrl;
    private int rpPrice;
}
