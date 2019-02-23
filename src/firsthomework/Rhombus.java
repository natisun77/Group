package firsthomework;
// 1.2
public class Rhombus {
    Rhombus() {
    }

    public static void drawRhombus(int lengthOfDiagonal) {
        char star = '*';
        char empty = ' ';

        int starCount = 0;
        for (int numbOfLine = 1; numbOfLine <= lengthOfDiagonal * 2 - 1; numbOfLine++) {
            String result = "";
            if (numbOfLine <= lengthOfDiagonal) {
                starCount++;
            } else {
                starCount--;
            }
            int index = (lengthOfDiagonal - starCount) / 2;

            for (int i = 0; i < lengthOfDiagonal; i++) {
                if (i >= index && i < index + starCount) {
                    result += star;
                } else {
                    result += empty;
                }
            }

            System.out.println(result);
        }
    }


    public static void main(String[] arg) {
        drawRhombus(5);


    }
}
