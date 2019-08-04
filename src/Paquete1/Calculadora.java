/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author mely_
 */
public class Calculadora {
    int N1;
    int N2;
    int R;
       
Calculadora (){
this.N1 = 0;
this.N2 = 0;
}

    public int getN1() {
        return N1;
    }

    public void setN1(int n1) {
        this.N1 = n1;
    }

    public int getN2() {
        return N2;
    }

    public void setN2(int n2) {
        this.N2 = n2;
    }

    public int getR() {
        return R;
    }
    
public void Suma (){

R=N1+N2;
}

public void Resta(){
    
R=N1-N2;         
}

public void Multiplicación (){
R=N1*N2;
}
public void Division (){
R=N1/N2;
}    
    
}
