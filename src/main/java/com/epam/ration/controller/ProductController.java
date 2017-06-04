package com.epam.ration.controller;

import com.epam.ration.dto.ProductDto;
import com.epam.ration.entity.Product;
import com.epam.ration.response.ServiceResponse;
import com.epam.ration.response.Status;
import com.epam.ration.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView products() {
        ServiceResponse<List<Product>> response = productService.find();
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("products", "productDto", response.getBody());
        }
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createProduct(@ModelAttribute("productDto") ProductDto productDto) {
        return new ModelAndView("admin/create-product");
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createProduct(@ModelAttribute("productDto") @Valid ProductDto productDto,
                                      BindingResult result,
                                      HttpServletRequest request) {
        if (result.hasErrors()) {
            return new ModelAndView("admin/create-product");
        }
        ServiceResponse<Void> response = productService.add(productDto);
        if (response.getStatus() == Status.FAILED_UNIQUE) {
            result.addError(new FieldError("productDto", "name", response.getMessage()));
            return new ModelAndView("admin/create-product");
        }
        String header = request.getHeader("referer");
        return new ModelAndView("redirect:/" + request.getHeader("referer"));
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteProduct(@PathVariable long id) {
        ServiceResponse<Void> response = productService.delete(id);
        if (response.getStatus() == Status.SUCCESS) {
            return new ModelAndView("products");
        }
        return new ModelAndView("product/{id}");
    }

}
