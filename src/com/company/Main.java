package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String malicious_data = "../../../../../etc/passwd";
        String traversal_string = "../";
        String traversal_string2 = "../";
        malicious_data = malicious_data.replace("../", "");
        malicious_data = malicious_data.replace("./", "");
        malicious_data = malicious_data.replace(traversal_string, "");
        malicious_data = malicious_data.replace(traversal_string2, "");

        System.out.println(malicious_data);


    }
}
