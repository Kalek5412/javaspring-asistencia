package com.asistencia.service;

import com.asistencia.models.Asistencia;
import com.asistencia.models.Aula;
import com.asistencia.models.Estudiante;

import java.util.Optional;

public interface AulaService {
    Optional<Aula> buscarAulaPorId(Integer id);
    Optional<Estudiante> buscarEstudiantePorCodigo(String codigo);
    Optional<Asistencia> buscarAsistenciaPorCodigo(String codigo);
    void registrarAsistencia(Asistencia asistencia);
    void actualizarAsistencia(Asistencia asistencia);
}
