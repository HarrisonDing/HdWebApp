package hd.spring.boot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hd.spring.boot.web.model.JpaUserEntity;

public interface JpaUserRepository extends JpaRepository<JpaUserEntity, Integer> {

}
