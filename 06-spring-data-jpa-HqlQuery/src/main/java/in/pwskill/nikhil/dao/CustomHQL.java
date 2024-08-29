package in.pwskill.nikhil.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.pwskill.nikhil.bean.EmployeeHQL;
import jakarta.transaction.Transactional;

public interface CustomHQL extends JpaRepository<EmployeeHQL, Integer> {
	// HQL Custom Query
    @Query("FROM EmployeeHQL e WHERE e.eid = :id")
    List<EmployeeHQL> fetchBiId(@Param("id") Integer id);
    @Query("FROM EmployeeHQL e WHERE e.eid >= :id")
    List<EmployeeHQL> fetchAllId(@Param("id") Integer id);
    
    /***
       *
       *
       *
       *
       ****/
    @Query("DELETE FROM EmployeeHQL e WHERE e.eid =:id")
    @Modifying
    @Transactional
    public int deleteRec(@Param("id")Integer id);
    /***
    *
    *
    *
    *
    ****/
   // HQL Custom Query to update employee age
    @Query("UPDATE EmployeeHQL e SET e.eage = e.eage + :ag WHERE e.eid = :id")
    @Modifying
    @Transactional
    int updateRec(@Param("id") Integer id, @Param("ag") Integer ag);
}
