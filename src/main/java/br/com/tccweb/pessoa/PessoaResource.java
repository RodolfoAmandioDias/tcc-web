package br.com.tccweb.pessoa;

import br.com.tccweb.global.resource.CrudResource;

import javax.ejb.Stateless;
import javax.ws.rs.Path;

@Stateless
@Path("pessoas")
public class PessoaResource extends CrudResource<PessoaModel, Long> {

}
