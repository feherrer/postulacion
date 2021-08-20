/**
 * 
 */
package com.gizlo.ms.usuario.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gizlo.ms.usuario.model.UsuarioExternoType;
import com.gizlo.ms.usuario.model.UsuarioInternoType;
import com.gizlo.ms.usuario.repository.contract.IUsuarioExternoRepository;
import com.gizlo.ms.usuario.repository.contract.IUsuarioInternoRepository;
import com.gizlo.ms.usuario.service.contract.IUsuarioServices;
import com.gizlo.ms.usuario.util.UsuarioExternoConvert;
import com.gizlo.ms.usuario.util.UsuarioInternoConvert;


/**
 * @author fherrera
 *
 */
@Service
public class UsuarioServicesImpl implements IUsuarioServices {


	
	@Autowired
	 IUsuarioInternoRepository usuarioInternoRepository;
	
	@Autowired
	 IUsuarioExternoRepository usuarioExternoRepository;
	
	public UsuarioInternoType guardarUsuarioInterno(UsuarioInternoType usuario) {
		
	
		return  UsuarioInternoConvert.modelToType(
				usuarioInternoRepository.save( UsuarioInternoConvert.typeToModel( usuario)));
	}

	public Optional<?> consultarUsuarioInterno(String id) {
		return usuarioInternoRepository.findById(id);
	}
	
	
	
	
	
	public UsuarioExternoType guardarUsuarioExterno(UsuarioExternoType usuario) {
		return  UsuarioExternoConvert.modelToType(
				usuarioExternoRepository.save( UsuarioExternoConvert.typeToModel((UsuarioExternoType) usuario)));
	}

	@Override
	public Optional<?> consultarUsuarioExterno(String id) {
		return usuarioExternoRepository.findById(id);
	}



}
