package com.epam.ration.controller;

import com.epam.ration.dto.ProductDto;
import com.epam.ration.response.ServiceResponse;
import com.epam.ration.response.Status;
import com.epam.ration.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    @Qualifier("productServiceImpl")
    private IProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView products() {
        ServiceResponse<List<ProductDto>> response = productService.find();
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("products", "productsDto", response.getBody());
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    public ModelAndView product(@PathVariable long productId) {
        ServiceResponse<ProductDto> response = productService.find(productId);
        if(response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("product", "productDto", response.getBody());
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/update/{productId}", method = RequestMethod.GET)
    public ModelAndView updateProduct(@PathVariable long productId) {
        ServiceResponse<ProductDto> response = productService.find(productId);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("admin/update-product", "productDto", response.getBody());
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView updateProduct(@ModelAttribute("productDto") @Valid ProductDto productDto,
                                      BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("admin/update-product");
        }
        ServiceResponse<ProductDto> response = productService.update(productDto);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("redirect:/product/products");
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createProduct(@ModelAttribute("productDto") ProductDto productDto) {
        return new ModelAndView("admin/create-product");
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createProduct(@ModelAttribute("productDto") @Valid ProductDto productDto,
                                      BindingResult result) {
        if (result.hasErrors()) {
            return new ModelAndView("admin/create-product");
        }
        ServiceResponse<Void> response = productService.add(productDto);
        if (response.getStatus() == Status.FAILED_UNIQUE) {
            result.addError(new FieldError("productDto", "name", response.getMessage()));
            return new ModelAndView("admin/create-product");
        }
        return new ModelAndView("redirect:/product/products");
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteProduct(@PathVariable long id) {
        ServiceResponse<Void> response = productService.delete(id);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("redirect:/product/products");
        }
        return new ModelAndView("product/{id}");
    }

}
