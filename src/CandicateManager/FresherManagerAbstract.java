package CandicateManager;

import Candicate.Candicate;
import Candicate.Fresher;

import java.util.List;
import static CheckValidFunction.CheckIsValid.*;
import static Constant.Constant.*;

public class FresherManagerAbstract extends AbstractCandicateManager<Fresher> {
    @Override
    public Fresher addCandicate() {

        Fresher f= new Fresher.FresherBuilder()
                .withId(generateId())
                .withName(inputName())
                .withAddress(inputAdress())
                .withBirth(inputBirth())
                .withEmail(inputEmail())
                .withPhone(inputPhone())
                .withEducation(inputEducation())
                .withGraduationRank(inputGraduationRank())
                .build();
        f.setGraduationDate(inputGraduationDate(f));
        return f;
    }
    @Override
    public void displayAll() {
        System.out.println(TITTLE_FRESHER);
        for(Candicate c: fresherList){
            System.out.println(c.getName());
        }
    }

    @Override
    public List<Candicate> findAllByName(String name) {
        return super.findByName(fresherList, name);
    }

    String inputGraduationDate(Candicate s){
        int graduateDate;
        while (true){
            try {
                System.out.println("Nhap nam tot nghiep cua ung vien");
                graduateDate = Integer.parseInt(SC.nextLine());
                if (isGraduateDateValid(graduateDate, Integer.parseInt(s.getBirth()))) {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println(NUMBER_FORMAT_ERROR);
            }
        }
        return graduateDate+"";
    }
    String inputEducation(){
        System.out.println("nhap truong dai hoc cua ung vien");
        return SC.nextLine();
    }
    String inputGraduationRank(){
        int rank;
        System.out.println("Chọn Xếp Hạng tốt nghiệp của ứng viên: ");
        for (int i = 0; i< GRANDUATE_RANK.length; i++){
            System.out.println((i+1) + " " + GRANDUATE_RANK[i]);
        }
        while (true){
            try{
                rank = Integer.parseInt(SC.nextLine());
                if(isGraduateRankValid(rank)){
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("xin moi chon lai: ");
            }
        }
        return GRANDUATE_RANK[rank];
    }
}
