package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Integer> {

}
