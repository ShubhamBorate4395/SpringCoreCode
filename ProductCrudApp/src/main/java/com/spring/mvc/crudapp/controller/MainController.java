package com.spring.mvc.crudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.crudapp.dao.ProductDao;
import com.spring.mvc.crudapp.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;

	// shoe all product
	@RequestMapping("/")
	public String home(Model model) {
		// here we getting all products with the help of productdao method
		List<Product> products = productDao.getAllProduct();

		// saves this into model attribute key&value format
		model.addAttribute("product", products);
		return "index";
	}

	// show add_product_form
	@RequestMapping("/add-product")
	public String addProduct(Model model) {
		// key is title and value is "Add Product" this is used in base.jsp page
		// to display on top of url
		model.addAttribute("title", "Add Product");
		return "add_product_form";

	}

	// handaler add_product_form
	@RequestMapping(value = "/handal-product", method = RequestMethod.POST)
	public RedirectView handalProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);

		// this method saves product into dbs
		this.productDao.createProduct(product);
		RedirectView redv = new RedirectView();

		// redirect page to home page but if we use "/" so our project path we
		// lost
		// so we get error so we use here context to get home page path
		redv.setUrl(request.getContextPath() + "/");
		System.out.println("Context Path: " + request.getContextPath());
		return redv;

	}

	// delete handler
	@RequestMapping("/delete-product/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {

		// this method delete product into dbs
		this.productDao.deleteProduct(productId);
		RedirectView redv = new RedirectView();

		// redirect page to home page but if we use "/" so our project path we
		// lost
		// so we get error so we use here context to get home page path
		redv.setUrl(request.getContextPath() + "/");
		return redv;
	}

	// update handler
	@RequestMapping("/update-product/{productId}")
	public String updateForm(@PathVariable("productId") int productId, Model model) {
		Product product = productDao.getProduct(productId);
		model.addAttribute("product",product);
		return "update_Form";
	}

}
