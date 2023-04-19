package Constant;

import Candicate.Candicate;
import CandicateManager.AbstractCandicateManager;
import CandicateManager.ExperienceManagerment;
import CandicateManager.FresherManagerAbstract;
import CandicateManager.InternManagerAbstract;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Constant {
    public static final String TITTLE_EXPERIENCE = "===========ỨNG VIÊN CÓ KINH NGHIỆM============";
    public static final String TITTLE_FRESHER = "==========ỨNG VIÊN FRESHER==============";
    public static final String TITTLE_INTERN = "==========ỨNG VIÊN THỰC TẬP SINH==============";
    public static final Scanner SC = new Scanner(System.in);
    // cac su lua chon
    public static final  String[] MAIN_MENU_CHOICE = {"Có kinh nghiệm","Fresher","Thực tập sinh",
            "Đang tìm kiếm","Thoát"};
    public static final String OUT_OF_CHOICE = "khong co su lua chon do dau nha";
    // khi người dùng nhập sai format
    public static final String NUMBER_FORMAT_ERROR = "xin moi nhap lai";
    // tiêu đề chương trình
    public static final String TITTLE ="HỆ THỐNG QUẢN LÝ ỨNG VIÊN";

    // lựa chọn confirm những gì muốn làm
    public static final String[] CONFIRM = {"y","Y"};
    // lựa chọn khác nếu bạn muốn quay xe
    public static final String[] DENY = {"n","N"};

    public static List<Candicate> fresherList = new ArrayList<>();
    public static List<Candicate> internList = new ArrayList<>();
    public static List<Candicate> experienceList = new ArrayList<>();
    public static AbstractCandicateManager fresherManager = new FresherManagerAbstract();
    public static AbstractCandicateManager experienceManger = new ExperienceManagerment();
    public static AbstractCandicateManager internManager = new InternManagerAbstract();

    public static final String[] GRANDUATE_RANK = {"Xuất Sắc", "Tốt", "Khá","Kém"};
    public static final ArrayList<String> ID_LIST = new ArrayList<>();
    public static final String FILENAME = "candicate.txt";
}
