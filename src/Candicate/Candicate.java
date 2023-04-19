package Candicate;

import java.util.Locale;

public abstract class Candicate{
    private String name;
    private String id;
    private String address;
    private String birth;
    private String phone;
    private String email;

    public Candicate(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return getName()+ " | "+ getAddress()+" | "+getBirth();
    }
    public String toStringByType(){
        return "";
    }

    public static class Builder<T extends Builder>{
        protected String name;
        protected String id;
        protected String address;
        protected String birth;
        protected String phone;
        protected String email;
        public T withName(String name) {
            this.name = name;
            return (T) this;
        }

        public T withId(String id) {
            this.id = id;
            return (T)this;
        }

        public T withAddress(String address) {
            this.address = address;
            return (T) this;
        }


        public  T withBirth(String birth) {
            this.birth = birth;
            return (T) this;
        }

        public T withPhone(String phone) {
            this.phone = phone;
            return (T) this;
        }

        public  T withEmail(String email) {
            this.email = email;
            return (T) this;
        }
        public Builder() {
        }

    }

}
