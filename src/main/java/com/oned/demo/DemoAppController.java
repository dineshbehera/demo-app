package com.oned.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoAppController {
	

	@GetMapping("/")
	public String index(Model model) {
		System.out.println("GET / called...");
		
		
        InetAddress ip;
        String hostname;
        
        Map<String, Object> map = new HashMap();
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();   
            
            map.put("host", hostname);
            map.put("ip", ip);
            map.put("time", new java.util.Date());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

		model.addAttribute("details", map);
		return "index";
	}
	

}
