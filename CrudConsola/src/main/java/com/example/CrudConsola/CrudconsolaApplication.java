package com.example.CrudConsola;

import com.example.CrudConsola.entities.Cliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class CrudconsolaApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CrudconsolaApplication.class, args);
	//	SpringApplication.run(SpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Mundo");
	}

	@Transactional
	public void createCliente() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nombre");
		String nombre = scanner.nextLine();

		System.out.println("Primer Apellido");
		String apellido1 = scanner.nextLine();
		System.out.println("Segundo Apellido");
		String apellido2 = scanner.nextLine();
		System.out.println("Nacionalidad");
		String nacionalidad = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento");
		String fnac = scanner.nextLine();
		SimpleDateFormat dnac = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaDate = dnac.parse(fnac);
		System.out.println("Ingrese 1: femenino, 2: masculino");
		Integer sexo = scanner.nextInt();
		System.out.println("Ingrese direccion:");
		String direccion = scanner.nextLine();
		System.out.println("Ingrese comuna");
		String comuna = scanner.nextLine();
		System.out.println("Email:");
		String email = scanner.nextLine();
		System.out.println("Telefono:");
		String telefono = scanner.nextLine();
		System.out.println("Ingrese password");
		String password = scanner.nextLine();
		System.out.println("Tipo de documento 1: cedula de identidad 2: pasaporte");
    	Integer tipoDocumento = scanner.nextInt();
        System.out.println("Ingrese numero de documento");
		String numeroDocumento = scanner.nextLine();
		scanner.close();

		//crear Cliente

		Cliente cliente= new Cliente(null,tipoDocumento,numeroDocumento,password,nombre,apellido1,apellido2,nacionalidad,fechaDate,sexo,direccion,comuna,email,telefono);
	}

}


