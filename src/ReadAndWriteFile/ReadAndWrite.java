package ReadAndWriteFile;

import Candicate.Candicate;
import Candicate.Fresher;
import Candicate.Intern;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static Constant.Constant.*;


public class ReadAndWrite {
    public static void writeAllItemsToFile(List<Candicate> list) throws IOException {
        try {
            try (FileWriter fw = new FileWriter(FILENAME, true);
                 BufferedWriter bw = new BufferedWriter(fw)) {

                for (Candicate p : list) {
                    String s = p.toString().replace(" | ", "\t");
                    if (p instanceof Fresher) {
                        bw.write(s+ "\t fresher\n");
                    }else if(p instanceof Intern) bw.write(s+ "\t intern\n");
                    else bw.write(s+ "\t experience\n");
                }
            }
        } catch (NullPointerException e) {
        }
    }

    public static void readAllItemsFromFile(List<Candicate> list) throws IOException {
        try {
            try (FileWriter fw = new FileWriter(FILENAME, true);
                 BufferedWriter bw = new BufferedWriter(fw)) {

                for (Candicate p : list) {
                    String s = p.toString().replace(" | ", "\t");
                    if (p instanceof Fresher) {
                        bw.write(s+ "\t fresher\n");
                    }else if(p instanceof Intern) bw.write(s+ "\t intern\n");
                    else bw.write(s+ "\t experience\n");
                }
            }
        } catch (NullPointerException e) {
        }
    }
}
