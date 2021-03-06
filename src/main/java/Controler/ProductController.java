
package Controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DTO.ProductDTO;
import Services.ProductService;

@Controller
public class ProductController {
	

	private ProductService productService;

	@RequestMapping(value = "product", method = RequestMethod.GET)
	public ModelAndView showPage() {
		System.out.println("I am inside product api");

		ProductDTO p = productService.productInfo();
		System.out.println(p.toString());

		ModelAndView mv = new ModelAndView("product-page");
		mv.addObject("pt", p);
		mv.addObject("username", "Abinash");
		return mv;
	}

	@RequestMapping(value = "product-form", method = RequestMethod.GET)
	public ModelAndView showProductPage() {
		ProductDTO p = new ProductDTO();

		ModelAndView mv = new ModelAndView("product-form");
		mv.addObject("productObj", p);
		return mv;
	}

	@RequestMapping(value = "save-product", method = RequestMethod.POST)
	public ModelAndView saveProduct(ProductDTO product) {
		System.out.println("i am receiving product from user");
		System.out.println(product.toString());

		ModelAndView mv = new ModelAndView("product-page");
		mv.addObject("pt", product);
		return mv;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}


