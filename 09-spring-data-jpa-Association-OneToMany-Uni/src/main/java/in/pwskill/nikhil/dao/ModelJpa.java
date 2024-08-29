package in.pwskill.nikhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.model.Model;

public interface ModelJpa extends JpaRepository<Model, Integer> {

}
