package service;

import model.Product;
import model.ShoppingCart;

public class ProductServiceImpl implements ProductService{

    private ShoppingCart shoppingCart;

    public ProductServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void addProductsToCart(Product product, Integer cant) {
        for (int i=0;i<cant;i++){
            shoppingCart.addProduct(product);
        }

    }
}
