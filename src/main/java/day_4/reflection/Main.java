package day_4.reflection;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        User user=new User("InitName");
        System.out.println(get(user,"name"));
        put(user,"name","SecondName");
        System.out.println(get(user,"name"));
    }

    private static void put(User object, String fieldName, Object value) {
        for(Field f:object.getClass().getDeclaredFields()){
            if(f.getName().equals(fieldName)){
                try {
                    f.setAccessible(true);
                    f.set(object,value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static Object get(Object object, String fieldName) {
        for(Field f:object.getClass().getDeclaredFields()){
            if(f.getName().equals(fieldName)){
                try {
                    f.setAccessible(true);
                    return f.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
