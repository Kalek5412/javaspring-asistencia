package com.asistencia.service;

import com.asistencia.models.Asistencia;
import com.asistencia.models.Aula;
import com.asistencia.models.Estudiante;
import com.asistencia.repository.AsistenciaRepository;
import com.asistencia.repository.AulaRespository;
import com.asistencia.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AulaServiceImpl implements AulaService{

    private final AsistenciaRepository asistenciaRepository;
    private final EstudianteRepository estudianteRepository;
    private final AulaRespository aulaRepository;

    @Override
    public Optional<Aula> buscarAulaPorId(Integer id) {
        return aulaRepository.findById(id);
    }

    @Override
    public Optional<Estudiante> buscarEstudiantePorCodigo(String codigo) {
        return estudianteRepository.findByCodigo(codigo);
    }

    @Override
    public Optional<Asistencia> buscarAsistenciaPorCodigo(String codigo) {
        LocalDate fechaActual=LocalDate.now();
        return asistenciaRepository.findByEstudiante_CodigoAndFechaIngreso(codigo,fechaActual);
    }

    @Override
    public void registrarAsistencia(Asistencia asistencia) {
        LocalDate fechaActual =LocalDate.now();
        asistencia.setFechaIngreso(fechaActual);
        asistencia.setIngresoConfirmado(true);
        asistencia.setSalidaConfirmado(false);
        asistenciaRepository.save(asistencia);

    }

    @Override
    public void actualizarAsistencia(Asistencia asistencia) {
        asistencia.setSalidaConfirmado(true);
        asistenciaRepository.save(asistencia);
    }
}
