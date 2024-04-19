package demoBarbearia.src.main.java.com.inter;

public class Menu {
    public void navegarMenu(int pagina){
        switch (pagina) {
            case 1: navegarServicos();          break;
            case 2: navegarFeedback();          break;
            case 3: navegarChat();              break;
            case 4: navegarCartaoFidelidade();  break;
            case 5: navegarConteudoEducativo(); break;
            default: break;
        }
    }

    public void navegarServicos(){

    }

    public void navegarFeedback(){

    }

    public void navegarChat(){

    }

    public void navegarCartaoFidelidade(){

    }

    public void navegarConteudoEducativo(){
        
    }
}
