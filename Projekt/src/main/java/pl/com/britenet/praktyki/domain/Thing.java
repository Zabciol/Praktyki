/**
 * JPA domain objects.
 */
package pl.com.britenet.praktyki.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "jhi_thing")
public class Thing extends AbstractAuditingEntity<Long> implements Serializable {

    public Thing(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 256, name = "text")
    private String text;

    public String getText(){

        return this.text;
    }
    public void setText(String text){

        this.text = text;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
