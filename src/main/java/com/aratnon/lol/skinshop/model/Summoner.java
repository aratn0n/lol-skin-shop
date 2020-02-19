package com.aratnon.lol.skinshop.model;

import lombok.*;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Summoner {
    @Id
    private String username;
    private String password;
    private String name;
    private String email;
    private BigDecimal level;
    private BigDecimal gold;
    private BigDecimal riotPoint;
    private List<String> unlockedChampion;
    private List<String> unlockedSkin;
}
