/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06aviao;

/**
 *
 * @author hamil
 */
public class ControleAviao implements Controle {
    //Atributos
    private boolean voando;
    private boolean pousado;
    private int acelerando;
    
    //Metodos especiais

    public ControleAviao() {
        this.voando = false;
        this.pousado = true;
        this.acelerando = 25;
    }

    private boolean getVoando() {
        return voando;
    }

    private void setVoando(boolean voando) {
        this.voando = voando;
    }

    private boolean getPousado() {
        return pousado;
    }

    private void setPousado(boolean pousado) {
        this.pousado = pousado;
    }

    private int getAcelerando() {
        return acelerando;
    }

    private void setAcelerando(int acelerando) {
        this.acelerando = acelerando;
    }
    //Metodos Abstratos

    @Override
    public void ligar() {
        this.setPousado(true);
    }

    @Override
    public void desligar() {
        this.setPousado(false);
    }

    @Override
    public void ligarPainel() {
        System.out.println("O avião está pousado? " + this.getPousado());
        System.out.println("O avião esta em marcha lenta? " + this.getAcelerando());
        System.out.print("Aceleração é de: " + this.getAcelerando());
        for (int i = 0; i <= this.getAcelerando(); i += 15){
            System.out.print("/");
        }
    }

    @Override
    public void acelerarMais() {
        if (this.getPousado()){
            this.setAcelerando(this.getAcelerando()+10);
        }
    }

    @Override
    public void acelerarMenos() {
        if (this.getPousado()){
            this.setAcelerando(this.getAcelerando()-8);
        }
    }

    @Override
    public void baixarTrem() {
        if (this.getVoando() && this.getAcelerando() >25){
            this.setAcelerando(15);
        }
    }

    @Override
    public void subirTrem() {
        if (this.getPousado() && this.getAcelerando() == 60){
            this.setAcelerando(15);
        }
    }
    
    
    
}
