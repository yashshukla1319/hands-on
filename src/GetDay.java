import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

class FindDay {
    public static String findDay(int month, int day, int year) {
        /*Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();
        year = sc.nextInt();*/
        Calendar cal = Calendar.getInstance();
        cal.set(month, day, year);
        int ans = cal.get(Calendar.DAY_OF_WEEK);
        String name="x";
        switch(ans){
            case 1:
                name="SUNDAY";
                break;
            case 2:
                name="MONDAY";
                break;
            case 3:
                name="TUESDAY";
                break;
            case 4:
                name="WEDNESDAY";
                break;
            case 5:
                name="THURSDAY";
                break;
            case 6:
                name="FRIDAY";
                break;
            case 7:
                name="SATURDAY";
                break;
        }
        return name;
    }

}

class GetDay {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = FindDay.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
