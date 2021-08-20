/**
 * 
 */
package com.gizlo.ms.usuariopy.util;

import java.util.Optional;

import org.modelmapper.ModelMapper;

import com.gizlo.ms.usuario.model.UsuarioInternoType;
import com.gizlo.ms.usuario.repository.model.UsuarioInterno;


/**
 * @author fherrera
 *
 */
public class UsuarioInternoConvert {
	
private UsuarioInternoConvert() {
		
	}
	
	public static final UsuarioInternoType modelToType(UsuarioInterno usuarioInterno) {
		return new ModelMapper().map(usuarioInterno, UsuarioInternoType.class);
	}
	
	public static final UsuarioInterno typeToModel(UsuarioInternoType usuarioInterno) {
		return new ModelMapper().map(usuarioInterno, UsuarioInterno.class);
	}
	

	public static UsuarioInternoType modelToType(Optional<UsuarioInterno> usuarioInterno) {
		return new ModelMapper().map(usuarioInterno, UsuarioInternoType.class);
	}
	
	

}
