package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_pedido")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PedidoEntity {
	
	
	
	
	public PedidoEntity() {
		super();
	}

	
	
	public PedidoEntity(Long pedidoId, LocalDate fechaCompra, UsuarioEntity usuarioEntity,
			List<DetallePedidoEntity> detallePedido) {
		super();
		this.pedidoId = pedidoId;
		this.fechaCompra = fechaCompra;
		this.usuarioEntity = usuarioEntity;
		this.detallePedido = detallePedido;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pedidoId;
	
	private LocalDate fechaCompra;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private UsuarioEntity usuarioEntity;
	
	@OneToMany(mappedBy = "pedidoEntity", cascade = CascadeType.ALL)
	private List<DetallePedidoEntity>detallePedido;

	public Long getPedidoId() {
		return pedidoId;
	}



	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}



	public LocalDate getFechaCompra() {
		return fechaCompra;
	}



	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}



	public UsuarioEntity getUsuarioEntity() {
		return usuarioEntity;
	}



	public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
		this.usuarioEntity = usuarioEntity;
	}



	public List<DetallePedidoEntity> getDetallePedido() {
		return detallePedido;
	}



	public void setDetallePedido(List<DetallePedidoEntity> detallePedido) {
		this.detallePedido = detallePedido;
	}
	
	


}
