public class Televisao{
    private String  marca,tipo;
    private boolean ligada, mutado;
    private int     tamanho, voltagem, canal, volume, volumeTemp;

    public Televisao(String ma, int ta, int vo, String ti){
        marca      = ma;
        tamanho    = ta;
        voltagem   = vo;
        tipo       = ti;
        ligada     = false;
        volume     = 0;
        volumeTemp = 0;
        canal      = 0;
        mutado     = false;
    }

    public void setMarca(String novaMarca){
        marca = novaMarca;
    }
    public void setTamanho(int novoTamanho){
        tamanho = novoTamanho;
    }
    public void setVoltagem(int novoVoltagem){
        voltagem = novoVoltagem;
    }
    public void setTipo(String novoTipo){
        tipo = novoTipo;
    }
    public void setLigada(boolean novaLigada){
        ligada = novaLigada;
    }
    public void setVolume(int novoVolume){
        volume = novoVolume;
    }
    public void setVolumeTemp(int novoVolumeTemp){
        volumeTemp = novoVolumeTemp;
    }
    public void setCanal(int novoCanal){
        canal = novoCanal;
    }
    public void setMutado(boolean novoMutado){
        mutado = novoMutado;
    }


    public String getMarca(){
        return marca;
    }
    public int getTamanho(){
        return tamanho;
    }
    public int getVoltagem(){
        return voltagem;
    }
    public String getTipo(){
        return tipo;
    }
    public boolean isLigada(){
        return ligada;
    }
    public int getVolume(){
        return volume;
    }
    public int getVolumeTemp(){
        return volumeTemp;
    }
    public int getCanal(){
        return canal;
    }
    public boolean isMutado(){
        return mutado;
    }

    void ligar(){
        if (!ligada){
            ligada = true;
            System.out.println("TV " + marca + " ligada.");
        }
        else{
            ligada = false;
            System.out.println("TV " + marca + " desligada.");
        }
    }

    void volumeMais(){
        if (ligada){
            volume++;
            mutado = false;
            System.out.println("Volume: " + volume);
        }
        else{
            System.out.println("Favor ligar a TV " + marca + " antes.");
        }
    }

    void volumeMenos(){
        if (ligada){
            volume--;
            mutado = false;
            System.out.println("Volume: " + volume);
        }
        else{
            System.out.println("Favor ligar a TV " + marca + " antes.");
        }
    }

    void mute(){
        if (ligada && !mutado){
            volumeTemp = volume;
            volume = 0;
            mutado = true;
            System.out.println("Volume: Mute");
        }else if (ligada && mutado){
            mutado = false;
            volume = volumeTemp;
            System.out.println("Volume: " + volume);
        }
        else{
            System.out.println("Favor ligar a TV " + marca + " antes.");
        }
    }

    void canalMais(){
        if (ligada){
            canal++;
            System.out.println("Canal: " + canal);
        }
        else{
            System.out.println("Favor ligar a TV " + marca + " antes.");
        }
    }
    
    void canalMenos(){
        if (ligada){
            canal--;
            System.out.println("Canal: " + canal);
        }
        else{
            System.out.println("Favor ligar a TV " + marca + " antes.");
        }
    }
}