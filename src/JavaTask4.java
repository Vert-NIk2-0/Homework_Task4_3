public class JavaTask4 {
    public static void main(String[] args) {
        String s = "Привет, я учу язык программирования Java";
        System.out.println(s);

        System.out.println(replace(s));
    }

    public static String replace(String s) {
        String[] stringMass = s.split(" ");
        char[] charMass;
        for (int i = 0; i < stringMass.length; i++) {
            if (stringMass[i].length() > 3) {
                if (stringMass[i].length() > 6) {
                    charMass = stringMass[i].toCharArray();
                    if ((charMass[3] >= 'A' && charMass[3] <= 'Z') || (charMass[3] >= 'a' && charMass[3] <= 'z') || (charMass[3] >= 'А' && charMass[3] <= 'Я') || (charMass[3] >= 'а' && charMass[3] <= 'я')) {
                        charMass[3] = '#';
                    }
                    if ((charMass[6] >= 'A' && charMass[6] <= 'Z') || (charMass[6] >= 'a' && charMass[6] <= 'z') || (charMass[6] >= 'А' && charMass[6] <= 'Я') || (charMass[6] >= 'а' && charMass[6] <= 'я')) {
                        charMass[6] = '#';
                    }
                    stringMass[i] = String.valueOf(charMass);
                }else {
                    charMass = stringMass[i].toCharArray();
                    if ((charMass[3] >= 'A' && charMass[3] <= 'Z') || (charMass[3] >= 'a' && charMass[3] <= 'z') || (charMass[3] >= 'А' && charMass[3] <= 'Я') || (charMass[3] >= 'а' && charMass[3] <= 'я')) {
                        charMass[3] = '#';
                    }
                    stringMass[i] = String.valueOf(charMass);
                }
            }
        }

        StringBuilder resultString = new StringBuilder();
        for (String elem : stringMass) {
            resultString.append(elem).append(" ");
        }
        return resultString.toString();
    }
}
