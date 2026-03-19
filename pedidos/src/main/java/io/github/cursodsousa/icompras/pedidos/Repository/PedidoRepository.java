package io.github.cursodsousa.icompras.pedidos.Repository;

import io.github.cursodsousa.icompras.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
