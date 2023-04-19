package Candicate;

public class Experience extends Candicate{
    private int ExpInYear;
    private String proSkill;
    public Experience (String id, String name){
        super(id,name);
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public String getProSkill() {
        return proSkill;
    }
    @Override
    public String toString(){
        return super.toString()+" | "+getExpInYear()
                + " | "+ getProSkill() ;
    }

    @Override
    public String toStringByType() {
        return super.toString() + " | Experience";
    }

    public static class ExperienceBuilder extends Candicate.Builder<ExperienceBuilder>{
        private int ExpInYear;
        private String proSkill;

        public ExperienceBuilder withExpInYear(int expInYear) {
            ExpInYear = expInYear;
            return this;
        }

        public ExperienceBuilder withProSkill(String proSkill) {
            this.proSkill = proSkill;
            return this;
        }
        public Experience build(){
            Experience ex = new Experience(this.id,this.name);
            ex.setAddress(this.address);
            ex.setBirth(this.birth);
            ex.setEmail(this.email);
            ex.setPhone(this.phone);
            ex.setExpInYear(this.ExpInYear);
            ex.setProSkill(this.proSkill);
            return ex;
        }
    }
}
