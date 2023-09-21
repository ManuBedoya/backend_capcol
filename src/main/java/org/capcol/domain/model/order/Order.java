package org.capcol.domain.model.order;

import lombok.Data;

import org.capcol.domain.model.product.ProductData;
import org.capcol.domain.model.user.UserData;

@Data
public class Order {

    private ProductData productData;
    private UserData userData;

}
