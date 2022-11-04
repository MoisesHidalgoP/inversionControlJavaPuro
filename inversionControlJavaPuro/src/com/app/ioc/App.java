package com.app.ioc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsuarioFactory obj = new UsuarioFactory(new UsuariomplMongo());
		obj.getInsertarUsuario();
		obj.getEliminarUsuarioById(1);

	}

}
