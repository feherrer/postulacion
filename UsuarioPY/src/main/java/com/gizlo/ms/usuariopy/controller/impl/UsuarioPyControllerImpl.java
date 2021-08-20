/**
 * 
 */
package com.gizlo.ms.usuariopy.controller.impl;


import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gizlo.ms.usuario.model.UsuarioExternoType;
import com.gizlo.ms.usuario.model.UsuarioInternoType;
import com.gizlo.ms.usuario.model.UsuarioType;
import com.gizlo.ms.usuariopy.controller.contract.IUsuarioPyController;
import com.gizlo.ms.usuariopy.service.contract.IUsuarioPYServices;
import com.gizlo.ms.usuariopy.factories.*;

/**
 * @author fherrera
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-06T09:24:34.610-05:00[America/Bogota]")

@RestController
@RequestMapping("/api/ms")
public class UsuarioPyControllerImpl implements IUsuarioPyController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UsuarioPyControllerImpl.class);
	
	@Autowired
	IUsuarioPYServices usuarioSvc;
	
	public ResponseEntity<?> crearUsuario(@RequestBody @Valid Object usuarioType, String tipo) {
		
		
		ResponseEntity<?> respuesta;
		try {	
			LOG.info("INICIA PROCESO DE CREAR USUARIO");
			Object result;
			UsuarioType usuario = UsuarioFactory.getUsuario(tipo);
			if (tipo.equalsIgnoreCase("interno") ){
			 result = usuarioSvc.guardarUsuario( (UsuarioInternoType) usuarioType);}
			
			else {
				 result = usuarioSvc.guardarUsuario( (UsuarioExternoType) usuarioType);
			}
			respuesta=new ResponseEntity<>(result,
					HttpStatus.OK);
		
		} catch (Exception e) {
			LOG.error("ERROR PROCESO DE CREAR USUARIO"+e.getMessage());
			return respuesta = new ResponseEntity<>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		LOG.info("FINALIZA PROCESO DE CREAR USUARIO");
		return respuesta;
	}

	public ResponseEntity<?> consultarUsuarioPorId( String usuarioId,  String tipo) {
		
		ResponseEntity<?> respuesta;
		try {
			LOG.info("INICIA CONSULTA USUARIO POR ID");
			UsuarioType usuarioType = UsuarioFactory.getUsuario(tipo);
	
			Optional<?> usuario;
			if (tipo.equalsIgnoreCase("interno") ){
			
			usuario= usuarioSvc.consultarUsuarioInterno(usuarioId);
			}
			
			else {
				usuario= usuarioSvc.consultarUsuarioExterno(usuarioId);
			}
			respuesta = ResponseEntity.ok(usuario);
		
		} catch (Exception e) {
			LOG.error("ERROR EN EXCEPTION CONSULTA USUARIO POR ID");
			return respuesta = new ResponseEntity<>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		LOG.info("FINALIZA CONSULTA USUARIO POR ID");
		return respuesta;
		
	}

	

	

	

}
