package com.EmanSponser.Controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.EmanSponser.model.CustDetails_Banker;
import com.EmanSponser.repository.CustDetails_banker_Repo;
import com.EmanSponser.service.CustDetailsService;


@Controller
public class MainController {

    private  static final Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    private CustDetailsService custdtl;
	
	@GetMapping("/SaveCustData")
	public String index(Model model)
	{
		logger.info("hiting");
		model.addAttribute("CustDetails",new CustDetails_Banker());
		return "demo1";
	}
	
	@PostMapping("/SaveCustData")
	public String index1(CustDetails_Banker custDetails)
	{
		logger.info("hiting.....");
		custdtl.custdetails(custDetails);
        logger.info("data inserted into db....");
		return "redirect:SaveCustData";
	}
	
//	@GetMapping("/")
//	public String index3()
//	{
//		return "demo1";
//	}
}
