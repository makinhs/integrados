package model;

public class Utils {

    public static boolean containOnlyLetters(String word) {
        if (word.toLowerCase().matches("^[a-zA-ZéúíóáÉÚÍÓÁèùìòàÈÙÌÒÀõãñÕÃÑêûîôâÊÛÎÔÂëÿüïöäËYÜÏÖÄ\\s]*$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidMail(String email) {
        if (email.toLowerCase().matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidCpf(String cpfString) {
        int cpf[] = new int[11], dv1 = 0, dv2 = 0;

        cpfString = cpfString.replace(".", "");
        cpfString = cpfString.replace("-", "");

        if (cpfString.length() != 11)
            return false;

        for (int i = 0; i < 11; i++)
            cpf[i] = Integer.parseInt(cpfString.substring(i, i + 1));
        for (int i = 0; i < 9; i++)
            dv1 += cpf[i] * (i + 1);
        cpf[9] = dv1 = dv1 % 11;
        for (int i = 0; i < 10; i++)
            dv2 += cpf[i] * i;
        cpf[10] = dv2 = dv2 % 11;
        if (dv1 > 9)
            cpf[9] = 0;
        if (dv2 > 9)
            cpf[10] = 0;

        if (Integer.parseInt(cpfString.substring(9, 10)) != cpf[9] || Integer.parseInt(cpfString.substring(10, 11)) != cpf[10]) {
            return false;
        } else {
            return true;
        }
    }
}
