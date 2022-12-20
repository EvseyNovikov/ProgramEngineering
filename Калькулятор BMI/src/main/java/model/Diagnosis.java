package model;
import java.io.File;
import java.util.Scanner;
public class Diagnosis {
    int size;
    Metrics[] metrics;
    BMI bmi_value;
    public Diagnosis(int size, BMI bmi_value) {
        this.size = size;
        this.bmi_value = bmi_value;
        this.metrics = new Metrics[size];
    }
    public void fillMetrics(){

        try {
            File file = new File("C://Users/daksi/Documents/ВУЗ/5 семестр/Минакова/ПР3/BMI/src/main/java/model/1.txt");
            Scanner input = new Scanner(file);
            int i = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String message = "";
                for(int j = 2; j < line.split(" ").length; j++){
                    message += line.split(" ")[j] + " ";
                }
                String[] splitedLine = line.split(" ");
                metrics[i] = new Metrics(Float.parseFloat(splitedLine[0]), Float.parseFloat(splitedLine[1]), message,  i);
                i++;
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public String ShowDiagnosis(){
      fillMetrics();
      String message = "";

      for(int i=0; i < size; i++){
         if(metrics[i].Within(bmi_value)){
             message = metrics[i].Message + " " + "Категория - " + metrics[i].category;
         }
      }
        return message;
    }

    public String ShowMetrics(){
        String All_metrics = "";
       for(int i = 0; i < metrics.length; i++){
           All_metrics += metrics[i].Message + "\n";
       }

       return All_metrics;
    }
}


