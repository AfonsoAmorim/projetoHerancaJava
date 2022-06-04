package com.curso.classesauxiliares;

import com.curso.interfaces.PermitirAcesso;

// receber entidade que tem o contrato de PermitirAcesso para cham�-lo
public class FuncaoAutenticacao {

	
	public boolean autenticarFixo(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
	
}
