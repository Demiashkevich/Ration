package com.epam.ration.service.impl;

import com.epam.ration.converter.IProductConverter;
import com.epam.ration.dao.ProductRepository;
import com.epam.ration.dto.ProductDto;
import com.epam.ration.entity.Product;
import com.epam.ration.response.ServiceResponse;
import com.epam.ration.response.Status;
import com.epam.ration.service.IProductService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private IProductConverter mapping = Mappers.getMapper(IProductConverter.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ServiceResponse<List<Product>> find() {
        List<Product> products = productRepository.findAll();
        if (products != null) {
            return new ServiceResponse<>(products, Status.SUCCESS);
        }
        return new ServiceResponse<>(Status.FAILED);
    }

    @Override
    public ServiceResponse<Void> delete(final Long PRODUCT_ID) {
        productRepository.delete(PRODUCT_ID);
        return new ServiceResponse<>(Status.SUCCESS);
    }

    @Override
    public ServiceResponse<Void> add(ProductDto productDto) {
        if (this.isProductExists(productDto.getName())) {
            return new ServiceResponse<>(Status.FAILED_UNIQUE, "There is a product with that name:" + productDto.getName());
        }
        Product product = mapping.productDtoToProduct(productDto);
        Product save = productRepository.save(product);
        if (save != null) {
            return new ServiceResponse<>(Status.SUCCESS);
        }
        return new ServiceResponse<>(Status.FAILED);
    }

    private boolean isProductExists(final String NAME) {
        Product product = productRepository.findProductByName(NAME);
        if (product != null) {
            return true;
        }
        return false;
    }

}
