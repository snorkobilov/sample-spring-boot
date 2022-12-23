package com.cvshealth.samplespringrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloWorldRepository extends JpaRepository<HelloWorldEntity, Long> {
}
