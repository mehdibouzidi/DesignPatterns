package me.mbouzidi.designpatterns.operational.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Not a GangOfFour Pattern (not a classic Pattern)
 * From Domain-Driven Design (DDD) - Eric Evans
 * Source: Spring Design Patterns - Frank P Moley / LinkedinLearning
 * */
@Repository
public interface PresidentRepository extends CrudRepository<PresidentEntity, Long> {
    PresidentEntity findByEmailAddress(String emailAddress);
}
