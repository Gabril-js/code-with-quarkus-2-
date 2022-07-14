package org.acme.Repository;
import javax.enterprise.context.ApplicationScoped;

import org.acme.DTO.Pessoa;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PessoaRepository implements PanacheRepository<Pessoa> {

    public Pessoa findByname(String nome){

        return find("nome", nome).firstResult();
    }

    

}