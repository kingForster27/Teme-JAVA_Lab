package org.ieti.lucrarea6;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtility {

    public static void deserializeFromXML() {
        try {
            XmlMapper xmlMapper = new XmlMapper();

            String readContent = new String(Files.readAllBytes(Paths.get("src/main/resources/plan.xml")));
            SubscriptionPlan deserializedData = xmlMapper.readValue(readContent, SubscriptionPlan.class);

            System.out.println("Deserialized data: ");
            System.out.println("\tPrice: " + deserializedData.getPrice());
            System.out.println("\tPlan: " + deserializedData.getDescription());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

