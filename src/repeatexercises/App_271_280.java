package repeatexercises;

public class App_271_280 {

    public static void main(String[] args) {
        char[] chars = {'a', 'd', 'v', 'b', 'f', 'b', 'w','f' ,'d'};
        App_271_280 app_271_280 = new App_271_280();
        System.out.println(app_271_280.app272(chars));
        System.out.println(app_271_280.app274(chars));
        System.out.println(app_271_280.app277(chars));
        System.out.println(app_271_280.app280(chars));
    }

    public boolean app272(char[] chars) {

        boolean t = false;
        int count = 0;
        for (char aChar : chars) {
            if (aChar == 'b') {
                count++;
            }
        }
        if (count >= chars.length / 2) t = true;
        return t;


    }

    public double app274(char[] chars) {
        int count = 0;
        int indexSUm = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 'h') {
                count++;
                indexSUm += i;
            }
        }
        if (count == 0) return 0;

        return (float) indexSUm / count;


    }

    public char[] app277(char[] chars) {
        int count = 0;
        for (char aChar : chars) {
            if (aChar != 'd') {
                count++;
            }
        }
        char[] newArray = new char[count];
        int index = 0;
        for (char aChar : chars) {
            if (aChar != 'd') {
                newArray[index] = aChar;
                index++;
            }
        }
        return newArray;
    }

    public char[] app280(char[] chars) {
        int count = 0;
        for (char aChar : chars) {
            if (aChar == 'f') {
                count++;
            }
        }
        if (count == 0) return chars;
        char[] arrayWithF = new char[chars.length + count];
        int index =0;
        for (char aChar : chars) {
            arrayWithF[index] = aChar;
            if (aChar == 'f') {
                    arrayWithF[++index] = aChar;
            }
            index++;
        }
        return  arrayWithF;
    }
}
