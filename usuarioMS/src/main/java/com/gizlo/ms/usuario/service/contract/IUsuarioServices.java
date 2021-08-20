package com.gizlo.ms.usuario.service.contract;

import java.util.Optional;

import com.gizlo.ms.usuario.model.UsuarioExternoType;
import com.gizlo.ms.usuario.model.UsuarioInternoType;
import com.gizlo.ms.usuario.model.UsuarioType;
import com.gizlo.ms.usuario.repository.model.Usuario;
import com.gizlo.ms.usuario.repository.model.UsuarioExterno;
import com.gizlo.ms.usuario.repository.model.UsuarioInterno;

/**
 * @author fherrera
 *
 */

public interface IUsuarioServices {
	
	
	 
	 
	 public UsuarioInternoType guardarUsuarioInterno(UsuarioInternoType usuario);
	 
	 public Optional<?> consultarUsuarioInterno(String id);
	 
	 
	 public UsuarioExternoType guardarUsuarioExterno(UsuarioExternoType usuario);
	 
	 public Optional<?> consultarUsuarioExterno(String id);


}
