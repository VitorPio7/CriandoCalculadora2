package com.mycompany.projetocalculadora;


import static java.lang.Math.pow;

public enum EnumCalc {
  SOMAR("+") {
      @Override
      public double executarOperacao(double x, double y) throws Exception {
        return x + y;
      }
  }, SUBTRAIR("-") {
      @Override
      public double executarOperacao(double x, double y) throws Exception {
         return x -y;
      }
  },DIVIDIR("/") {
      @Override
      public double executarOperacao(double x, double y) throws Exception {
           return x/y;   
      }
  },MULTIPLICAR("*") {
      @Override
      public double executarOperacao(double x, double y) throws Exception {
          return x*y;    
      }
  }, POTENCIA("^") {
      @Override
      public double executarOperacao(double x, double y) throws Exception {
         return pow(x,y);    
      }
  
  };

    private String simbolo;

    private EnumCalc(String simbolo) {
        this.simbolo = simbolo;
    }

    
    public String toString() {
       return this.simbolo; 
    }
    
    public abstract double executarOperacao(double x, double y) throws Exception;
    

   

      
}
