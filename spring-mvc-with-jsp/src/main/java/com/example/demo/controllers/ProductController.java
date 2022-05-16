package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;

import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping(value = "/product",method =RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("title","Add Products");
		
		model.addAttribute("command",entity);
		
		return "addProduct";
		
	}
	
	@RequestMapping(value = "/product",method =RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Product entity) {
		
		int rowAdded;
		
		try{
			rowAdded=this.repo.add(entity);
		
					return "success";	
		}
		
		catch(Exception e)
		{
			
			
			return "failure";
		}

	}
	
	@RequestMapping(value= "/search", method = RequestMethod.GET)
	
	public String initSearchForm(Model model) {
			
			model.addAttribute("title","searchProducts");
			
			return "searchProduct";
		}
	@RequestMapping(value= "/search", method = RequestMethod.POST)
		
		public String searchProduct(@RequestParam("id") int id,Model model) {
			
			Product entity = repo.findById(id);
			
			model.addAttribute("found",entity);
			
			return "showProduct";
		}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteById(Model model) {
	
		model.addAttribute("command","deleteProducts");
		
		return "delete";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteForm(@RequestParam("id")int id,Model model) {
		
		int delete =repo.remove(id);
		
		model.addAttribute("found",entity);
		
		return "deletedId";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String indexForm(Model model)
	{
		model.addAttribute("object","Index Page");
		return "index";	
		
	}

}
