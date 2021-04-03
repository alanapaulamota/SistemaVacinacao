package com.grad.SistemaVacinacao.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Classe model 
*  
*/
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity // Anotação que indica que a classe é uma entidade do banco de dados
@Table(name = "login") // Anotação indica nome da tabela a ser criada no banco de dados
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cpf;

	private String senha;

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Login)) {
			return false;
		}
		Login other = (Login) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(senha, other.senha);
	}

	// Gerando toString
	@Override
	public String toString() {
		return "Login [id=" + id + ", cpf=" + cpf + "]";
	}

	// GERANDO GETTERS E SETTER COM LOMBOK
}
