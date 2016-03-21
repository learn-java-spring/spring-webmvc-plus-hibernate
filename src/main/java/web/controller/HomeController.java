package web.controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;


    @RequestMapping("/{name}")
    public String home(@PathVariable("name") String name, ModelMap modelMap) {
        modelMap.addAttribute("name", name);
        Integer i = 0;
        modelMap.addAttribute("i", i);
        return "index";
    }

    @RequestMapping("/product/{id}")
    @ResponseBody
    public String asdasdas(HttpServletRequest request, HttpServletResponse response, @PathVariable("id") Integer id) {
        return productService.getProductById(id).toString();
    }

}
