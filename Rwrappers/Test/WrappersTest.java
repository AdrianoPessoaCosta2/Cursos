package br.com.abc.javacore.Rwrappers.Test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 12;
        short shortPreimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = new Integer("10");
        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = new Float("10");
        Double doubleWrapper = 20D;
        Character characteWrapper = 'A';
        Boolean booleanWapper = new Boolean("True");

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('9'));

//
//        int i = integerWrapper;
//
//        String valor = "10";
//        Float f = Float.parseFloat(valor);
//        System.out.println(f +longPrimitivo);



    }
}
