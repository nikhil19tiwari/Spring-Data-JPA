
package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskill.nikhil.bean.Model;

public interface ModelJpa extends JpaRepository<Model, Integer> {
}
