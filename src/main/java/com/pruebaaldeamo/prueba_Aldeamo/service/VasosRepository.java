package com.pruebaaldeamo.prueba_Aldeamo.service;

import com.pruebaaldeamo.prueba_Aldeamo.Entity.VasosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VasosRepository extends JpaRepository<VasosEntity, Long> {
}

