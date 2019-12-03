package Services;

import org.springframework.stereotype.Service;

import dto.CostumerDTO;


@Service
public class CostumerService {
	
	public CostumerDTO costumerInfo() {
		CostumerDTO c = new CostumerDTO();
		c.setName("damboo");
		c.setAge(18);
		c.setAddress("11134 demazang");
		c.setGender("male");
		return c;
	}

}
