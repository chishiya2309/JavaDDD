package com.xxxx.ddd.infrastructure.persistence.repository;

import com.xxxx.ddd.domain.repository.HiDomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HiInfrasRepositoryImpl implements HiDomainRepository {
    @Override
    public String sayHi(String who) {
        return "Hello Infrastructure " + who;
    }
}
