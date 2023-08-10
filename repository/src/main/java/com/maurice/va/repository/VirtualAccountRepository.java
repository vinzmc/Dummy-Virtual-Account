package com.maurice.va.repository;

import com.maurice.va.entity.VirtualAccount;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualAccountRepository extends R2dbcRepository<VirtualAccount, String> {
}
