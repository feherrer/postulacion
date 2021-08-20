/**
 * 
 */
package com.gizlo.ms.usuariopy.util;

import java.util.Optional;

import org.modelmapper.ModelMapper;

import com.gizlo.ms.usuario.model.UsuarioType;
import com.gizlo.ms.usuario.repository.model.Usuario;


/**
 * @author fherrera
 *
 */
public class UsuarioConvert {
	
private UsuarioConvert() {
		
	}
	
	public static final UsuarioType modelToType(Usuario usuario) {
		return new ModelMapper().map(usuario, UsuarioType.class);
	}
	
	public static final Usuario typeToModel(UsuarioType usuario) {
		return new ModelMapper().map(usuario, Usuario.class);
	}
	

	public static UsuarioType modelToType(Optional<Usuario> usuario) {
		return new ModelMapper().map(usuario, UsuarioType.class);
	}
	
	

}
