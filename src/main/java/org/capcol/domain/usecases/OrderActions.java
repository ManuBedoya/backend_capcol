package org.capcol.domain.usecases;

import org.capcol.domain.model.order.Order;
import org.capcol.util.Constants;
import org.capcol.util.TemplateHTML;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.reactive.ReactiveMailer;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OrderActions {

    //@ConfigProperty(name = "subject.buy")
    private String subject_buy;
    //@ConfigProperty(name = "email.send")
    private String email;

    @Inject
    ReactiveMailer mailer;
    @Inject
    TemplateHTML template;

    public Uni<Void> sendEmail(Order order) {
        return mailer.send(Mail.withHtml(order.getUserData().getEmail(), Constants.EMAIL_SUBJECT_BUY,
                template.getEmailHtmlBuy(order.getUserData().getName().split(" ")[0])),
                Mail.withText(email, subject_buy, order.toString()));
    }

}
