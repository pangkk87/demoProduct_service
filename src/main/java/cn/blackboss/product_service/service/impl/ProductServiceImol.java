package cn.blackboss.product_service.service.impl;

import cn.blackboss.product_service.domain.Product;
import cn.blackboss.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImol implements ProductService {

    private static Map<Integer,Product> daoMap = new HashMap<>();

    static {
        Product p1 = new Product(1,"产品1",8888,201);
        Product p2 = new Product(2,"产品2",7777,202);
        Product p3 = new Product(3,"产品3",6666,203);
        Product p4 = new Product(4,"产品4",5555,204);
        Product p5 = new Product(5,"产品5",4444,205);
        Product p6 = new Product(6,"产品6",3333,206);

        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
        daoMap.put(p6.getId(),p6);

    }


    @Override
    public List<Product> listProduct() {
        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);

        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
