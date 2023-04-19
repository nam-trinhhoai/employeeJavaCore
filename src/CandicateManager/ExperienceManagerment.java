package CandicateManager;

import Candicate.Candicate;
import Candicate.Experience;

import java.util.List;
import static CheckValidFunction.CheckIsValid.*;
import static Constant.Constant.*;

public class ExperienceManagerment  extends AbstractCandicateManager<Experience> {
    @Override
    public Experience addCandicate() {
        return new Experience.ExperienceBuilder()
                .withId(generateId())
                .withName(inputName())
                .withAddress(inputAdress())
                .withBirth(inputBirth())
                .withEmail(inputEmail())
                .withPhone(inputPhone())
                .withExpInYear(inputExperience())
                .withProSkill(inputProSkill()).build();
    }
    @Override
    public List<Candicate> findAllByName(String name) {
        return super.findByName(experienceList, name);
    }
    @Override
    public void displayAll() {
        System.out.println(TITTLE_EXPERIENCE);
        for(Candicate c: experienceList){
            System.out.println(c.getName());
        }
    }
    int inputExperience(){
        int exp;
        while (true){
            try {
                System.out.println("Nhap kinh nghiem cua ung vien");
                exp = Integer.parseInt(SC.nextLine());
                if (isExperienceValid(exp)) {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println(NUMBER_FORMAT_ERROR);
            }
        }
        return exp;
    }
    String inputProSkill(){
        System.out.println("Ky nang chuyen mon cua ung vien");
        return SC.nextLine();
    }
}
