package Services;

import org.springframework.stereotype.Service;

import DTO.ProductDTO;
@Service
public class ProductService {
	
	public ProductDTO productInfo()
	{
		ProductDTO p = new ProductDTO();
		p.setName("iphone");
		p.setCategory("phone");
		p.setDescription("made in china");
		
		return p;
	}
		
	
}
