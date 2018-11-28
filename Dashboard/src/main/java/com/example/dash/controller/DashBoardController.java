package com.example.dash.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dash.model.TableDesign;
import com.example.dash.service.TableDesignService;

@RestController
@RequestMapping("/projects")
public class DashBoardController {

	@Autowired
	TableDesignService tableDesignService;
	
	@RequestMapping("addColumn")
	public String getProject() {
		return "hello projects";
	}
	
	 //@RequestMapping(value = "addColumn/{count}/{name}", method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	   @ResponseBody
	   public String addColumn(@RequestBody TableDesign table) {
		 tableDesignService.save(table);
		 return tableDesignService.findById(table.getColumn()).toString();
	   }
}
