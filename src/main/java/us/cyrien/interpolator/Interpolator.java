package us.cyrien.interpolator;

import java.lang.reflect.Field;

public interface Interpolator {

    default void print(String s) {
        Class clazz = this.getClass();
        String out = process(clazz, s);
        System.out.println(out);
    }

    default String process(Class clazz, String s) {
        String out = s;
        Field[] field = clazz.getDeclaredFields();
        try {
            for (Field field1 : field) {
                field1.setAccessible(true);
                Object fieldVal = field1.get(this);
                out = out.replaceAll("\\$" + field1.getName(), String.valueOf(fieldVal));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return out;
    }

}
