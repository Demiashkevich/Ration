package com.epam.ration.converter;

import com.epam.ration.dto.ProductDto;
import com.epam.ration.entity.Product;
import org.mapstruct.*;

import java.util.List;

@Mapper
public interface IProductConverter {

    @Mappings({
            @Mapping(target = ("entity.name"), source = ("name")),
            @Mapping(target = ("entity.description"), source = ("description")),
            @Mapping(target = ("entity.protein"), source = ("protein")),
            @Mapping(target = ("entity.fat"), source = ("fat")),
            @Mapping(target = ("entity.vitamin"), source = ("vitamin"))
    })
    @Named("toProductDto")
    public Product productDtoToProduct(ProductDto productDto);

    @Mappings({
            @Mapping(target = ("dto.productId"), source = ("productId")),
            @Mapping(target = ("dto.name"), source = ("name")),
            @Mapping(target = ("dto.description"), source = ("description")),
            @Mapping(target = ("dto.protein"), source = ("protein")),
            @Mapping(target = ("dto.fat"), source = ("fat")),
            @Mapping(target = ("dto.vitamin"), source = ("vitamin"))
    })
    public ProductDto productToProductDto(Product product);

    @IterableMapping(qualifiedByName = ("toProduct"))
    public List<Product> productDtoListToProductList(List<ProductDto> productsDto);

}