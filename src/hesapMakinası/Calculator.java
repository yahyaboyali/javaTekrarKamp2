package hesapMakinası;

public class Calculator {
    public int topla(int a,int b){
        return a+b;
    }
    public int cikar(int a,int b) {
        return a-b;
    }
    public int carp(int a,int b) {
        return a*b;
    }
    public float bol(int a, int b){
        if(b==0){
            System.out.println("0 geçersiz sayı");
            return -1;
        }
        return a/b;
    }
}
