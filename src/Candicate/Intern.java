package Candicate;

public class Intern extends Candicate  {
    private String specialize;
    private String semester;
    private String education;

    public Intern(String id, String name) {
        super(id, name);
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpecialize() {
        return specialize;
    }

    public String getSemester() {
        return semester;
    }

    public String getEducation() {
        return education;
    }
    @Override
    public String toString(){
        return super.toString() +" | "+getSemester()
                + " | "+ getSpecialize() +" | "+ getEducation();
    }
    @Override
    public String toStringByType() {
        return super.toString() + " | Intern";
    }

    public static class InternBuilder extends Candicate.Builder<InternBuilder>{
        private String specialize;
        private String semester;
        private String education;

        public InternBuilder withSpecialize(String specialize) {
            this.specialize = specialize;
            return this;
        }

        public InternBuilder withSemester(String semester) {
            this.semester = semester;
            return this;
        }

        public InternBuilder withEducation(String education) {
            this.education = education;
            return this;
        }

        public Intern build(){
            Intern ex = new Intern(this.id,this.name);
            ex.setAddress(this.address);
            ex.setBirth(this.birth);
            ex.setEmail(this.email);
            ex.setPhone(this.phone);
            ex.setSpecialize(this.specialize);
            ex.setSemester(this.semester);
            ex.setEducation(this.education);
            return ex;

        }
    }
}
