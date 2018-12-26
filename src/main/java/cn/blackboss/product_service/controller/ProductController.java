package cn.blackboss.product_service.controller;

import cn.blackboss.product_service.domain.Product;
import cn.blackboss.product_service.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productService;

    @RequestMapping("list")
    public Object list(){
        return productService.listProduct();
    }

    @RequestMapping("find")
    public Object findById(@RequestParam("id") int id){
        Product p = productService.findById(id);
        Product r = new Product();
        BeanUtils.copyProperties(p,r);

        r.setName(r.getName() + "data from port =" + port);

        return r;
    }
}
