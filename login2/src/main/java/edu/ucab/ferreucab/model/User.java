package edu.ucab.ferreucab.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "user")
@XmlRootElement
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic (optional = false)
    @Column (name = "id")
    private Integer id;
    @Column (name = "user")
    private String user;
    @Column (name = "psw")
    private String psw;
    
    public User(){}
    
    private User(Builder builder){
        this.user = builder.user;
        this.psw = builder.psw;
    }

    public Integer getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public static class Builder{
        private final String user; // requerido
        private final String psw;  // requerido
        private Integer id;  // opcional
        
        public Builder(String user, String psw){
            this.user = user;
            this.psw = psw;
        }
        
        public Builder id(Integer id){
            this.id = id;
            return this;
        }
        
        public User build(){
            return new User(this);
        }
    }  
}
