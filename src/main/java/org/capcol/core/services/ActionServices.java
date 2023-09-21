package org.capcol.core.services;

import java.util.logging.Logger;

import org.capcol.domain.model.order.Order;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.reactive.ReactiveMailer;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ActionServices {

    @Inject
    ReactiveMailer mailer;

    private static final Logger adapter = Logger.getLogger("ActionServices");

    public Uni<Void> buyProduct(Order order) {
        return mailer.send(Mail.withText("manuelfernandobedoya@gmail.com", "Test quarkus", "Text With Quarkus"));
    }

}
