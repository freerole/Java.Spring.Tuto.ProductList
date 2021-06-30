package product_manager.manager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private int price;

    public Product() {
        super();
    }

    @Id // 해당 프로퍼티가 테이블의 주키(primary key)역할을 한다는 것을 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 주키를 생성할때 사용해야하는 전략을 의미. "Identity" DB의 identity 컬럼을 이용
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
