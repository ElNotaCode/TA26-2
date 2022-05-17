package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Cientifico;

public interface ICientificoDAO extends JpaRepository<Cientifico, String> {

}
