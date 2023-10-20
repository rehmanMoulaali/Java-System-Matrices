package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        sigar sigar=new sigar();
        try {
            System.out.println(sigar.getCpuPerc().getCombined() * 100);
        }catch (Exception e){}

    }
}