/**
 * 
 */
package com.gizlo.ms.usuariopy.controller.contract;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gizlo.ms.usuario.model.UsuarioType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;



/**
 * @author fherrera
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-01T09:24:34.610-05:00[America/Bogota]")

@Validated
@Tag(name = "UsuarioMSv1", description = "Servicio Entidad Usuario")
public interface IUsuarioPyController {

	/**
     * POST /usuario/v1 : Crear Usuario
     * Crear un nuevo usuario
     *
     * @param usuarioType  (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(method = "Crear Usuario", operationId = "crearUsuario", description = "Crear un nuevo usuario", tags={ "UsuarioMSv1", }, summary = "crearUsuario")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description =  "OK", content = @Content(schema = @Schema(implementation = UsuarioType.class))),
        @ApiResponse(responseCode = "400", description =  "Bad Request", content = @Content(schema = @Schema(implementation = UsuarioType.class))),
        @ApiResponse(responseCode = "500", description =  "Internal Server Error", content = @Content(schema = @Schema(implementation = UsuarioType.class))) })
    @PostMapping(value = "/usuario/v1/{tipo}",
        produces = "application/json; charset=UTF-8", 
        consumes = "application/json; charset=UTF-8")
    @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Usuario",required = true,content = @Content(schema = @Schema(implementation = UsuarioType.class)))
    ResponseEntity<?> crearUsuario( @Valid @RequestBody(required = false) Object usuarioType, 
    								@PathVariable (name = "tipo") String tipoUsuario);
    
    /**
     * GET /usuario/id/v1/{usuarioId}/{tipo} : Consultar Usuario Por Id
     * Consultar al usuario por id
     *
     * @return OK (status code 200)
     * 		   or No Content (status code 204)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(method = "Consultar Usuario Por Id",operationId = "consultarUsuarioPorId", description = "Consultar al usuario por id", tags={ "UsuarioMSv1", }, summary = "consultarUsuarioPorId")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description =  "OK", content = @Content( array = @ArraySchema( schema = @Schema(implementation = UsuarioType.class)))),
        @ApiResponse(responseCode = "204", description =  "No Content", content = @Content(schema = @Schema(implementation = UsuarioType.class))),
        @ApiResponse(responseCode = "400", description =  "Bad Request", content = @Content(schema = @Schema(implementation = UsuarioType.class))),
        @ApiResponse(responseCode = "500", description =  "Internal Server Error", content = @Content(schema = @Schema(implementation = UsuarioType.class))) })
    @GetMapping(value = "/usuario/id/v1/{usuarioId}/{tipo}",
        produces = "application/json; charset=UTF-8")
    ResponseEntity<?> consultarUsuarioPorId (@PathVariable(name = "usuarioId") String usuarioId,
    		@PathVariable (name = "tipo") String tipoUsuario);
}
