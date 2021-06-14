package com.example.meppunit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Curso {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(nullable = false)
		private String nome;
		@Column(nullable = false)
		private String descricao;
		@Column(nullable = false)
		private String ementa;
		@JsonFormat(pattern = "dd/MM/yyyy")
		private Date dataCadastro;
		@JsonFormat(pattern = "dd/MM/yyyy")
		private Date dataInicio;
		@Column(nullable = false)
		private float valor;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getEmenta() {
			return ementa;
		}
		public void setEmenta(String ementa) {
			this.ementa = ementa;
		}
		public Date getDataCadastro() {
			return dataCadastro;
		}
		public void setDataCadastro(Date dataCadastro) {
			this.dataCadastro = dataCadastro;
		}
		public Date getDataInicio() {
			return dataInicio;
		}
		public void setDataInicio(Date dataInicio) {
			this.dataInicio = dataInicio;
		}
		public float getValor() {
			return valor;
		}
		public void setValor(float valor) {
			this.valor = valor;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + Float.floatToIntBits(valor);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Curso other = (Curso) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
				return false;
			return true;
		}
		
		
		
}
