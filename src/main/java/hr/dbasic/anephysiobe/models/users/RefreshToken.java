package hr.dbasic.anephysiobe.models;

import hr.dbasic.anephysiobe.models.users.User;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Builder
@Getter
@Setter
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@ToString(doNotUseGetters = true, onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Document("refreshTokens")
public class RefreshToken {
    
    @Id
    private String id;
    
    @CreatedDate
    private Date createDate;
    
    @LastModifiedDate
    private Date updateDate;
    
    private Date deleteDate;
    
    private LocalDateTime expireDateTime;
    
    private User user;
    
    public Boolean isExpired() {
        return getExpireDateTime().isBefore(LocalDateTime.now());
    }
}
