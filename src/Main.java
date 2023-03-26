import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
       try{
           //Declare reader
           BufferedReader br = new BufferedReader(new FileReader("D:/My Projects/Java-Employment/src/employee.txt"));
           //Declare object name
           Employment emp;
           //Declare indata
           String indata = null;
           while((indata = br.readLine()) != null){
               //Declare stringtokenizer
               StringTokenizer st = new StringTokenizer(indata,";");
               String empName = st.nextToken();
               int empAge = Integer.parseInt(st.nextToken());
               String empSex = st.nextToken();
               String empMarital = st.nextToken();
               String empJobClass = st.nextToken();
               int empHealth = Integer.parseInt(st.nextToken());
               double empWage = Double.parseDouble(st.nextToken());

               //Create and store objects
               emp = new Employment(empName,empAge,empSex,empMarital,empJobClass,empHealth,empWage);
               System.out.println(emp);
           }

       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }
    }
}