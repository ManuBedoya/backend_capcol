package org.capcol.core.services;

import java.util.logging.Logger;

import org.capcol.domain.model.order.Order;
import org.capcol.domain.usecases.OrderActions;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ActionServices {

    @Inject
    OrderActions orderActions;

    private static final Logger adapter = Logger.getLogger("ActionServices");

    public Uni<Void> buyProduct(Order order) {
        return orderActions.sendEmail(order);
    }

}
