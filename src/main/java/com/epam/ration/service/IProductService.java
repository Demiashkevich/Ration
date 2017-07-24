package com.epam.ration.service;

import com.epam.ration.dto.ProductDto;
import com.epam.ration.response.ServiceResponse;

import java.util.List;

public interface IProductService {

    public ServiceResponse<List<ProductDto>> find();
    public ServiceResponse<ProductDto> find(final long PRODUCT_ID);
    public ServiceResponse<Void> add(ProductDto productDto);
    public ServiceResponse<Void> delete(final long PRODUCT_ID);
    public ServiceResponse<ProductDto> update(ProductDto productDto);

}
