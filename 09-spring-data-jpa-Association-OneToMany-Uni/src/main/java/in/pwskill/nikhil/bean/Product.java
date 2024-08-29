package in.pwskill.nikhil.bean;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Product_Association_1--*_Uni")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    @Column(name = "productname")
    private String pname;

    @Column(name = "productrate")
    private Integer prate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<Model> model;

    public Product() {
    }

    public Product(Integer pid, String pname, Integer prate, List<Model> model) {
        this.pid = pid;
        this.pname = pname;
        this.prate = prate;
        this.model = model;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", prate=" + prate + ", model=" + model + "]";
    }
}
