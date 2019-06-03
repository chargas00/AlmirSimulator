package pratos;

import ingredientes.*;

public class PratoComum extends Prato {

	public PratoComum(int codigoPrato) {
		super(codigoPrato);
	}

	public void inserirIngrediente(Ingrediente ingrediente) throws IIException {
		// TODO Auto-generated method stub
		// Se o ingrediente for especial, nao pode ser inserido.
		
		if (ingrediente.especial)
			throw new IIException();
		else
			ingredientes.inserir(ingrediente);
	}
	
	
}
