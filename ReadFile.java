package FileProgram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Acer\\Mybase\\src\\FileProgram\\text");
        String arr[] = new String[1000];

        Scanner v = new Scanner(file);
        int j = 0;
        while (v.hasNext()) {
            String s = v.nextLine();
                arr[j] = s;
                j++;

            if (j==1000)break;
        }
        int casa = 0;
        for (int i = 0; i < j; i++) {
if (arr[i]==""){
    continue;
}
else {
    System.out.println("[" + casa + "]" + arr[i]);
    casa++;
}


        }
    }
}
