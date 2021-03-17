





/**



DISCLAIMER: SOME OF THE WORST JAVA CODE I'VE EVER WRITTEN, IF YOU HATE BLEACHING YOUR EYES, TURN BACK NOW, YOU'VE BEEN WARNED.
I DID THIS BECAUSE IT WAS QUICK




/**




















/**
get the bleach ready
/**













































package com.itzblaze;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        List<String> stringList = new ArrayList<>();
        Date start;
        List<Float> floats = new ArrayList<>();
        final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        start = format.parse("2019-10-01");
        float price = 7.500f;
        String start_date = format.format(start);
        stringList.add(start_date);
        float pre_boost_value = 0f;
        int count = 0;
        for(int i = 0; i < 574; i++) {
            final Calendar c = Calendar.getInstance();
            c.setTime(format.parse(start_date));
            c.add(Calendar.DATE,1);
            start_date = format.format(c.getTime());
            stringList.add(format.format(c.getTime()));
            if(c.getTime().getYear() == 119) {
                price -= randFloat(0.009f,0.02f);
            }
            if(c.getTime().getYear() == 120 && c.getTime().getMonth() == 0)
            {
                count++;
                System.out.println("dump it");
                price -= randFloat(0.009f,0.29f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 120 && c.get(Calendar.DAY_OF_MONTH) == 12 && c.getTime().getMonth() == Calendar.MAY) {
                pre_boost_value = price;
                price += randFloat(0.68f,1.41f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 120 && c.get(Calendar.DAY_OF_MONTH) == 13 && c.getTime().getMonth() == Calendar.MAY) {
                price = pre_boost_value;
                price += randFloat(0.009f,0.001f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 120 && c.get(Calendar.DAY_OF_MONTH) >= 14 && c.getTime().getMonth() == Calendar.MAY) {
                price = pre_boost_value;
                price -= randFloat(0.006f,0.0145f);
                floats.add(price);
                continue;
            }


            if(c.getTime().getYear() == 121 && c.getTime().getMonth() == Calendar.MARCH) {
                price -= randFloat(0.007f,0.0101f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 120 && c.getTime().getMonth() == Calendar.MAY) {
                if(c.get(Calendar.DAY_OF_MONTH) >= 13) {
                    price -= randFloat(0.0009f,0.007f);
                    floats.add(price);
                    continue;
                }
                price += randFloat(0.007f,0.0689f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 120 && c.getTime().getMonth() == Calendar.AUGUST && c.get(Calendar.DAY_OF_MONTH) >= 11) {
                price += randFloat(0.009f,0.02f);
                floats.add(price);
                continue;
            }
            if(c.getTime().getYear() == 120 && c.getTime().getMonth() >= Calendar.JANUARY && c.getTime().getMonth() <= Calendar.APRIL) {
                price -= randFloat(0.009f,0.0109f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 121 && c.getTime().getMonth() == Calendar.MARCH && c.get(Calendar.DAY_OF_MONTH) >= 16) {
                price += randFloat(-0.0006f,0.01f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 120 && c.getTime().getMonth() == Calendar.SEPTEMBER) {
                price += randFloat(0.006f,0.009f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 120 && c.getTime().getMonth() == Calendar.DECEMBER) {
                price += randFloat(0.004f,0.02f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 121 && c.getTime().getMonth() == Calendar.JANUARY) {
                price -= randFloat(0.006f,0.01f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 121 && c.get(Calendar.DAY_OF_MONTH) == 21 && c.getTime().getMonth() == Calendar.FEBRUARY) {
                price += randFloat(0.004f,0.009f);
                floats.add(price);
                continue;
            }

            if(c.getTime().getYear() == 121 && c.getTime().getMonth() >= Calendar.FEBRUARY) {
                price -= randFloat(0.002f,0.008f);
                floats.add(price);
                continue;
            }

            if(price <= 0.09f) {
                float random = randFloat(1f,2f);
                if(random == 1) {
                    price += 0.009;
                    floats.add(price);
                    continue;
                }
            }





            if(c.getTime().getMonth() <= 3) {
                price -= randFloat(0.0006f, 0.009f);
            } else if(c.getTime().getMonth() >= 4 && c.getTime().getMonth() <= 6) {
                price -= randFloat(0.0009f, 0.005f);
            } else if(c.getTime().getMonth() >= 7) {
                price -= randFloat(0.0008f, 0.009f);
            } else if(c.getTime().getYear() == 120 && c.getTime().getMonth() <= 2 && price > 0.8) {
                price -= 0.60;
            } else {
                price -= randFloat(0.007f,0.001f);
            }
            floats.add(price);
        }
        StringBuilder builder = new StringBuilder();
        for (String entry : stringList) {
            builder.append("\"" + entry + "\"" + ",");
        }
        File file = new File("C:\\bari\\loggers\\test.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(builder.toString());
        writer.close();
        StringBuilder builders = new StringBuilder();
        for (float entry : floats) {
            System.out.println(entry + ",");
            builders.append("\"" + entry + "\"" + ",");
        }
        File files = new File("C:\\bari\\loggers\\prices.txt");
        BufferedWriter writers = new BufferedWriter(new FileWriter(files));
        writers.write(builders.toString());
        writers.close();
    }

    public static float randFloat(float min, float max) {

        Random rand = new Random();

        return rand.nextFloat() * (max - min) + min;

    }

}
