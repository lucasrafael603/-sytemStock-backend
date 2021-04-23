package stock.system.stock.models.user;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "")
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate


public class SystemUser {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "user_id", updatable = false, nullable = false)
    UUID id;

    @Column
    String username;

    @Column(name = "postal_code")
    Integer postalCode;

    @Column
    String address;

    @Column(name = "state_province")
    String stateProvince;

    @Column
    Integer telephone;

    @Column
    String email;

    @Column
    String password;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

}
