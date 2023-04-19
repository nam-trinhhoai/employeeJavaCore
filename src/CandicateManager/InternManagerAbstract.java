package CandicateManager;

import Candicate.Candicate;
import Candicate.Intern;

import java.util.List;

import static Constant.Constant.*;


public class InternManagerAbstract extends AbstractCandicateManager<Intern> {

    @Override
    public Intern addCandicate() {
        return new Intern.InternBuilder()
                .withId(generateId())
                .withName(inputName())
                .withAddress(inputAdress())
                .withBirth(inputBirth())
                .withEmail(inputEmail())
                .withPhone(inputPhone())
                .withEducation(inputEducation())
                .withSemester(inputSemester())
                .withSpecialize(inputSpecialize())
                .build();
    }

    @Override
    public void displayAll() {
        System.out.println(TITTLE_INTERN);
        for(Candicate c: internList){
            System.out.println(c.getName());
        }
    }

    @Override
    public List<Candicate> findAllByName(String name) {
        return super.findByName(internList, name);
    }

    String inputSemester(){
        return SC.nextLine();
    }
    String inputSpecialize(){
        return SC.nextLine();
    }
    String inputEducation(){
        return SC.nextLine();
    }
}
