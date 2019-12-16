package com.epam.decoration.model.db;

import com.epam.decoration.model.entity.decor.Decor;
import com.epam.decoration.model.service.gson.DecorJsonService;


import java.util.List;

public class Necklace {
    private List<Decor> decors;

    public Necklace() {
    }

    public Necklace(List<Decor> decors) {
        this.decors = decors;
    }

    public List<Decor> getDecors() {
        if (decors == null) {
            decors = DecorJsonService.fromJson("data.txt");
        }
        return decors;
    }

    public void loadDecorsFromFile(String file) {
        decors = DecorJsonService.fromJson(file);
    }
    //    public void readDataFromFile() throws IOException, ParseException {
//            File file = getFileFromResources("data.txt");

//        JSONParser parser = new JSONParser();
//        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(file));
//
//        for (Object o : jsonArray)
//        {
//            JSONObject decor = (JSONObject) o;
//
//            String weight = (String) decor.get("weight");
//            String cost = (String) decor.get("cost");
//            String transparency = (String) decor.get("transparency");
//            String origin = (String) decor.get("decorate_origin");
//            String stoneType = (String) decor.get("stoneType");
//
//            for (Object c : cars)
//            {
//                System.out.println(c+"");
//            }
//        }

//        List<Decor> result = new ArrayList<Decor>();

//        try{
//            String text = new String(Files.readAllBytes(Paths.get(file.toURI())), StandardCharsets.UTF_8);
//
//            JSONObject obj = new JSONObject(text);
//            JSONArray arr = obj.getJSONArray("decors");
//
//            for(int i = 0; i < arr.length(); i++){
//                int weight = Integer.parseInt(arr.getJSONObject(i).getString("weight"));
//                int cost = Integer.parseInt(arr.getJSONObject(i).getString("cost"));
//                int transparency = Integer.parseInt(arr.getJSONObject(i).getString("transparency"));
//                String origin = arr.getJSONObject(i).getString("decorate_origin");
//                String stoneType = arr.getJSONObject(i).getString("stoneType");
//
//
//
//                if (position.compareToIgnoreCase("manager") == 0){
//                    result.add(new Manager(name, salary, position, years_in_company));
//                }
//                else{
//                    result.add(new OrdinaryEmployee(name, salary, position, years_in_company));
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex.toString());
//        }

//    }

    // get file from classpath, resources folder

//    private File getFileFromResources(String fileName) throws IllegalArgumentException {
//        ClassLoader classLoader = getClass().getClassLoader();
//        URL resource = classLoader.getResource(fileName);
//        if (resource == null) {
//            throw new IllegalArgumentException("file is not found!");
//        } else {
//            return new File(resource.getFile());
//        }
//    }
}
