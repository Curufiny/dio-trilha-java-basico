package devices.multidevices;

import devices.internet.navegadorInternet;
import devices.ipod.reprodutorMusical;
import devices.telefone.aparelhoTelefonico;

public class celularIphone implements navegadorInternet, reprodutorMusical, aparelhoTelefonico {
   
    public void exibirPagina(){
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void tocar(){
        System.out.println("TOCANDO");
    }

    public void pausar(){
        System.out.println("PAUSANDO");
    }

    public void selecionarMúsica(){
        System.out.println("SELECIONANDO MÚSICA");
    }

    public void ligar(){
        System.out.println("LIGANDO");
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void correioDeVoz(){
        System.out.println("CORREIO DE VOZ");
    }
}



    