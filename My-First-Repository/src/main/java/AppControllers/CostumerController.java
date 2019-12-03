package AppControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Services.CostumerService;
import dto.CostumerDTO;

@Controller
public class CostumerController {
	private CostumerService costumerService;

	@RequestMapping(name = "costumer", method = RequestMethod.GET)
	public ModelAndView showCos() {
		System.out.println("this is coooooooool");

		CostumerDTO c = costumerService.costumerInfo();
		System.out.println(c.toString());

		ModelAndView mv = new ModelAndView("costumer");
		mv.addObject("cs", c);

		return mv;

	}

	public CostumerService getCostumerService() {
		return costumerService;
	}

	public void setCostumerService(CostumerService costumerService) {
		this.costumerService = costumerService;
	}

}
