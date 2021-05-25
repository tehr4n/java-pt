package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String malicious_data = "../../../../../etc/passwd";
        malicious_data = malicious_data.replace("../", "");

        System.out.println(malicious_data);


    }
}
