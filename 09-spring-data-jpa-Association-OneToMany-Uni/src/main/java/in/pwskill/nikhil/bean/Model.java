package in.pwskill.nikhil.bean;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "Model_Association_1--*_Uni")
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mid;

    @Column(name = "modelname")
    private String mname;

    @Column(name = "modelversion")
    private Double mversion;

    public Model() {
    }

    public Model(Integer mid, String mname, Double mversion) {
        this.mid = mid;
        this.mname = mname;
        this.mversion = mversion;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Model [mid=" + mid + ", mname=" + mname + ", mversion=" + mversion + "]";
    }
}
