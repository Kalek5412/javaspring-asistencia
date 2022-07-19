package com.asistencia.repository;

import com.asistencia.models.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface AsistenciaRepository extends JpaRepository<Asistencia,Integer> {
    Optional<Asistencia> findByEstudiante_CodigoAndFechaIngreso(String codigo, LocalDate fechaIngeso);
}
