package io.github.cursodsousa.icompras.pedidos.Repository;

import io.github.cursodsousa.icompras.pedidos.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
