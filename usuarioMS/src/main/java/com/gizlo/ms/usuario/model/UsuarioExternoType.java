/**
 * 
 */
package com.gizlo.ms.usuario.model;

import java.util.Date;

/**
 * @author fherrera
 *
 */
public class UsuarioExternoType extends UsuarioType {
	
	Date fechaExpiracion;
	String observacion;
	String token;
	/**
	 * @return the fechaExpiracion
	 */
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	/**
	 * @param fechaExpiracion the fechaExpiracion to set
	 */
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}
	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
