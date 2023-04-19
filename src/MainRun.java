import Candicate.Candicate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static CheckValidFunction.CheckIsValid.*;
import static Constant.Constant.*;
import static ReadAndWriteFile.ReadAndWrite.writeAllItemsToFile;


public class MainRun {

    public static void main(String[] args) throws IOException {
        OUTER:
        while (true) {
            mainMenu();
            int choice;
            while (true) {
                try {

                    choice = Integer.parseInt(SC.nextLine());
                    if (choice > 0 && choice < MAIN_MENU_CHOICE.length + 1) {
                        break;
                    } else {
                        System.out.println(OUT_OF_CHOICE);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(NUMBER_FORMAT_ERROR);
                }
            }
            switch (choice) {
                case 1:
                    experienceChoice();
                    break;
                case 2:
                    fresherChoice();
                    break;
                case 3:
                    internChoice();
                    break;
                case 4:
                    searchChoice();
                    break;
                default:
                    break OUTER;
            }

        }
    }
    static void mainMenu(){
        System.out.println(TITTLE);
        int i;
        for(i = 0; i< MAIN_MENU_CHOICE.length; i++){
            System.out.println((i+1) + ". "+ MAIN_MENU_CHOICE[i]);
        }
    }

    static void experienceChoice(){
        List<Candicate> newExperience = new ArrayList<>();
        do {
            newExperience.add(experienceManger.addCandicate());
            System.out.println("bạn có muốn tiếp tục không (Y/N)");
            String choice= SC.nextLine();
            choice =isConfirmationValid(choice);
            if (Arrays.asList(DENY).contains(choice)){
                break;
            }
        }while (true);
        experienceList.addAll(newExperience);
        for(Candicate s:newExperience){
            System.out.println(s.toString());
        }
    }

    static void fresherChoice(){
        List<Candicate> newFresher = new ArrayList<>();
        do {
            newFresher.add(fresherManager.addCandicate());
            System.out.println("bạn có muốn tiếp tục không (Y/N)");
            String choice= SC.nextLine();
            choice =isConfirmationValid(choice);
            if (Arrays.asList(DENY).contains(choice)){
                break;
            }
        }while (true);
        fresherList.addAll(newFresher);
        for(Candicate s:newFresher){
            System.out.println(s.toString());
        }
    }
    static void internChoice(){
        List<Candicate> newIntern = new ArrayList<>();
        do {
            newIntern.add(internManager.addCandicate());
            System.out.println("bạn có muốn tiếp tục không (Y/N)");
            String choice= SC.nextLine();
            choice =isConfirmationValid(choice);
            if (Arrays.asList(DENY).contains(choice)){
                break;
            }
        }while (true);
        internList.addAll(newIntern);
        for(Candicate s:newIntern){
            System.out.println(s.toString());
        }
    }

    static void searchChoice(){
        experienceManger.displayAll();
        fresherManager.displayAll();
        internManager.displayAll();
        List<Candicate> found = new ArrayList<>();
        String name = SC.nextLine();
        found.addAll(experienceManger.findAllByName(name));
        found.addAll(fresherManager.findAllByName(name));
        found.addAll(internManager.findAllByName(name));
        for(Candicate c:found){
            System.out.println(c.toStringByType());
        }
    }
}


