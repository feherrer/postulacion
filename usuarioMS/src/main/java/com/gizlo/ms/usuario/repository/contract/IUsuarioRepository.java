/**
 * 
 */
package com.gizlo.ms.usuario.repository.contract;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gizlo.ms.usuario.repository.model.Usuario;

/**
 * @author fherrera
 *
 */
@Repository
public interface IUsuarioRepository extends MongoRepository<Usuario,String> {
	
	// public Usuario guardarUsuario(Usuario usuario);
	 
	 //public Usuario consultarUsuario(Usuario usuario);

}
