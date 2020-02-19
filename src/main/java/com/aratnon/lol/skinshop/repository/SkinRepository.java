package com.aratnon.lol.skinshop.repository;

import com.aratnon.lol.skinshop.model.Skin;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SkinRepository extends MongoRepository<Skin, String> {
    List<Skin> findByChampionId(String id);
}
