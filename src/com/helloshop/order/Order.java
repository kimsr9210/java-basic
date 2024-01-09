package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user = new User();
    Product product = new Product();

    //생성자
    //public이 있어야 다른 패키지에서 Order를 호출 할 수 있따.
    public Order(User user , Product product){
        this.user = user;
        this.product = product;
    }
}
