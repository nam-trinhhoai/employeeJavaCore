package CheckValidFunction;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;
import static Constant.Constant.*;

public class CheckIsValid {
    /**
     * check xem email có valid không
     * @param emailAddress địa chỉ email người dùng nhập vào
     * @return nếu hợp lệ trả về true
     */
    public static boolean patternMatches(String emailAddress) {
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    /**
     * check xem số điện thoại có đúng format hay không
     * @param phone số điện thoại người dùng nhập vào
     * @return true = hợp lệ
     */
    public static boolean isPhoneValid(String phone){
        return checkLength(10,0,phone);
    }

    /**
     *
     * @param birth
     * @return
     */
    public static boolean isBirthValid(int birth){
        Date date = new Date();
        int value = birth -1900;
        return value>=0 && value<=date.getYear();
    }
    public static boolean isGraduateRankValid(int choice){
        return (choice<=GRANDUATE_RANK.length&& choice>0);
    }
    public static boolean isExperienceValid(int exp){
        return (0<=exp && exp<=100);
    }

    /**
     * kiem tra do dai chuoi phai lon hon min va nho hon max tuy nhien co truong hop ngoai le
     * @param min
     * @param max: neu max = 0: khong gioi han so luong ky tu
     * @param string
     * @return
     */
    private static boolean checkLength(int min, int max, String string){
        if(max == 0){
            return string.length()>=min;
        }else {
            return string.length()>=min&& string.length()<=max;
        }
    }
    public static boolean isGraduateDateValid(int date, int birth){
        return (date-birth>18);
    }

    public static String isConfirmationValid(String choice){
        while (true){
            if (Arrays.asList(CONFIRM).contains(choice)){
                break;
            }else if (Arrays.asList(DENY).contains(choice)){
                break;
            }
            choice = SC.nextLine();
        }
        return choice;
    }
}
