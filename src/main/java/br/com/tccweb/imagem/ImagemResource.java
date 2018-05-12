package br.com.tccweb.imagem;

import br.com.tccweb.global.resource.CrudResource;

import javax.ejb.Stateless;
import javax.ws.rs.Path;

@Stateless
@Path("imagens")
public class ImagemResource extends CrudResource<ImagemModel, Long> {

}
