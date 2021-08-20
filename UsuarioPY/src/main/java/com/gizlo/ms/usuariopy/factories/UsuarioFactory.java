/**
 * 
 */
package com.gizlo.ms.usuariopy.factories;

import org.springframework.stereotype.Component;

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
@Component
public class UsuarioFactory {

	/**
	 * Constructor
	 */
	private UsuarioFactory() {
	
	}
	
	/**
     * Metodo para obtener el usuario
     *
     * @param tipo de Usuario
     * @return Usuario
     */
    public static UsuarioType getUsuario(String tipo)
    {
        switch (tipo)
        {
            case "interno":
                return new UsuarioInternoType();

            case "externo":
                return new UsuarioExternoType();

            default:
                throw new IllegalArgumentException("Tipo de usuario no existe.");
        }
    }

}
