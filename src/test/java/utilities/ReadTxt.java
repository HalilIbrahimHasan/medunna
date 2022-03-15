package utilities;

import pojos.Registrant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {



    public static List<String> getSSNIDs(){
        List <String > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("database_registrant_data"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();//856-45-6789,

            while(line != null){

                String ssn = line.split(",")[0];
                list.add(ssn);

                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }




    public static List<String> getAPISSNIDs(){
        List <String > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("api_all_registrant_data"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();//856-45-6789,

            while(line != null){

                String ssn = line.split(",")[2];
                list.add(ssn);

                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }



    public static List<Registrant> getAllRegistrants(){
        List <Registrant > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("api_all_registrant_data"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();//856-45-6789,

            while(line != null){
                Registrant registrant = new Registrant();


                registrant.setFirstName(line.split(",")[0]);
                registrant.setLastName(line.split(",")[1]);
                registrant.setSsn(line.split(",")[2]);
                registrant.setLogin(line.split(",")[3]);
                if(line.split(",")[4] != null) {
                    String  id = line.split(",")[4];
                    boolean flag = true;
                    for(int i=0; i<id.length();i++){
                        if(id.charAt(i) >= '0' && id.charAt(i) <= '9'){
                            flag = true;
                        }else{
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                    registrant.setId(Integer.parseInt(line.split(",")[4]));
                }
                if(line.split(",")[5] != null)
                    registrant.setEmail(line.split(",")[5]);

                list.add(registrant);

                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }





}
