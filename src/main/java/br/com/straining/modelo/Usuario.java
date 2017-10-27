package br.com.straining.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.straining.enums.Sexo;

@SuppressWarnings("serial")
@Entity
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataNascimento;

	private BigDecimal peso;
	
	private BigDecimal altura;
	
	private Sexo sexo;

	@OneToMany(fetch = FetchType.EAGER)
	private List<RestricaoFisica> restricoes = new ArrayList<RestricaoFisica>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Treino> treinos = new ArrayList<Treino>();
	
	private String email;
	
	private String senha;
	
	private String autoDescricao;

	public String getAutoDescricao() {
		return autoDescricao;
	}

	public void setAutoDescricao(String autoDescricao) {
		this.autoDescricao = autoDescricao;
	}

	public Integer getId() {
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public List<RestricaoFisica> getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(List<RestricaoFisica> restricoes) {
		this.restricoes = restricoes;
	}

	public void setTreinos(List<Treino> treinos) {
		this.treinos = treinos;
	}

	public void adicionaTreino(Treino treino) {
		this.treinos.add(treino);
	}

	public List<Treino> getTreinos() {
		return treinos;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}