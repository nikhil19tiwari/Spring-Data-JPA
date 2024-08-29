package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Product;

public interface ProductJpa extends JpaRepository<Product, Integer> {

}
