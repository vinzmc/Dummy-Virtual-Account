package com.maurice.va.repository;

import com.maurice.va.entity.VirtualAccount;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface VirtualAccountRepository extends R2dbcRepository<VirtualAccount, UUID> {
  Mono<Boolean> existsByVANumber(String vaNumber);
  Mono<VirtualAccount> findByVANumber(String vaNumber);
}
