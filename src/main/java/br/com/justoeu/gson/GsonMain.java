package br.com.justoeu.gson;

import java.util.ArrayList;
import java.util.List;

import br.com.justoeu.gson.model.Address;
import br.com.justoeu.gson.model.Custumer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonMain {

	public static void main(final String[] args) {
		
		final GsonBuilder builder = new GsonBuilder();
	    final Gson gson = builder.excludeFieldsWithoutExposeAnnotation().create();

	    List<Address> listAddress = new ArrayList<Address>();
	    
	    Address address= new Address();
	    address.setCep("0500000");
	    address.setId(1);
	    address.setLocate("Av. Bandeirantes, 720");
	    
	    listAddress.add(address);
	    
	    Custumer customer = new Custumer();
	    customer.setFirstName("Joao");
	    customer.setId(1);
	    customer.setLastName("da Silva");
	    customer.setAddress(listAddress);
	    
	    System.out.println(gson.toJson(customer));
	    
		
	}
	
}