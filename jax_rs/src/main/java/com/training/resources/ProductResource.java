package com.training.resources;

import java.util.List;
import java.util.Optional;

import com.example.Student;
import com.example.demo.services.ProductService;

import com.example.entity.Product;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

import jakarta.ws.rs.PathParam;

import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;

import jakarta.ws.rs.core.Response;

@Path("/products")

public class ProductResource {
	
	private static ProductService service = new ProductService(); 
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Product> findAll(){
		
		return service.findAll();
	}

	@GET
	@Path("/search/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response findById(@PathParam("id")int id){
		
     try{
			
			Product entity = service.findById(id)
					
					.orElseThrow(() -> new RuntimeException("Id not found"));
	
			return Response.ok(entity).build();
		}
		
		catch(RuntimeException e) {
			
			e.printStackTrace();
			
			return Response.ok("ID Not Found").status(400,e.getMessage()).build();
		}
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response addProduct(Product entity) {
		
		int result = service.addProduct(entity);
	    
		if(result!=0) {
			
			return Response.ok(entity).status(201).build();
			
		}else {
			
			return Response.status(400,"Not Created").build();
     }
		
	}
	@DELETE
    @Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response remove(@PathParam("productId") int id) {
		
    	int result = service.deleteById(id);
    	
    	if(result!=0) {
    		
    		return Response.ok("One Resource Deleted").build();
    	}
			return Response.status(400,"Not Deleted").build();
	
    }
	
	@PUT
	@Path("/{productName}/{productPrice}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateById(@PathParam("productName")String name,
			
			@PathParam("productPrice")double price)
	{
		int result = service.updatePriceByName(name,price);
		
		if(result!=0) {
		
		return Response.ok("Updated  " +  result).build();
		}
		
		return Response.status(400,"Not Updated").build();
		
	}
}
