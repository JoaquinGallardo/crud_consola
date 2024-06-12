package com.example.crudconsola.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    @Column(name ="tipo_documento_cliente", columnDefinition = "int")
    private int tipoDocumentoCliente;
    @Column(name = "password_cliente", columnDefinition = "varchar(12)")
    private String passwordCliente;
    @Column(name = "nombre_cliente",nullable = false, columnDefinition = "varchar(20)")
    private String nombreCliente;
    @Column(name = "apellido1_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String apellido1Cliente;
    @Column(name = "apellido2_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String apellido2Cliente;
    @Column(name = "nacionalidad_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String nacionalidadCliente;
    @Column(name = "fnac_cliente", columnDefinition = "date")
    private Date fnac_cliente;
    @Column(name = "sexo_cliente", columnDefinition = "int")
    private Integer sexoCliente;
    @Column(name = "direccion_cliente",nullable = false, columnDefinition = "varchar(50)" )
    private String direccionCliente;
    @Column(name = "comuna", nullable = false, columnDefinition = "varchar(25)")
    private String comuna;
    @Column(name = "email", nullable = false, columnDefinition = "varchar(50)")
    private String email;
    @Column(name = "telefono_cliente", nullable = false, columnDefinition = "varchar(25)")
    private String telefonoCliente;

    @OneToMany(mappedBy = "cliente")
    Set<Reserva> listaReservas;

}