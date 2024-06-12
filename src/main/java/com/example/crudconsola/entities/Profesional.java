
package com.example.crudconsola.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "profesional")
@Getter
@Setter
@NoArgsConstructor

@ToString


public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_profesional;
    @Column(name = "password_profesional",columnDefinition = "varchar(12)",nullable = false)
    private String passwordProfesional;
    @Column(name = "nombre_profesional",columnDefinition = "varchar(20)",nullable = false)
    private String nombreProfesional;

    @Column(name = "apellido1_profesional",columnDefinition = "varchar(25)",nullable = false)
    private String apellido1Profesional;

    @Column(name = "apellido2_profesional",columnDefinition = "varchar(25)",nullable = false)
    private String apellido2Profesional;

    @Column(name = "nacionalidad_profesional",columnDefinition = "varchar(50)",nullable = false)
    private String nacionalidadProfesional;
    @Column(name="fnac_profesional", nullable = false, columnDefinition ="date")
    private Date fnac_profesional;
    @Column(name="sexo_profesional", nullable = false, columnDefinition = "varchar(50)")
    private Integer sexoProfesional;
    @Column(name="direccion_profesional", nullable = false, columnDefinition = "varchar(50)")
    private String direccionProfesional;
    @Column(name="comuna_profesional", nullable = false, columnDefinition = "varchar(50)")
    private String comunaProfesional;
    @Column(name="email_profesional", nullable = false, columnDefinition = "varchar(50)")
    private String emailProfesional;
    @Column(name="telefono_profesional", nullable = false, columnDefinition = "varchar(50)")
    private String telefonoProfesional;
    //relaciones
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "profesional_especialidad",
            joinColumns =
            @JoinColumn(name = "id_profesional"),
            inverseJoinColumns =
            @JoinColumn(name = "id_especialidad"),
            uniqueConstraints =
            @UniqueConstraint(columnNames = {"id_profesional","id_especialidad"})
    )
    private Set<Especialidad> especialidades; // 1 profesional puede muchas especi

    @OneToMany(mappedBy = "profesional")
    Set<Reserva> listaReservas;



}

