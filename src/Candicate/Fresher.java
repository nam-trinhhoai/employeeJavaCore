package Candicate;

public class Fresher extends Candicate {
    private String graduationDate;
    private String graduationRank;

    private String education;

    public Fresher(String id, String name) {
        super(id, name);
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public Fresher setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }


    public Fresher setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public Fresher setEducation(String education) {
        this.education = education;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + getGraduationDate()
                + " | " + getGraduationRank() + " | " + getEducation();
    }

    @Override
    public String toStringByType() {
        return super.toString() + " | Fresher";
    }

    public static class FresherBuilder extends Candicate.Builder<FresherBuilder> {
        private String graduationDate;

        private String graduationRank;
        private String education;

        public FresherBuilder withGraduationDate(String graduationDate) {
            this.graduationDate = graduationDate;
            return this;
        }

        public FresherBuilder withGraduationRank(String graduationRank) {
            this.graduationRank = graduationRank;
            return this;
        }

        public FresherBuilder withEducation(String education) {
            this.education = education;
            return this;
        }

        public Fresher build() {
            Fresher ex = new Fresher(this.id, this.name);
            ex.setAddress(this.address);
            ex.setBirth(this.birth);
            ex.setEmail(this.email);
            ex.setPhone(this.phone);
            ex.setGraduationDate(this.graduationDate);
            ex.setGraduationRank(this.graduationRank);
            ex.setEducation(this.education);
            return ex;

        }
    }
}