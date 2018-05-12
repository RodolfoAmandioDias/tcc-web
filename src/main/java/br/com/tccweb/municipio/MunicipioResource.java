package br.com.tccweb.municipio;

import br.com.tccweb.global.resource.CrudResource;

import javax.ejb.Stateless;
import javax.ws.rs.Path;

@Stateless
@Path("municipios")
public class MunicipioResource extends CrudResource<MunicipioModel, Long> {

}
