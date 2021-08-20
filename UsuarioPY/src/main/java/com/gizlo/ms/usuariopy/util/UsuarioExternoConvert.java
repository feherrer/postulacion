/**
 * 
 */
package com.gizlo.ms.usuariopy.util;

import java.util.Optional;

import org.modelmapper.ModelMapper;

import com.gizlo.ms.usuario.model.UsuarioExternoType;
import com.gizlo.ms.usuario.repository.model.UsuarioExterno;


/**
 * @author fherrera
 *
 */
public class UsuarioExternoConvert {
	
private UsuarioExternoConvert() {
		
	}
	
	public static final UsuarioExternoType modelToType(UsuarioExterno usuarioExterno) {
		return new ModelMapper().map(usuarioExterno, UsuarioExternoType.class);
	}
	
	public static final UsuarioExterno typeToModel(UsuarioExternoType UsuarioExterno) {
		return new ModelMapper().map(UsuarioExterno, UsuarioExterno.class);
	}
	

	public static UsuarioExternoType modelToType(Optional<UsuarioExterno> UsuarioExterno) {
		return new ModelMapper().map(UsuarioExterno, UsuarioExternoType.class);
	}
	
	

}
