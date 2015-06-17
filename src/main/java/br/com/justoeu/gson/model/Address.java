package br.com.justoeu.gson.model;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String locate;
	private String cep;

	public int getId() 			{ return id; 		}
	public String getLocate() 	{ return locate; 	}
	public String getCep() 		{ return cep; 		}

	public void setId(final int id) 			{ this.id = id; 		}
	public void setLocate(final String locate) 	{ this.locate = locate; }
	public void setCep(final String cep) 		{ this.cep = cep; 		}

}