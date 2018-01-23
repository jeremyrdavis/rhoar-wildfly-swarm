package org.wildfly.swarm.insult.noun;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Ken Finnigan
 */
@Path("/noun")
public interface NounService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Noun getNoun();
}
