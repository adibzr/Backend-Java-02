package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Long id;
    private List<Product> productlist = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(List<Product> productlist) {
        this.productlist = productlist;
    }

    public void addProduct(Product product){
        productlist.add(product);
    }

    public void getTotalProducts(){
        System.out.println("total products");
    }

    public void getProducts(){
        System.out.println("products");
    }
}
