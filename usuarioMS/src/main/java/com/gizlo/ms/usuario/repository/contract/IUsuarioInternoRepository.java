package com.gizlo.ms.usuario.repository.contract;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gizlo.ms.usuario.repository.model.UsuarioInterno;
@Repository
public interface IUsuarioInternoRepository extends MongoRepository<UsuarioInterno,String> {

}
