package br.com.abc.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {
        Path dir = Paths.get("home\\william");
        Path arquivo = Paths.get("dev\\arquivo.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);

        Path absoluto = Paths.get("/home/william");
        Path relatiovo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1: " +absoluto.resolve(relatiovo));
        System.out.println("2: " +absoluto.resolve(file));
        System.out.println("3: " +relatiovo.resolve(file));
        System.out.println("4: " +relatiovo.resolve(absoluto));
        System.out.println("5: " +file.resolve(absoluto));
        System.out.println("6: " +file.resolve(relatiovo));



    }
}
