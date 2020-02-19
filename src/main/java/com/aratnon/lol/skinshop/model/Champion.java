package com.aratnon.lol.skinshop.model;

import lombok.*;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Champion {
    @Id
    private String id;
    private String name;
    private int goldPrice;
    private int rpPrice;
    private List<Skin> skins;
}
