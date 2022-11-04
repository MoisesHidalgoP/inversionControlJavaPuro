package com.app.ioc;

public class UsuariomplMongo implements iUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Mongo");
		
	}

	@Override
	public void eliminaUsuarioById(int id) {
		System.out.println("Eliminando usuario en Mongo: "+id);
		
	}

	

	
	

}
