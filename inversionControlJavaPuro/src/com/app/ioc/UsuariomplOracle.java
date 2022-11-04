package com.app.ioc;

public class UsuariomplOracle implements iUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario en Oracle");
		
	}

	@Override
	public void eliminaUsuarioById(int id) {
		System.out.println("Eliminando usuario en Oracle: "+id);
		
	}

}
