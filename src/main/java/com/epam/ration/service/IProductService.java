package com.epam.ration.service;

import com.epam.ration.dto.ProductDto;
import com.epam.ration.entity.Product;
import com.epam.ration.response.ServiceResponse;

import java.util.List;

public interface IProductService {

    public ServiceResponse<List<Product>> find();
    public ServiceResponse<Void> add(ProductDto productDto);
    public ServiceResponse<Void> delete(final Long PRODUCT_ID);

}
