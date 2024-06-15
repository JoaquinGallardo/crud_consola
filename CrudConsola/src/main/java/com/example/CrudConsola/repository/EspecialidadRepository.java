package com.example.CrudConsola.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.CrudConsola.entities.Especialidad;

public interface EspecialidadRepository extends CrudRepository<Especialidad, Integer> {

    @Query("SELECT e FROM Especialidad e")
    List<Especialidad> getEspecialidades();

    @Query("SELECT esp FROM Especialidad esp WHERE esp.idEspecialidad in ?1")
     Optional<Especialidad> getEspecialidadPorId(Integer id);


}
