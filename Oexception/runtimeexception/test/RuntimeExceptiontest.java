package br.com.abc.javacore.Oexception.runtimeexception.test;

public class RuntimeExceptiontest {
    public static void main(String[] args) {
        Object o = null;
//        int a = 10;
////        int b = 2;
////
////        if(b!=0){
////            System.out.println(a/b);
////        }else
////            System.out.println("não pode dividir por zero");
       try{
           int[] a = new int[2];
           System.out.println(a[2]);
           System.out.println("Imprimeindo depois da possivel exeção");
        }catch(RuntimeException e) {
           e.printStackTrace();
//       }
           System.out.println("fora do bloc catc");
       }
    }
}
