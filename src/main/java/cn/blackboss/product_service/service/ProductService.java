package cn.blackboss.product_service.service;

import cn.blackboss.product_service.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);

}
