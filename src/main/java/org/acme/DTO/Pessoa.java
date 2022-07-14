package org.acme.DTO;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Pessoa extends PanacheEntity{

    public String nome;

    public Integer idade;

    public String cpf;

    @Email 
    public String email;
   
}

   