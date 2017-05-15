package ua.kpi.tef.view;

public class View {
    public static void print(String message){
        System.out.println(message);
    }

    private static String concatMessage(String...message){
        StringBuilder sb = new StringBuilder();
        for (String s : message) {
            sb.append(s);
        }
        return sb.toString();
    }
}
