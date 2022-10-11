package Aula36Agenda;

public class Agenda {

	public static void main(String[] args) {
		Contato contato1 = new Contato();
		contato1.setNome("Harry Potter");

//objeto de end		
		Endereco end = new Endereco();
		end.setNomeRua("Privet Drive");
		end.setNumero(4);
		end.setComplemento("Armário sob a escada");
		end.setCidade("Little Whingeing");
		end.setEstado("Condado Sorrey");
		end.setCep("00000-000");

		contato1.setEndereco(end); // setando endereco para o contato

		Telefone tel1 = new Telefone();
		tel1.setTipo("celular");
		tel1.setDdd("55");
		tel1.setTelefone("54587-5232");

		Telefone tel2 = new Telefone();
		tel2.setTipo("casa");
		tel2.setDdd("55");
		tel2.setTelefone("5656-3669");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel1;
		telefones[1]=tel2;
		
		contato1.setTelefones(telefones); //setando telefone para o contato

		System.out.println(contato1.getNome());

		// DEIXANDO O CÓDIGO SEGURO evitando erros e fazendo verificações

		if (contato1 != null && contato1.getEndereco() != null) {// verificar se o contato não está vazio e se os
																	// atributos estão com valores
			System.out.println(contato1.getEndereco().getCidade());
		}

		// a partir do java8 existe uma funçao que verifica se é seguro acessar o
		// código: nullsafeoperator
		// usa a função no lugar do if (contato1 !=null && contato1.getEndereco() !=null) 

		if (contato1 != null && contato1.getTelefones() != null) {
			for (Telefone t : contato1.getTelefones()) { //poderia ter utilizado o while, for normal no lugar do for each
				System.out.println(t.getDdd() + " " + t.getTelefone());
			}
		}

	}

}
