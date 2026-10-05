/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.jogodavelha;

/**
 *
 * @author daniel62977606
 */
public class Tabuleiro {
    private int notaJ1;
    private int notaJ2;
    private String regras;
    private boolean houveGanhadorUltimaRodada;
    private int jogadorDaVez;

    public int getJogadorDaVez() {
        return jogadorDaVez;
    }

    public void setJogadorDaVez(int jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }

    public boolean isHouveGanhadorUltimaRodada() {
        return houveGanhadorUltimaRodada;
    }

    public void setHouveGanhadorUltimaRodada(boolean houveGanhadorUltimaRodada) {
        this.houveGanhadorUltimaRodada = houveGanhadorUltimaRodada;
    }

    public int getNotaJ1() {
        return notaJ1;
    }

    public void setNotaJ1(int notaJ1) {
        this.notaJ1 = notaJ1;
    }

    public int getNotaJ2() {
        return notaJ2;
    }

    public void setNotaJ2(int notaJ2) {
        this.notaJ2 = notaJ2;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public Tabuleiro(String regras) {
        this.regras = regras;
        this.notaJ1 = 0;
        this.notaJ2 = 0;
        this.houveGanhadorUltimaRodada = false;
        this.jogadorDaVez = 1;
    }
    
    public void verificarGanhador(){
        
    }
    
    public void organizar(){
        
    }
    
    public void mostrarTabuleiro(){
        System.out.println("""
                                  |       |       
                              A1  |   B1  |   C1                             
                                  |       |       
                           -------+-------+-------
                                  |       |       
                              A2  |   B2  |   C2   
                                  |       |       
                           -------+-------+-------
                                  |       |       
                              A3  |   B3  |   C3   
                                  |       |         
                           """);
    }
    
}
