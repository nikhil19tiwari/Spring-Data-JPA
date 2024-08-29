package in.pwskill.nikhil.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.pwskill.nikhil.bean.Product;

public interface ProductJpa extends JpaRepository<Product, Integer> {
    @Query("SELECT p.pname, m.mname FROM Product p LEFT JOIN p.model m")
    List<Object[]> fetchAllProductsLeftJoins();
    @Query("SELECT p.pname, m.mname FROM Product p RIGHT JOIN p.model m")
    List<Object[]> fetchAllProductsRightJoins();
    @Query("SELECT p.pname, m.mname FROM Product p INNER JOIN p.model m")
    List<Object[]> fetchAllProductsINNERJoins();
    @Query("SELECT p.pname, m.mname FROM Product p RIGHT OUTER JOIN p.model m")
    List<Object[]> fetchAllProductsRightOuterJoins();
    @Query("SELECT p.pname, m.mname FROM Product p LEFT OUTER JOIN p.model m")
    List<Object[]> fetchAllProductsLefttOuterJoins();
}
