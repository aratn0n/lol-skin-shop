package com.aratnon.lol.skinshop.service.summoner;

import com.aratnon.lol.skinshop.dto.mapper.SummonerDtoMapper;
import com.aratnon.lol.skinshop.dto.model.SummonerDto;
import com.aratnon.lol.skinshop.exception.UsernameNotFoundException;
import com.aratnon.lol.skinshop.exception.WrongPasswordException;
import com.aratnon.lol.skinshop.model.Summoner;
import com.aratnon.lol.skinshop.repository.SummonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;

@Component
public class SummonerServiceImpl implements SummonerService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private SummonerRepository summonerRepository;

    @Autowired
    private SummonerDtoMapper summonerDtoMapper;

    @Override
    public SummonerDto signUp(SummonerDto summonerDto) {
        Summoner summoner = summonerRepository.findByEmail(summonerDto.getEmail());
        if(summoner == null) {
            summoner = new Summoner(
                    summonerDto.getUsername(),
                    bCryptPasswordEncoder.encode(summonerDto.getPassword()),
                    summonerDto.getName(),
                    summonerDto.getEmail(),
                    BigDecimal.valueOf(1),
                    BigDecimal.valueOf(0),
                    BigDecimal.valueOf(0),
                    new ArrayList<>(),
                    new ArrayList<>()
            );
            return summonerDtoMapper.toSummonerDto(summonerRepository.save(summoner));
        }
        return null;
    }

    @Override
    public SummonerDto login(SummonerDto summonerDto) {
        Summoner summoner = summonerRepository.findByUsername(summonerDto.getUsername());
        if(summoner != null) {
            if(bCryptPasswordEncoder.matches(summonerDto.getPassword(), summoner.getPassword())) {
                return summonerDtoMapper.toSummonerDto(summoner);
            }
            else {
                throw new WrongPasswordException();
            }
        }
        else {
            throw new UsernameNotFoundException(summonerDto.getUsername());
        }
    }

    @Override
    public SummonerDto changePassword(SummonerDto summonerDto, String newPassword) {
        return null;
    }

    @Override
    public SummonerDto changeName(SummonerDto summonerDto, String newName) {
        return null;
    }

    @Override
    public SummonerDto IncreaseLevel(SummonerDto summonerDto) {
        return null;
    }

    @Override
    public SummonerDto addGold(SummonerDto summonerDto, BigDecimal gold) {
        return null;
    }

    @Override
    public SummonerDto addRp(SummonerDto summonerDto, BigDecimal rp) {
        return null;
    }
}
