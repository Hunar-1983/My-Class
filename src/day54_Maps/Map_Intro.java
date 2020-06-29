package src.day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Hunar", 188000.0);
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Roshna", 120000.0);
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        System.out.println( employeeInfo.get("Hunar")  );
        System.out.println( employeeInfo.get("Roshna") );

        employeeInfo.remove("Roshna");
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Hunar", 190000.0);
        System.out.println(employeeInfo);

    }
}
