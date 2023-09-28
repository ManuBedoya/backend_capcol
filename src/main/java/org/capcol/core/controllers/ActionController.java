package org.capcol.core.controllers;

import org.capcol.core.services.ActionServices;
import org.capcol.domain.model.order.Order;
import org.capcol.util.Constants;

import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(Constants.BASE_PATH_ACTIONS)
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActionController {

    @Inject
    ActionServices actionServices;

    @POST
    @Path("/buy")
    @RolesAllowed({ Constants.ADMIN, Constants.SERVICE })
    public Uni<Void> buyProduct(Order order) {
        return actionServices.buyProduct(order);
    }

}
