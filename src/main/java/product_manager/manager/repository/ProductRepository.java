package product_manager.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import product_manager.manager.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
