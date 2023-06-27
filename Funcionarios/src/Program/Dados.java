package Program;

import java.util.Scanner;

public class Dados {

	private Integer id;
	private String nome;
	private Double salario;
	
	Scanner leia = new Scanner(System.in);

	public Dados() {

	}

	public Dados(Integer id, String nome, Double salario) {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumento(Double percentual) {
		
		this.salario += + salario * percentual / 100;
		
				
	}
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

	

}


