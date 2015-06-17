package br.com.justoeu.gson.model;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Custumer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Expose
	private int id;
	
	@Expose
	@SerializedName("NomeDoCliente")
	private String firstName;
	
	@Expose
	@SerializedName("UltimoNomeDoCliente")
	private String lastName;
	
	@Expose(serialize = false)
	@SerializedName("a")
	private List<Address> address;

	public void setId(final int id) 					{ this.id = id; 				}
	public void setFirstName(final String firstName) 	{ this.firstName = firstName; 	}
	public void setLastName(final String lastName) 		{ this.lastName = lastName; 	}
	public void setAddress(final List<Address> address) { this.address = address; 		}

	public int getId() 					{ return id; 		}
	public String getFirstName() 		{ return firstName; }
	public String getLastName() 		{ return lastName; 	}
	public List<Address> getAddress() 	{ return address; 	}


}