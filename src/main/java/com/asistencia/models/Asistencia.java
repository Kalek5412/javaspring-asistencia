package com.asistencia.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaIngreso;
    private Boolean ingresoConfirmado;
    private Boolean salidaConfirmado;
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

}
