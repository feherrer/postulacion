package com.gizlo.ms.usuariopy.service.contract;

import java.util.Optional;

import com.gizlo.ms.usuario.model.UsuarioExternoType;
import com.gizlo.ms.usuario.model.UsuarioInternoType;
import com.gizlo.ms.usuario.repository.model.UsuarioExterno;
import com.gizlo.ms.usuario.repository.model.UsuarioInterno;

/**
 * @author fherrera
 *
 */

public interface IUsuarioPYServices {
	
	 
	 public UsuarioInternoType guardarUsuario(UsuarioInternoType usuario);
	 
	 public Optional<UsuarioInterno> consultarUsuarioInterno(String id);
	 
	 public UsuarioExternoType guardarUsuario(UsuarioExternoType usuario);
	 
	 public Optional<UsuarioExterno> consultarUsuarioExterno(String id);


}
