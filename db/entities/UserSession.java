package fredboat.common.db.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_config")
public class UserSession {

    @Id
    private long userId;
    private String token;

    public UserSession(long userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public long getUserId() {
        return userId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}
