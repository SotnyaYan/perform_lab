import java.io.*;

public class task2 {
    public static void main(String[] args) throws IOException {

        String circle_path = args[0];
        String points_path = args[1];

        String line = "";
        Float pointXCenter = 1.0F;
        Float pointYCenter = 1.0F;
        Float radius = 1.0F;
        Float pointX;
        Float pointY;
        int count = 1;

        File fileCircle = new File(circle_path);
        FileReader fr = new FileReader(fileCircle);
        BufferedReader reader = new BufferedReader(fr);

        while((line = reader.readLine()) != null) {
            String[] lines = line.split(" ");
            if (count == 1) {
                pointXCenter = Float.parseFloat(lines[0]);
                pointYCenter = Float.parseFloat(lines[1]);
            } else if (count == 2){
                radius = Float.parseFloat(lines [0]);
            }
            count ++;
        }

        File filePoints = new File(points_path);
        fr = new FileReader(filePoints);
        reader = new BufferedReader(fr);


        while((line = reader.readLine()) != null) {
            String[] lines = line.split(" ");
            pointX = Float.parseFloat(lines[0]);
            pointY = Float.parseFloat(lines[1]);

            if (Math.pow((pointX-pointXCenter),2) +  Math.pow((pointY-pointYCenter),2) == radius * radius){
                System.out.println("0 - точка лежит на окружности");
            } else
            if (Math.pow((pointX-pointXCenter),2) +  Math.pow((pointY-pointYCenter),2) < radius * radius) {
                System.out.println("1 - точка внутри");
            }
            else
            if (Math.pow((pointX-pointXCenter),2) +  Math.pow((pointY-pointYCenter),2) > radius * radius) {
                System.out.println("2 - точка снаружи");
            }
        }
    }
}
