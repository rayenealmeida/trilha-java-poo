

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        @Override
        public void tocar() {
            System.out.println("Reproduzindo música");
        }
    
        @Override
        public void pausar() {
            System.out.println("Música em pausa");
        }
    
        @Override
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica);
        }
    
        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para " + numero);
        }
    
        @Override
        public void atender(String numero) {
            System.out.println("Atendendo chamada de " + numero);
        }
    
        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz");
        }
    
        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }
    
        @Override
        public void adicionarNovaAba(String url) {
            System.out.println("Adicionando nova aba: " + url);
        }
    
        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando página");
        }
    
        public static void main(String[] args) {
            Iphone iphone = new Iphone();
    
            iphone.tocar();
            iphone.pausar();
            iphone.selecionarMusica("Musica1.mp3");
            iphone.ligar("123456");
            iphone.atender("123456");
            iphone.iniciarCorreioVoz();
            iphone.exibirPagina("www.pagina1.com");
            iphone.adicionarNovaAba("www.pagina2.com");
            iphone.atualizarPagina();
        }
    }

