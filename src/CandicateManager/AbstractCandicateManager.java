package CandicateManager;
import Candicate.Candicate;
import java.util.ArrayList;
import java.util.List;

import static CheckValidFunction.CheckIsValid.*;
import static Constant.Constant.*;

public abstract class AbstractCandicateManager<T extends Candicate> {
    public  abstract T addCandicate();
    public abstract void displayAll();
    public abstract List<Candicate> findAllByName(String name);

    protected List<Candicate> findByName(List<Candicate> candicates, String name){
        List<Candicate> list =new ArrayList<>();
        for( Candicate c:candicates){
            if(c.getName().contains(name)){
                list.add(c);
            }
        }
        return list;
    }

    protected String inputName(){
        System.out.println("Cho minh xin ten ung vien");
        String name = SC.nextLine();
        return name;
    }
    protected String inputAdress(){
        System.out.println("Nhap dia chi cua ung vien");
        String addr = SC.nextLine();
        return addr;
    }
    protected String inputEmail(){
        String email;
        do {
            System.out.println("Nhap email cua ung vien");
            email = SC.nextLine();
        } while (!patternMatches(email));
        return email;
    }
    protected String inputBirth(){
        String birth;
        while (true) {
            try {
                System.out.println("Nhap nam sinh cua ung vien");
                birth = SC.nextLine();
                if (isBirthValid(Integer.parseInt(birth))){
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println(NUMBER_FORMAT_ERROR);
            }
        }
        return birth;
    }
    protected String inputPhone(){
        String phone;
        while (true) {
            try {
                System.out.println("Nhap so dien thoai cua ung vien");
                phone = SC.nextLine();
                Long.parseLong(phone);
                if (isPhoneValid(phone)){
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println(NUMBER_FORMAT_ERROR);
            }
        }
        return phone;
    }
    protected String generateId(){
        String s;
        do {
            s = "" + ((long) (Math.random() * 1000000));
        } while (ID_LIST.contains(s));
        return s;
    }
}
