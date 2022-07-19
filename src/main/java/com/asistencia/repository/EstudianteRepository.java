package com.asistencia.repository;

import com.asistencia.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {
    Optional<Estudiante> findByCodigo(String codigo);
 }
