package com.aratnon.lol.skinshop.repository;

import com.aratnon.lol.skinshop.model.Summoner;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SummonerRepository extends MongoRepository<Summoner, String> {
    Summoner findByEmail(String email);
    Summoner findByUsername(String username);
    Summoner findByName(String name);
}
