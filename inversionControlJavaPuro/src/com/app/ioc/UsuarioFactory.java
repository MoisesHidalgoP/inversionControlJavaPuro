package com.app.ioc;

public class UsuarioFactory {
	
	iUsuario usr;
	public UsuarioFactory(iUsuario usr) {
		this.usr=usr;
	}
	
	
	
	public void getInsertarUsuario() {
		
		usr.insertaUsuario();
	}
	
    public void getEliminarUsuarioById(int id) {
    	
		usr.eliminaUsuarioById(id);
	}
	

}
