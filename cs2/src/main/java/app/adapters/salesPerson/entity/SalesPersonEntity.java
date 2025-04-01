package app.adapters.salesPerson.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sales_person")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SalesPersonEntity {
    @Id
    @Column(name = "sales_person_id")
    private long salesPerson;

    public void setIdCard(String idCard) {
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public Object getIdCard() {
        return null;
    }

    public Object getName() {
        return null;
    }

    public Object getAge() {
        return null;
    }
}
