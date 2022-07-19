package com.asistencia.repository;

import com.asistencia.models.Asistencia;
import com.asistencia.models.Aula;
import com.asistencia.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AulaRespository extends JpaRepository<Aula,Integer> {

}