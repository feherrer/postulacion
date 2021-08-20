/**
 * 
 */
package com.gizlo.ms.usuariopy.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gizlo.ms.usuario.model.UsuarioExternoType;
import com.gizlo.ms.usuario.model.UsuarioInternoType;
import com.gizlo.ms.usuario.repository.contract.IUsuarioExternoRepository;
import com.gizlo.ms.usuario.repository.contract.IUsuarioInternoRepository;
import com.gizlo.ms.usuario.repository.model.UsuarioExterno;
import com.gizlo.ms.usuario.repository.model.UsuarioInterno;
import com.gizlo.ms.usuario.service.contract.IUsuarioServices;
import com.gizlo.ms.usuariopy.service.contract.IUsuarioPYServices;
import com.gizlo.ms.usuariopy.util.UsuarioExternoConvert;
import com.gizlo.ms.usuariopy.util.UsuarioInternoConvert;

/**
 * @author fherrera
 *
 */
@Service
public class UsuarioPYServicesImpl implements IUsuarioPYServices {

	
	@Autowired
	 IUsuarioExternoRepository usuarioExternoRepository;
	
	@Autowired
	 IUsuarioInternoRepository usuarioInternoRepository;
	


	@Override
	public UsuarioInternoType guardarUsuario(UsuarioInternoType usuario) {
		return  UsuarioInternoConvert.modelToType(
				usuarioInternoRepository.save( UsuarioInternoConvert.typeToModel(usuario)));
	}

	@Override
	public Optional<UsuarioInterno> consultarUsuarioInterno(String id) {
		 
		 return usuarioInternoRepository.findById(id);
	}

	@Override
	public UsuarioExternoType guardarUsuario(UsuarioExternoType usuario) {
		return  UsuarioExternoConvert.modelToType(
				usuarioExternoRepository.save( UsuarioExternoConvert.typeToModel(usuario)));
	}

	@Override
	public Optional<UsuarioExterno> consultarUsuarioExterno(String id) {
		return usuarioExternoRepository.findById(id);
	}

}
