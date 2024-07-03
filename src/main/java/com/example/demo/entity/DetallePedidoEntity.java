package com.example.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "detalle_pedido")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DetallePedidoEntity {
	
	
	
	public DetallePedidoEntity() {
		super();
	}
	
	

	public DetallePedidoEntity(Long detalleId, Integer cantidad, ProductoEntity productoEntity,
			PedidoEntity pedidoEntity) {
		super();
		this.detalleId = detalleId;
		this.cantidad = cantidad;
		this.productoEntity = productoEntity;
		this.pedidoEntity = pedidoEntity;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long detalleId;
	
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name = "producto_id", nullable = false)
	private ProductoEntity productoEntity;
	
	@ManyToOne
	@JoinColumn(name = "pedido_id", nullable = false)
	private PedidoEntity pedidoEntity;

	public Long getDetalleId() {
		return detalleId;
	}



	public void setDetalleId(Long detalleId) {
		this.detalleId = detalleId;
	}



	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	public ProductoEntity getProductoEntity() {
		return productoEntity;
	}



	public void setProductoEntity(ProductoEntity productoEntity) {
		this.productoEntity = productoEntity;
	}



	public PedidoEntity getPedidoEntity() {
		return pedidoEntity;
	}



	public void setPedidoEntity(PedidoEntity pedidoEntity) {
		this.pedidoEntity = pedidoEntity;
	}
	
	
	
	
}