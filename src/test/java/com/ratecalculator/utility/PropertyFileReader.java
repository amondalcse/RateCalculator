package com.ratecalculator.utility;

import com.ratecalculator.commonmethods.GenricMethods;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import  static com.ratecalculator.utility.PropertyFileReader.config;


public class PropertyFileReader
{
    public static Properties config;
    public static String RootDir = GenricMethods.getRootDirectory();

    public static void loadProperties() {
        config = new Properties();

        try {
            InputStream input1 = new FileInputStream(RootDir + "/RateCalculator/config.properties");
            config.load(input1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
