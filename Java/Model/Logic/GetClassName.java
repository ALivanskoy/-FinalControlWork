package Model.Logic;

public class GetClassName {


    public static String nameRefactor(String fullClassName) {
        if (fullClassName == null) {
            return "";
        }
        int dotIndex = fullClassName.lastIndexOf('.');
        if (dotIndex == -1) {
            return "";
        }
        return fullClassName.substring(dotIndex + 1);
    }

}
